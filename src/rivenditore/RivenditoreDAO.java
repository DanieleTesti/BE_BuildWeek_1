package rivenditore;

import javax.persistence.EntityManager;

import utils.JpaUtil;

public class RivenditoreDAO {

	static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();

	public static void salvaRivenditore(Rivenditore_autorizzato r) {
		try {
			em.getTransaction().begin();
			em.persist(r);
			em.getTransaction().commit();
			System.out.println("Rivenditore autorizzato Salvato");
		} catch (Exception e) {
			System.out.println(e);
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
	}
}
