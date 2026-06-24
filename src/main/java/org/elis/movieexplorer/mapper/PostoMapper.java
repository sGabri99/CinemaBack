package org.elis.movieexplorer.mapper;

import org.elis.movieexplorer.dto.posto.response.ResponsePostoBySalaDTO;
import org.elis.movieexplorer.model.Posto;
import org.osgi.service.component.annotations.Component;

@Component
public class PostoMapper {
	
	public ResponsePostoBySalaDTO toResponse(Posto p) {
		ResponsePostoBySalaDTO dto = new ResponsePostoBySalaDTO();
		dto.setColonna(p.getColonna());
		dto.setFila((char) (p.getFila()+ 65));
		return dto;
	}
	

}
