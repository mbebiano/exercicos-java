package program;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Pessoa;

public class Application {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 2);
		
		em.getTransaction().begin(); // necessário incluir transação
		em.remove(p);// Objeto monitorado, agora é possível remover
		em.getTransaction().commit();// comita a transação e é feita realmente no banco de dados
		
		System.out.println("Finish");
		
		em.close();
		emf.close();
		
		
	}

}
