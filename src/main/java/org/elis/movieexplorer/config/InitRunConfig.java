package org.elis.movieexplorer.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.elis.movieexplorer.dto.sala.request.InsertSalaDTO;
import org.elis.movieexplorer.dto.sala.response.ResponseSalaDTO;
import org.elis.movieexplorer.dto.utente.response.ResponseUtenteDataDTO;
import org.elis.movieexplorer.model.Posto;
import org.elis.movieexplorer.model.Sala;
import org.elis.movieexplorer.model.Utente;
import org.elis.movieexplorer.model.enums.Ruolo;
import org.elis.movieexplorer.model.enums.Tipo;
import org.elis.movieexplorer.repository.PostoRepository;
import org.elis.movieexplorer.repository.SalaRepository;
import org.elis.movieexplorer.repository.UtenteRepository;
import org.elis.movieexplorer.service.definition.PostoService;
import org.elis.movieexplorer.service.definition.SalaService;
import org.elis.movieexplorer.service.definition.UtenteService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class InitRunConfig implements CommandLineRunner {

	private final PostoRepository postoRepository;
	private final SalaRepository  salaRepository;
	private final UtenteRepository   utenteRepository;



	@Override
	public void run(String... args) throws Exception {

		Optional<Utente> admin = utenteRepository.findUtenteByEmail("admin@gmail.com");
		Optional<Utente> staff = utenteRepository.findUtenteByEmail("staff@gmail.com");
		Optional<Utente> user  = utenteRepository.findUtenteByEmail("user@gmail.com");

		if (admin.isEmpty()) {
		    utenteRepository.save(
		        new Utente(
		            Ruolo.SUPERADMIN,
		            "Admin",
		            "System",
		            "admin@gmail.com",
		            "admin123"
		        )
		    );
		}

		if (staff.isEmpty()) {
		    utenteRepository.save(
		        new Utente(
		            Ruolo.STAFF,
		            "Mario",
		            "Rossi",
		            "staff@gmail.com",
		            "staff123"
		        )
		    );
		}

		if (user.isEmpty()) {
		    utenteRepository.save(
		        new Utente(
		            Ruolo.CLIENTE,
		            "Giulia",
		            "Bianchi",
		            "user@gmail.com",
		            "user123"
		        )
		    );
		}
		
		

		List<Sala> sale = salaRepository.findAll();
		if (sale.isEmpty()) {

		    List<Sala> saleDaInserire = List.of(
		        new Sala("Sala IMAX Centrale", Tipo.IMAX),
		        new Sala("Sala 3D Galaxy", Tipo.TRED),
		        new Sala("Sala Rossa", Tipo.NORMALE),
		        new Sala("Sala Premium IMAX", Tipo.IMAX),
		        new Sala("Sala 3D Experience", Tipo.TRED)
		    );

		    List<Sala> saleSalvate = salaRepository.saveAll(saleDaInserire);

		    List<Posto> postiDaInserire = new ArrayList<>();

		    for (Sala sala : saleSalvate) {

		        for (int fila = 1; fila <= 3; fila++) {

		            for (int colonna = 1; colonna <= 5; colonna++) {

		                postiDaInserire.add(
		                    new Posto(
		                        fila,
		                        colonna,
		                        sala
		                    )
		                );
		            }
		        }
		    }

		    postoRepository.saveAll(postiDaInserire);
		}
		
		


	}
}
