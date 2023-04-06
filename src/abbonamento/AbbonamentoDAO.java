package abbonamento;

import javax.persistence.EntityManager;

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
}
