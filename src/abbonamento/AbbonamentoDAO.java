package abbonamento;

import javax.persistence.EntityManager;

import rivenditore.Rivenditore_autorizzato;
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
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
	}

	public static Tessera findTessera(Integer id) {
		em.getTransaction().begin();
		Tessera e = em.find(Tessera.class, id);
		em.getTransaction().commit();
		return e;
	}

	public static Rivenditore_autorizzato findRivenditore(Integer id) {
		em.getTransaction().begin();
		Rivenditore_autorizzato e = em.find(Rivenditore_autorizzato.class, id);
		em.getTransaction().commit();
		return e;
	}
}
