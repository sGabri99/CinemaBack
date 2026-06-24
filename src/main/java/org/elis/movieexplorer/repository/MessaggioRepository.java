package org.elis.movieexplorer.repository;

import java.util.List;
import java.util.Optional;

import org.elis.movieexplorer.model.Messaggio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MessaggioRepository extends JpaRepository<Messaggio, Long>{

	@Query("SELECT m FROM Messaggio m WHERE m.chat.id = :id ORDER BY m.createdAt DESC ")
	Optional<List<Messaggio>> findByChat( @Param("id") Long id );
	
}
