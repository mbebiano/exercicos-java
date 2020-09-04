package program;

import java.util.Scanner;

import rooms.Room;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberRooms=9;
		Room[] vect = new Room[numberRooms];// criacao de objetos em vetor
		
		System.out.print("Digite o numero de estudantes a alugar:");
		int numberStudents= sc.nextInt();
		
		for(int i = 1; i<=numberStudents; i++) {
			System.out.println("Rent #"+i);
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room=sc.nextInt();
			vect[room]=new Room(nome, email, room);//construtor
			
		}
		System.out.println("Busy rooms:");
		for (int i=0; i<vect.length;i++) {
			if(vect[i]!=null) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}

}
