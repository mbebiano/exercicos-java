package program;

import entities.Pessoa;

public class Application {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(1, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(2, "João da Pereira", "joao@gmail.com");
		Pessoa p3 = new Pessoa(3, "Maria de Almeida", "maria@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
