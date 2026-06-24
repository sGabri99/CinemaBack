package org.elis.movieexplorer.service.jpa;

import java.util.List;
import java.util.Optional;

import org.elis.movieexplorer.model.Posto;
import org.elis.movieexplorer.dto.posto.response.ResponsePostoBySpettacoloDTO;
import org.elis.movieexplorer.mapper.FilmMapper;
import org.elis.movieexplorer.mapper.GenereMapper;
import org.elis.movieexplorer.mapper.PostoMapper;
import org.elis.movieexplorer.repository.FilmRepository;
import org.elis.movieexplorer.repository.GenereRepository;
import org.elis.movieexplorer.repository.PostoRepository;
import org.elis.movieexplorer.repository.SpettacoloRepository;
import org.elis.movieexplorer.service.omdb.OmdbService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@ConditionalOnProperty(name="service.impl", havingValue="JPA")
@RequiredArgsConstructor
public class PostoServiceJPA {
	private final PostoRepository repository;
	private final PostoMapper mapper;
	
	public List<ResponsePostoBySpettacoloDTO> findBySala(Long id)
	{
		Optional<List<Posto>> posti = repository.getPostiBySalaId(id);
		return mapper.toResponse(posti);
	}
	

}
