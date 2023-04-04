package controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import abbonamento.Abbonamento;
import abbonamento.Tipologia_abbonamento;
import rivenditore.Distributore_Automatico;
import rivenditore.Rivenditore_autorizzato;
import tessera.Tessera;
import utente.Utente;
import utente.UtenteDAO;
import utils.JpaUtil;

public class Main {
	static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();

	public static void main(String[] args) {

		Utente u1 = new Utente();
		u1.setCognome("efubeuo");
		u1.setNome("Mario");
//		System.out.println(u1.toString());
//		UtenteDAO.salvaUtente(u1);

		Utente u2 = new Utente();
		u2.setCognome("Flavio");
		u2.setNome("Verdi");

		Tessera t1 = new Tessera();

		// System.out.println(UtenteDAO.findUtente(1));

		t1.setUtente(UtenteDAO.findUtente(1));
		t1.setData_inizio_abbonamento(LocalDate.of(2022, 5, 3));
		t1.setData_fine_abbonamento(LocalDate.of(2023, 5, 3));
		// TesseraDAO.salvaTessera(t1);

		Rivenditore_autorizzato r1 = new Rivenditore_autorizzato();
		// RivenditoreDAO.salvaRivenditore(r1);

		Distributore_Automatico da2 = new Distributore_Automatico();
		// da2.setFuori_servizio(true);
		// RivenditoreDAO.salvaDistributore(da2);

		Abbonamento abb1 = new Abbonamento();
		abb1.setData_inizio_abbonamento(LocalDate.of(2022, 6, 3));
		abb1.setTipologia_abbonamento(Tipologia_abbonamento.Mensile);
		abb1.setTessera(2);
		abb1.setRivenditore(5);
		// ABBIAMO INSERITO I NUMERI A MANO PERCHE NON PRENDEVA IL NUMERO
		// DA SISTEMARE
		// AbbonamentoDAO.salvaAbbonamento(abb1);


	}

}
