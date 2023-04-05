package parco_mezzi;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class Mezzo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	Integer capienza;
	Boolean inServizio = true;
	Period periodo_servizio;
	Period periodo_manutenzione;
	LocalDate inizio_manutenzione;
	LocalDate fine_manutenzione;
	LocalDate inizio_servizio;
	LocalDate fine_servizio;

	// costruttore vuoto
	public Mezzo() {
	}

	// getters e setters

	public Integer getCapienza() {
		return capienza;
	}

	public Boolean getInServizio() {
		return inServizio;
	}

	public LocalDate getInizio_manutenzione() {
		return inizio_manutenzione;
	}

	public void setInServizio(Boolean inServizio) {
		this.inServizio = inServizio;
	}

	public void setPeriodo_servizio(Period periodo_servizio) {
		this.periodo_servizio = periodo_servizio;
	}

	public void setPeriodo_manutenzione(Period periodo_manutenzione) {
		this.periodo_manutenzione = periodo_manutenzione;
	}

	public void setInizio_manutenzione(LocalDate inizio_manutenzione) {
		this.inizio_manutenzione = inizio_manutenzione;
	}

	public void setFine_manutenzione(LocalDate fine_manutenzione) {
		this.fine_manutenzione = fine_manutenzione;
	}

	public void setInizio_servizio(LocalDate inizio_servizio) {
		this.inizio_servizio = inizio_servizio;
	}

	public void setFine_servizio(LocalDate fine_servizio) {
		this.fine_servizio = fine_servizio;
	}

	public LocalDate getFine_manutenzione() {
		return fine_manutenzione;
	}

	public LocalDate getInizio_servizio() {
		return inizio_servizio;
	}

	public LocalDate getFine_servizio() {
		return fine_servizio;
	}

	public Long getId() {
		return id;
	}

	public void setCapienza(Integer capienza) {
		this.capienza = capienza;
	}

	public Boolean getServizio() {
		return inServizio;
	}
	
	// cambio stato del servizio (in servizio - manutenzione)	
	public void setServizio(Boolean servizio) {
		this.inServizio = servizio;
		// registro il giorno in cui entra in manutenzione
		registroDataManutenzione(servizio);
		// registro il giorno in cui entra in servizio
		registroDataServizio(servizio);
	}

	public Period getPeriodo_servizio() {
		return periodo_servizio;
	}

	public Period getPeriodo_manutenzione() {
		return periodo_manutenzione;
	}

	public void registroDataManutenzione(Boolean statServ) {
		LocalDate today;
		// ritorna in servizio
		if(statServ == false) {
			this.inizio_manutenzione = today = LocalDate.now(); // <--- data attuale
		// ritorna in manutenzione
		} else if (statServ == true) {
			this.fine_manutenzione = today = LocalDate.now(); // <--- data attuale
		}
	}
	
	public void registroDataServizio(Boolean statServ) {
		LocalDate today;
		// ritorna in servizio
		if(statServ == true) {
			this.inizio_servizio = today = LocalDate.now(); // <--- data attuale
		// ritorna in manutenzione
		} else if (statServ == false) {
			this.fine_servizio = today = LocalDate.now(); // <--- data attuale
		}
	}

	public static Period setPeriodoServizio(LocalDate inizio, LocalDate fine) {
		Period p = Period.between(inizio, fine);
		System.out.println("The Period between the start and end date of service is: " + p.getDays() + " days and " + p.getMonths()
				+ " months.");
		return p;
	}
	
	public static Period setPeriodoManutenzione(LocalDate inizio, LocalDate fine) {
		Period p = Period.between(inizio, fine);
		System.out.println("The Period between the start and end date of maintainance is: " + p.getDays() + " days and " + p.getMonths()
				+ " months.");
		return p;
	}
	
	
	
	@Override
	public String toString() {
		return "Mezzo [id=" + id + ", capienza=" + capienza + ", inServizio=" + inServizio + ", periodo_servizio="
				+ periodo_servizio + ", periodo_manutenzione=" + periodo_manutenzione + ", inizio_manutenzione="
				+ inizio_manutenzione + ", fine_manutenzione=" + fine_manutenzione + ", inizio_servizio="
				+ inizio_servizio + ", fine_servizio=" + fine_servizio + "]";
	}

}
