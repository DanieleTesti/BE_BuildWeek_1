package utente;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import biglietto.Biglietto;
import tessera.Tessera;

@Entity
@NamedQuery(name = "Utente.findAll", query = "SELECT a FROM Utente a")
public class Utente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@OneToMany(mappedBy = "utente")
	private List<Biglietto>biglietto;
	@OneToOne
	private Tessera tessera;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Biglietto> getBiglietto() {
		return biglietto;
	}

	public void setBiglietto(List<Biglietto> biglietto) {
		this.biglietto = biglietto;
	}

	public Tessera getTessera() {
		return tessera;
	}

	public void setTessera(Tessera tessera) {
		this.tessera = tessera;
	}

	public Utente(Integer id, List<Biglietto> biglietto, Tessera tessera) {
		super();
		this.id = id;
		this.biglietto = biglietto;
		this.tessera = tessera;
	}

	public Utente() {
		super();
	}

	@Override
	public String toString() {
		return "Utente [id=" + id + ", biglietto=" + biglietto + ", tessera=" + tessera + "]";
	}
	
}
