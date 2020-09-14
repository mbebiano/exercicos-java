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
		
		em.getTransaction().begin(); // necess�rio incluir transa��o
		em.remove(p);// Objeto monitorado, agora � poss�vel remover
		em.getTransaction().commit();// comita a transa��o e � feita realmente no banco de dados
		
		System.out.println("Finish");
		
		em.close();
		emf.close();
		
		
	}

}
