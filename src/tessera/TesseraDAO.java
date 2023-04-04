package tessera;

import javax.persistence.EntityManager;

import utils.JpaUtil;

public class TesseraDAO {

	static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();

	public static void salvaTessera(Tessera t) {
		try {
			em.getTransaction().begin();
			em.persist(t);
			em.getTransaction().commit();
			System.out.println("Tessera Salvata");
		} catch (Exception e) {
			System.out.println(e);
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
	}

//		em.getTransaction().begin();
//		em.persist(t);
//		em.getTransaction().commit();
//		System.out.println("Tessera Salvata");
//		em.close();
//	}
}
