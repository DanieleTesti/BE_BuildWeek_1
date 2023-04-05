package biglietto;

import javax.persistence.EntityManager;

import utils.JpaUtil;

public class BigliettoDAO {

	static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();

	public static void salvaBiglietto(Biglietto b) {
		try {
			em.getTransaction().begin();
			em.persist(b);
			em.getTransaction().commit();
			System.out.println("Biglietto Salvato");
		} catch (Exception e) {
			System.out.println(e);
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
	}

	public static void removeBiglietto(Biglietto e) {
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
		System.out.println("Biglietto eliminato!");
	};
// QUESTA E' UNA PROVA DI FEDE
}
