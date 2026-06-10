package org.elis.movieexplorer.model.enums;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum Tipo {
	TRED(15.0),
	IMAX(10.0),
	NORMALE(7.0);
	
	private final Double prezzo;
	
	Tipo(Double prezzo) {
		this.prezzo = prezzo;
	}
}
