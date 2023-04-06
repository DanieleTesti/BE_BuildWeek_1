package parco_mezzi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tratta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String zonaPartenza;
	private String capolinea;
	private double mediaTempoPercorrenza;
	private Integer nPercorrenzaTratta;
	
//	@ManyToMany
//	private Mezzo mezzo;
	
	
	//getters e setters
	
	public String getZonaPartenza() {
		return zonaPartenza;
	}
	public void setZonaPartenza(String zonaPartenza) {
		this.zonaPartenza = zonaPartenza;
	}
	public String getCapolinea() {
		return capolinea;
	}
	public void setCapolinea(String capolinea) {
		this.capolinea = capolinea;
	}
	public double getMediaTempoPercorrenza() {
		return mediaTempoPercorrenza;
	}
	public void setMediaTempoPercorrenza(double mediaTempoPercorrenza) {
		this.mediaTempoPercorrenza = mediaTempoPercorrenza;
	}
	public Integer getnPercorrenzaTratta() {
		return nPercorrenzaTratta;
	}
	public void setnPercorrenzaTratta(Integer nPercorrenzaTratta) {
		this.nPercorrenzaTratta = nPercorrenzaTratta;
	}
	
// metodi custom
	
	// calcolo tempo medio di percorrenza
	
	
	


}
