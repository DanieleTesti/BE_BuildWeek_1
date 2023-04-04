package utente;

import javax.persistence.EntityManager;

import utils.JpaUtil;

public class UtenteDAO {

	static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();

	public static Utente salvaUtente(Utente u) {
		try {
			em.getTransaction().begin();
			em.persist(u);
			em.getTransaction().commit();
			System.out.println("Utente Salvato");
		} catch (Exception e) {
			System.out.println(e);
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		return u;
	}

	public static Utente cercaUtente(Integer id) {
		try {
			em.getTransaction().begin();
			Utente u = em.find(Utente.class, id);
			return u;
			// em.getTransaction().commit();
		} finally {
			em.close();
		}
	}
//		try {
//			Utente utente = em.find(Utente.class, id);
//			return utente;
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			em.close();
//		}
//		return null;
//	}
}
