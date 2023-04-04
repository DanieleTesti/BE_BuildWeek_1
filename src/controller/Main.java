package controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import tessera.Tessera;
import tessera.TesseraDAO;
import utente.Utente;
import utils.JpaUtil;

public class Main {
	static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
	public static void main(String[] args) {
		
		Utente u1 = new Utente();
		u1.setCognome("Rossi");
		u1.setNome("Mario");
//		UtenteDAO.salvaUtente(u1);
		
		Utente u2 = new Utente();
		u2.setCognome("Flavio");
		u2.setNome("Verdi");

		Tessera t1 = new Tessera();
		t1.setUtente(u2);
		t1.setData_inizio_abbonamento(LocalDate.of(2022, 5, 3));
		TesseraDAO.salvaTessera(t1);

		//Abbonamento abb= new Abbonamento();
	}

}
