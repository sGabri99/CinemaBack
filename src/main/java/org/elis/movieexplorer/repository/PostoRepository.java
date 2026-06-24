package org.elis.movieexplorer.repository;

import org.elis.movieexplorer.model.Posto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PostoRepository extends JpaRepository<Posto, Long> {

    @Query("SELECT COUNT(p) from Posto p where p.sala.id = :idSala")
    public Integer getNumeriPostiSala(Long idSala);

    public Optional<Posto> findById(Long id);

}
