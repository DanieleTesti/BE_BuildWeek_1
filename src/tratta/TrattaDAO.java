package tratta;

import javax.persistence.EntityManager;

import utils.JpaUtil;

public class TrattaDAO {

	static EntityManager em = JpaUtil.entityManagerFactory.createEntityManager();

	public static void saveTratta(Tratta e) {
		try {
			em.getTransaction().begin();
			em.persist(e);
			em.getTransaction().commit();
			System.out.println("Tratta salvata");
		} catch (Exception ex) {
			System.out.println(ex);
			em.getTransaction().rollback();
		} 
	}

	public static Tratta findTratta(Integer id) {
		em.getTransaction().begin();
		Tratta e = em.find(Tratta.class, id);
		em.getTransaction().commit();
		return e;
	}

}
