package org.elis.movieexplorer.mapper;

import java.util.ArrayList;
import java.util.List;

import org.elis.movieexplorer.dto.biglietto.request.InsertBigliettoDTO;
import org.elis.movieexplorer.dto.biglietto.response.ResponseBigliettoDTO;
import org.elis.movieexplorer.model.Biglietto;
import org.elis.movieexplorer.model.Posto;
import org.elis.movieexplorer.model.Spettacolo;
import org.elis.movieexplorer.model.Utente;
import org.springframework.stereotype.Component;

@Component
public class BigliettoMapper {
	

	public List<Biglietto> fromInsertWithoutInsert(List<Posto> posti, Spettacolo spettacolo) {
		List<Biglietto> biglietti = new ArrayList<>(); 
		for(Posto p : posti) {
			Biglietto b = new Biglietto();
			b.setPosto(p);
			b.setSpettacolo(spettacolo);
			biglietti.add(b);
		}
		return biglietti;	
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
