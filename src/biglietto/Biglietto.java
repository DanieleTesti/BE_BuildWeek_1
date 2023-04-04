package biglietto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

import rivenditore.Rivenditore_autorizzato;
import utente.Utente;

@Entity
@NamedQuery(name = "Biglietto.findAll", query = "SELECT a FROM Biglietto a")
public class Biglietto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private boolean scaduto;
	@ManyToOne
	private Utente utente;
	@ManyToOne
	private Rivenditore_autorizzato rivenditore;
	private LocalDate data_emissione;

	public Biglietto(boolean scaduto, Utente utente, Rivenditore_autorizzato rivenditore, LocalDate data_emissione) {
		super();
		this.scaduto = scaduto;
		this.utente = utente;
		this.rivenditore = rivenditore;
		this.data_emissione = data_emissione;
	}

	public Biglietto() {

	}

	public Integer getId() {
		return id;
	}

	public boolean isScaduto() {
		return scaduto;
	}

	public void setScaduto(boolean scaduto) {
		this.scaduto = scaduto;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public Rivenditore_autorizzato getRivenditore() {
		return rivenditore;
	}

	public void setRivenditore(Rivenditore_autorizzato rivenditore) {
		this.rivenditore = rivenditore;
	}

	public LocalDate getData_emissione() {
		return data_emissione;
	}

	public void setData_emissione(LocalDate data_emissione) {
		this.data_emissione = data_emissione;
	}

	@Override
	public String toString() {
		return "Biglietto [ id=" + id + ", scaduto=" + scaduto + ", utente=" + utente + ", rivenditore=" + rivenditore
				+ ", data_emissione=" + data_emissione + "]";
	}
	
}