package parco_mezzi;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("tram")
public class Tram extends Mezzo {
	
	public Tram() {		
	}

}
