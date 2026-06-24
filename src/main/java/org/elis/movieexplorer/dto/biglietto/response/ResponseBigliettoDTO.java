package org.elis.movieexplorer.dto.biglietto.response;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ResponseBigliettoDTO {
	
	private Long id;
	
	@EqualsAndHashCode.Exclude
	private String nomeUtente;
	
	@EqualsAndHashCode.Exclude
	private Long idSpettacolo;
	
	@EqualsAndHashCode.Exclude
	private Long idPosto;
	
	private String codiceBiglietto;
	
	private BigDecimal prezzo;
}
