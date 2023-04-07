package controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import abbonamento.Abbonamento;
import abbonamento.AbbonamentoDAO;
import abbonamento.Tipologia_abbonamento;
import biglietto.Biglietto;
import parco_mezzi.Autobus;
import parco_mezzi.MezzoDAO;
import parco_mezzi.Tram;
import rivenditore.Distributore_Automatico;
import rivenditore.RivenditoreDAO;
import rivenditore.Rivenditore_autorizzato;
import tessera.Tessera;
import tratta.Tratta;
import utente.Utente;
import utente.UtenteDAO;
import utils.JpaUtil;

public class Main {
	EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();

	public static void main(String[] args) {

		// CREAZIONE NUOVI UTENTI
		Utente u1 = new Utente();
		u1.setCognome("Rossi");
		u1.setNome("Mario");
//		System.out.println(u1.toString());
		// UtenteDAO.salvaUtente(u1);

		// System.out.println(MezzoDAO.findUtente(1));

		Utente u2 = new Utente();
		u2.setCognome("Flavio");
		u2.setNome("Verdi");
		// UtenteDAO.salvaUtente(u2);

		Tessera t1 = new Tessera();

		t1.setUtente(UtenteDAO.findUtente(2));
		t1.setData_inizio_abbonamento(LocalDate.of(2022, 8, 3));
		t1.setData_fine_abbonamento(LocalDate.of(2023, 8, 3));
		// TesseraDAO.salvaTessera(t1);

		// CREAZIONE NUOVI RIVENDITORI

		Rivenditore_autorizzato r1 = new Rivenditore_autorizzato();
//		RivenditoreDAO.salvaRivenditore(r1);

		Distributore_Automatico da2 = new Distributore_Automatico();
		da2.setFuori_servizio(true);
//		RivenditoreDAO.salvaDistributore(da2);

		// CREAZIONE NUOVI ABBONAMENTI
//		Abbonamento abb1 = new Abbonamento();
//		abb1.setData_inizio_abbonamento(LocalDate.of(2023, 4, 1));
//		abb1.setTipologia_abbonamento(Tipologia_abbonamento.Mensile);
//		abb1.setTessera(AbbonamentoDAO.findTessera(2));
//		abb1.setRivenditore(RivenditoreDAO.findRivenditore(2));
		// AbbonamentoDAO.salvaAbbonamento(abb1);

		// CREAZIONE NUOVI BIGLIETTI

		// BigliettoDAO.salvaBiglietto(b1);
		

//		Biglietto b2 = new Biglietto();
//		b2.setRivenditore(RivenditoreDAO.findRivenditore(2));
//		b2.setData_emissione(LocalDate.of(2023, 3, 20));
		// BigliettoDAO.salvaBiglietto(b2);
		Biglietto b3 = new Biglietto();
		Biglietto b4 = new Biglietto();
		Biglietto b5 = new Biglietto();

		// BigliettoDAO.salvaBiglietto(b2);
//		BigliettoDAO.salvaBiglietto(b3);
//		BigliettoDAO.salvaBiglietto(b4);
//		BigliettoDAO.salvaBiglietto(b5);
//		

		// Imposto un periodo di servizio per un mezzo (formato: YYYY, M, D / inizio -
		// fine)
		Autobus a1 = new Autobus();
		a1.setServizio(a1.getInServizio());
		a1.setInizio_servizio(LocalDate.of(2023, 2, 14));
		a1.setFine_servizio(LocalDate.of(2023, 6, 4)); // <-- mi aspetto 3 mesi e 21 giorni
		a1.setInizio_manutenzione(LocalDate.of(2023, 2, 10));
		a1.setFine_manutenzione(LocalDate.of(2023, 12, 30)); // <-- mi aspetto 10 mesi e 20 giorni
		
		// MezzoDAO.salvaAutobus(a1);
		// a1.vidimaBiglietto(b1); // <-- ci vidima il biglietto


		// System.out.println(a.toString());
		//System.out.println(b1.getVidimato());
		// a1.vidimaBiglietto(BigliettoDAO.findBiglietto(7));

		// METODO PER VIDIMARE I BIGLIETTI DEFINITIVO
		// a1.vidimaBiglietto(BigliettoDAO.findBiglietto(5));

//		a1.vidimaBiglietto(b3);
//		a1.vidimaBiglietto(b4);
//		a1.vidimaBiglietto(b5);
		
		// test abbonamento valido
		Abbonamento abb2 = new Abbonamento(Tipologia_abbonamento.Mensile, AbbonamentoDAO.findTessera(2),
				RivenditoreDAO.findRivenditore(1), LocalDate.of(2023, 4, 5));

		//AbbonamentoDAO.salvaAbbonamento(abb2);

		Tram tram1 = new Tram();
		tram1.setServizio(true);
		// MezzoDAO.salvaTram(tram1);

		// DOBBIAMO PRENDERE L'ID DEL TRAM/AUTOBUS E METTERLO PER SALVARE I BIGLIETTI

		// tram1.vidimaBiglietto(BigliettoDAO.findBiglietto(1));

		// System.out.println(MezzoDAO.findMezzo(1l));

		// RivenditoreDAO.conta(RivenditoreDAO.findRivenditore(1));


		Biglietto b1 = new Biglietto();
		b1.setData_emissione(LocalDate.of(2023, 4, 5));
		b1.setRivenditore(RivenditoreDAO.findRivenditore(1));
		b1.setMezzo(MezzoDAO.findMezzo(2l));
		// BigliettoDAO.updateTicket(4);
		// BigliettoDAO.salvaBiglietto(b1);
		// System.out.println();

		// tram1.vidimaBiglietto(BigliettoDAO.findBiglietto(2), MezzoDAO.findMezzo(2l));
//		 MezzoDAO.salvaAutobus(a1);
//		 MezzoDAO.salvaTram(tram1);
		
		// NON FUNZIONA
		// MezzoDAO.bigliettiVidimati(MezzoDAO.findMezzo(3l));

		Tratta tratta1 = new Tratta("Termini", "Ciampino", 120);
		// TrattaDAO.saveTratta(tratta1);

		// TrattaDAO.findTratta(8);
		// System.out.println(TrattaDAO.findTratta(10l));

		// AbbonamentoDAO.validitaAbb(AbbonamentoDAO.findTessera(1));

		

		// Mezzo.setPeriodoServizio(a1.getInizio_servizio(), a1.getFine_servizio());
		// Mezzo.setPeriodoManutenzione(a1.getInizio_manutenzione(),
		// a1.getFine_manutenzione());

	}

}
