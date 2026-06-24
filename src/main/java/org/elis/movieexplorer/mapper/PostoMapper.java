package org.elis.movieexplorer.mapper;

import java.util.ArrayList;
import java.util.List;

import org.elis.movieexplorer.dto.posto.response.ResponsePostoBySalaDTO;
import org.elis.movieexplorer.model.Posto;
import org.osgi.service.component.annotations.Component;

@Component
public class PostoMapper {
	
	public List<ResponsePostoBySalaDTO> toResponse(List<Posto> posti) {
		List<ResponsePostoBySalaDTO> listaDTO = new ArrayList<>();
		for(Posto p : posti) {
			ResponsePostoBySalaDTO dto = new ResponsePostoBySalaDTO();
			dto.setColonna(p.getColonna());
			dto.setFila((char) (p.getFila()+ 65));
			listaDTO.add(dto);
		}
		return listaDTO;
	}
	

}
