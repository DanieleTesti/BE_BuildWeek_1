package controller;

import javax.persistence.EntityManager;

import tessera.Tessera;
import utente.Utente;
import utente.UtenteDAO;
import utils.JpaUtil;

public class Main {
	static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();

	public static void main(String[] args) {

		Utente u1 = new Utente();
		u1.setCognome("Rossi");
		u1.setNome("Mario");
		// System.out.println(u1.toString());
//		UtenteDAO.salvaUtente(u1);

		Utente u2 = new Utente();
		u2.setCognome("Flavio");
		u2.setNome("Verdi");

		Tessera t1 = new Tessera();
//		Utente utenteSalvato = UtenteDAO.salvaUtente(u1);
		System.out.println(UtenteDAO.cercaUtente(2));

//		System.out.println(UtenteDAO.cercaUtente(u1.getId()));
//		t1.setUtente(UtenteDAO.cercaUtente(2));
//		t1.setData_inizio_abbonamento(LocalDate.of(2022, 5, 3));
//		t1.setData_fine_abbonamento(LocalDate.of(2023, 5, 3));
//		TesseraDAO.salvaTessera(t1);

//		Rivenditore_autorizzato r1 = new Rivenditore_autorizzato();
		// RivenditoreDAO.salvaRivenditore(r1);

//		Distributore_Automatico da2 = new Distributore_Automatico();
//		da2.setFuori_servizio(true);
		// RivenditoreDAO.salvaDistributore(da2);

		// Abbonamento abb= new Abbonamento();
	}

}
