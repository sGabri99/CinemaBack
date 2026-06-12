package org.elis.movieexplorer.mapper;

import org.elis.movieexplorer.dto.sala.request.EditSalaDTO;
import org.elis.movieexplorer.dto.sala.request.InsertSalaDTO;
import org.elis.movieexplorer.dto.sala.response.ResponseSalaDTO;
import org.elis.movieexplorer.model.Sala;
import org.elis.movieexplorer.model.Spettacolo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalaMapper {
	
	public Sala fromInsert(InsertSalaDTO dto){
		Sala s = new Sala();
		s.setNome(dto.getNome());
		s.setNumeroPosti(dto.getNumeroPosti());
		s.setTipo(dto.getTipo());

		return s;
	}
	
	public Sala fromEdit(EditSalaDTO dto, List<Spettacolo> spettacoli){
		Sala s = new Sala();
		s.setNome(dto.getNome());
		s.setNumeroPosti(dto.getNumeroPosti());
		s.setTipo(dto.getTipo());
		s.setSpettacoli(spettacoli);
		
		return s;
	}
	
	public ResponseSalaDTO toResponse(Sala s) {
		ResponseSalaDTO dto = new ResponseSalaDTO();
		dto.setId(s.getId());
		dto.setNome(s.getNome());
		dto.setNumeroPosti(s.getNumeroPosti());
		dto.setTipo(s.getTipo());
		if (s.getSpettacoli() != null) {
	        dto.setIdSpettacoli(s.getSpettacoli().stream()
	                .map(Spettacolo::getId)
	                .toList());
	    }
		return dto;
	}
}
