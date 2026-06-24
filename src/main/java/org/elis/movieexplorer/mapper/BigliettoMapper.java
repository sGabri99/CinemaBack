package org.elis.movieexplorer.mapper;

import org.elis.movieexplorer.dto.biglietto.response.ResponseBigliettoDTO;
import org.elis.movieexplorer.model.Biglietto;
import org.elis.movieexplorer.model.Spettacolo;
import org.elis.movieexplorer.model.Utente;
import org.springframework.stereotype.Component;

@Component
public class BigliettoMapper {
	
	// ???
	public Biglietto fromInsertWithoutInsert(Utente utente, Spettacolo spettacolo) {
		Biglietto b = new Biglietto();
		b.setUtente(utente);
		b.setSpettacolo(spettacolo);
		return b;	
	}
	
	
	public ResponseBigliettoDTO toResponse(Biglietto biglietto) {
		ResponseBigliettoDTO bigliettoDTO = new ResponseBigliettoDTO();
		bigliettoDTO.setId(biglietto.getId());
		bigliettoDTO.setNomeUtente(biglietto.getUtente().getNome());
		bigliettoDTO.setIdSpettacolo(biglietto.getSpettacolo().getId());
		bigliettoDTO.setCodiceBiglietto(biglietto.getCodiceBiglietto());
		bigliettoDTO.setPrezzo(biglietto.getPrezzo());
		bigliettoDTO.setIdPosto(biglietto.getPosto().getId());
		return bigliettoDTO;
	} 
}
