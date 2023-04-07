package abbonamento;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import tessera.Tessera;
import utils.JpaUtil;

public class AbbonamentoDAO {

	static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();

	public static void salvaAbbonamento(Abbonamento a) {
		try {
			em.getTransaction().begin();
			em.persist(a);
			em.getTransaction().commit();
			System.out.println("Abbonamneto Salvato");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("errore Abbonamento");
			// em.getTransaction().rollback();
		}
	}

	public static Abbonamento findAbbonamento(Integer id) {
		em.getTransaction().begin();
		Abbonamento e = em.find(Abbonamento.class, id);
		em.getTransaction().commit();
		return e;
	}

	public static Tessera findTessera(Integer id) {
		em.getTransaction().begin();
		Tessera e = em.find(Tessera.class, id);
		em.getTransaction().commit();
		return e;
	}



	public static void removeAbbonamento(Abbonamento e) {
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
		System.out.println("Abbonamento eliminato!");
	};

	public static void validitaAbb(Tessera tessera) {
		Query q = em
				.createQuery(
						"SELECT a FROM Abbonamento a WHERE a.tessera = :id AND a.data_fine_abbonamento > current_date");
		q.setParameter("id", tessera);
		q.getResultList().forEach(a -> System.out.println(a));

	}
}
