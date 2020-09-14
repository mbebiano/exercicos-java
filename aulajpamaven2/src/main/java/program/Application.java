package program;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Pessoa;

public class Application {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "João da Pereira", "joao@gmail.com");
		Pessoa p3 = new Pessoa(null, "Maria de Almeida", "maria@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		em.getTransaction().commit();
		
		System.out.println("Finish");
		
		
	}

}
