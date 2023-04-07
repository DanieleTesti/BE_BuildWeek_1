package parco_mezzi;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import utils.JpaUtil;

public class MezzoDAO {

	static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();

	public static void salvaAutobus(Autobus m) {
		try {
			em.getTransaction().begin();
			em.persist(m);
			em.getTransaction().commit();
			System.out.println("Autobus Salvato");
		} catch (Exception e) {
			System.out.println(e);
			em.getTransaction().rollback();
		} finally {

		}
	}

	public static void salvaTram(Tram m) {
		try {
			em.getTransaction().begin();
			em.persist(m);
			em.getTransaction().commit();
			System.out.println("Tram Salvato");
		} catch (Exception e) {
			System.out.println(e);
			em.getTransaction().rollback();
		} finally {

		}
	}

	public static void removeTram(Tram e) {
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
		System.out.println("Tram eliminato!");
	};

	public static void removeAutobus(Autobus e) {
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
		System.out.println("Autobus eliminato!");
	};


	public static Mezzo findMezzo(Long id) {
		em.getTransaction().begin();
		Mezzo e = em.find(Mezzo.class, id);
		em.getTransaction().commit();
		return e;
	}

	public static void bigliettiVidimati(Mezzo mezzo) {
		Query q = em.createQuery("SELECT b FROM Biglietto WHERE b.mezzo = :mezzo");
		q.setParameter("mezzo", mezzo);
		q.getResultList().forEach(b -> System.out.println(b));
	}


}
