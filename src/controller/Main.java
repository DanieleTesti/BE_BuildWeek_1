package controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import abbonamento.Abbonamento;
import abbonamento.AbbonamentoDAO;
import abbonamento.Tipologia_abbonamento;
import biglietto.Biglietto;
import parco_mezzi.Autobus;
import parco_mezzi.Mezzo;
import rivenditore.Distributore_Automatico;
import rivenditore.RivenditoreDAO;
import rivenditore.Rivenditore_autorizzato;
import tessera.Tessera;
import utente.Utente;
import utente.UtenteDAO;
import utils.JpaUtil;

public class Main {
	static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();

	public static void main(String[] args) {

		//CREAZIONE NUOVI UTENTI
		Utente u1 = new Utente();
		u1.setCognome("Rossi");
		u1.setNome("Mario");
//		System.out.println(u1.toString());
		// UtenteDAO.salvaUtente(u1);

		Utente u2 = new Utente();
		u2.setCognome("Flavio");
		u2.setNome("Verdi");
		// UtenteDAO.salvaUtente(u2);
		Tessera t1 = new Tessera();

		// System.out.println(UtenteDAO.findUtente(1));

		t1.setUtente(UtenteDAO.findUtente(1));
		t1.setData_inizio_abbonamento(LocalDate.of(2022, 5, 3));
		t1.setData_fine_abbonamento(LocalDate.of(2023, 5, 3));
		// TesseraDAO.salvaTessera(t1);
		
		//CREAZIONE NUOVI RIVENDITORI
		
		Rivenditore_autorizzato r1 = new Rivenditore_autorizzato();
		// RivenditoreDAO.salvaRivenditore(r1);

		Distributore_Automatico da2 = new Distributore_Automatico();
		// da2.setFuori_servizio(true);
		// RivenditoreDAO.salvaDistributore(da2);

		//CREAZIONE NUOVI ABBONAMENTI
		Abbonamento abb1 = new Abbonamento();
		abb1.setData_inizio_abbonamento(LocalDate.of(2023, 3, 3));
		abb1.setTipologia_abbonamento(Tipologia_abbonamento.Settimanale);
		abb1.setTessera(AbbonamentoDAO.findTessera(1));
		abb1.setRivenditore(RivenditoreDAO.findRivenditore(1));
		// AbbonamentoDAO.salvaAbbonamento(abb1);

		//CREAZIONE NUOVI BIGLIETTI
		Biglietto b1 = new Biglietto();
		b1.setData_emissione(LocalDate.of(2023, 4, 4));
		b1.setRivenditore(RivenditoreDAO.findRivenditore(1));
		// BigliettoDAO.salvaBiglietto(b1);

		// Imposto un periodo di servizio per un mezzo (formato: YYYY, M, D / inizio - fine)
		Autobus a1 = new Autobus();
		// a1.setServizio(a1.getInServizio());
		a1.setInizio_servizio(LocalDate.of(2023, 2, 14));
		a1.setFine_servizio(LocalDate.of(2023, 6, 4)); // <-- mi aspetto 3 mesi e 21 giorni
		a1.setInizio_manutenzione(LocalDate.of(2023, 2, 10)); 
		a1.setFine_manutenzione(LocalDate.of(2023, 12, 30)); // <-- mi aspetto 10 mesi e 20 giorni
		
		Mezzo.setPeriodoServizio(a1.getInizio_servizio(), a1.getFine_servizio());
		Mezzo.setPeriodoManutenzione(a1.getInizio_manutenzione(), a1.getFine_manutenzione());

	}

}
