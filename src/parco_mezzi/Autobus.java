package parco_mezzi;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue( "autobus")
public class Autobus extends Mezzo{

	public Autobus(){
		
	}

}
