package org.elis.movieexplorer.service.definition;

import java.time.LocalDate;
import java.util.List;

import org.elis.movieexplorer.dto.spettacolo.request.EditSpettacoloDTO;
import org.elis.movieexplorer.dto.spettacolo.request.InsertSpettacoloDTO;
import org.elis.movieexplorer.dto.spettacolo.response.ResponseSpettacoloDTO;

public interface SpettacoloService {
	// CREATE
	ResponseSpettacoloDTO insert(InsertSpettacoloDTO dto);
	
	// READ
	List<ResponseSpettacoloDTO> findAll();
	
	ResponseSpettacoloDTO findById(Long id);
	
	List<ResponseSpettacoloDTO> findByData(LocalDate data);
	
	List<ResponseSpettacoloDTO> findByIdFilm(Long id);
	
	// UPDATE
	ResponseSpettacoloDTO editById(Long id, EditSpettacoloDTO sMod);
	
	// DELETE
	void removeById(Long id);
}
