package parco_mezzi;

import java.time.LocalDate;

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
	LocalDate periodo_servizio;
	LocalDate periodo_manutenzione;
	
	
	//costruttore vuoto
	public Mezzo() {}

	//getters e setters
	
	
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

	public LocalDate getPeriodo_servizio() {
		return periodo_servizio;
	}

	public void setPeriodo_servizio(LocalDate periodo_servizio) {
		this.periodo_servizio = periodo_servizio;
	}

	public LocalDate getPeriodo_manutenzione() {
		return periodo_manutenzione;
	}

	public void setPeriodo_manutenzione(LocalDate periodo_manutenzione) {
		this.periodo_manutenzione = periodo_manutenzione;
		
	}

	@Override
	public String toString() {
		return "Mezzo [capienza=" + capienza + ", servizio=" + servizio + ", periodo_servizio=" + periodo_servizio
				+ ", periodo_manutenzione=" + periodo_manutenzione + "]";
	};
	
	

}
