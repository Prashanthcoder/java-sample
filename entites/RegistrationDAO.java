package dao;

import dto.Registration;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class RegistrationDAO {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	
	public void saveRegistration(Registration r) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(r);
		et.commit();
		
		em.close();
		
	}
	public Registration getRegistration(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Registration r = em.find(Registration.class, id);
		em.close();
		return r;
	}
}
