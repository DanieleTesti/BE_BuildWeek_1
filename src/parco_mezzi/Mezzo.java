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
	Boolean inServizio;
	Period periodo_servizio;
	Period periodo_manutenzione;
	LocalDate periodo_fine_manutenzione;

	// costruttore vuoto
	public Mezzo() {
	}

	public static Period getPeriodoServizio (LocalDate inizio, LocalDate fine) {
	      Period p = Period.between(inizio, fine);
	      System.out.println("The Period between the start and end date is: " + p.getDays() + " days and " + p.getMonths() + " months.");
		return p;
	   } 
	
	
	// getters e setters

	public Integer getCapienza() {
		return capienza;
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

	public void setServizio(Boolean servizio) {
		this.inServizio = servizio;

	}

	public Period getPeriodo_servizio() {
		return periodo_servizio;
	}

	public void setPeriodo_servizio(Period periodo_servizio) {
		this.periodo_servizio = periodo_servizio;
	}

	public Period getPeriodo_manutenzione() {
		return periodo_manutenzione;
	}

	public void setPeriodo_manutenzione(Period periodo_manutenzione) {
		this.periodo_manutenzione = periodo_manutenzione;

	}

	@Override
	public String toString() {
		return "Mezzo [id=" + id + ", capienza=" + capienza + ", inServizio=" + inServizio + ", periodo_servizio="
				+ periodo_servizio + ", periodo_manutenzione=" + periodo_manutenzione + ", periodo_fine_manutenzione="
				+ periodo_fine_manutenzione + "]";
	}

}
