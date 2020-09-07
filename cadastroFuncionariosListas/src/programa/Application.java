package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import empresa.Funcionarios;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Funcionarios> func = new ArrayList<>();	
		
		System.out.print("How many employees will be registered?");
		int numFuncionarios=sc.nextInt();
		for(int count = 1; count<=numFuncionarios;count++) {
			System.out.println("Emplyoee #"+count+":");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			for (int i=0; i<func.size();i++) {
				while(func.get(i).getId()==id) {
					System.out.println("Id indisponível");
					System.out.print("Digite outro Id: ");
					id = sc.nextInt();
					i=0;
				}
				
			}
			/*
			 * for(Funcionarios x : func) { if(x.getId()==id) {
			 * System.out.println("Id indisponível"); System.exit(1); } }
			 */
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Sallary: ");
			double salario = sc.nextDouble();
			func.add(new Funcionarios(id, nome, salario));
			
		}
		System.out.print("Enter the employee id that will have salary increase :");
		int verificaId = sc.nextInt();
		Funcionarios procuraId = func.stream().filter(x -> x.getId()== verificaId).findFirst().orElse(null);
		if(procuraId==null) {
			System.out.println("This id not exist!");
		}else {
			System.out.print("Enter the increase: ");
			double percent = sc.nextDouble();
			procuraId.aumento(percent);
		}
		for(Funcionarios y : func) {
			System.out.println(y);
		}
		
		
		sc.close();
	}

}
