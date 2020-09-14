package program;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Pessoa;

public class Application {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = new Pessoa (2, null, null);
		
		em.remove(p);// Erro, só é possível remover uma identidade monitorada
		
		System.out.println("Finish");
		
		em.close();
		emf.close();
		
		
	}

}
