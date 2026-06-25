package org.elis.movieexplorer.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.elis.movieexplorer.model.Posto;
import org.elis.movieexplorer.model.Sala;
import org.elis.movieexplorer.model.Utente;
import org.elis.movieexplorer.model.enums.Ruolo;
import org.elis.movieexplorer.model.enums.Tipo;
import org.elis.movieexplorer.repository.PostoRepository;
import org.elis.movieexplorer.repository.SalaRepository;
import org.elis.movieexplorer.repository.UtenteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class InitRunConfig implements CommandLineRunner {

	private final PasswordEncoder passwordEncoder;
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
		        		null,
		            Ruolo.SUPERADMIN,
		            "Admin",
		            "System",
		            "admin@gmail.com",
		            passwordEncoder.encode("Admin123!"),
		            null,
		            null,
		            null
		        )
		    );
		}

		if (staff.isEmpty()) {
		    utenteRepository.save(
		        new Utente(
		        		null,
		            Ruolo.STAFF,
		            "Mario",
		            "Rossi",
		            "staff@gmail.com",
		            passwordEncoder.encode("Staff123!"),
		            null,
		            null,
		            null
		        )
		    );
		}

		if (user.isEmpty()) {
		    utenteRepository.save(
		        new Utente(
		        		null,
		            Ruolo.CLIENTE,
		            "Giulia",
		            "Bianchi",
		            "user@gmail.com",
		            passwordEncoder.encode("User123!"),
		            null,
		            null,
		            null
		        )
		    );
		}
		
		

		List<Sala> sale = salaRepository.findAll();
		if (sale.isEmpty()) {

		    List<Sala> saleDaInserire = List.of(
		        new Sala(null,"Sala IMAX Centrale", Tipo.IMAX,null,null),
		        new Sala(null,"Sala 3D Galaxy", Tipo.TRED,null,null),
		        new Sala(null,"Sala Rossa", Tipo.NORMALE,null,null),
		        new Sala(null,"Sala Premium IMAX", Tipo.IMAX,null,null),
		        new Sala(null,"Sala 3D Experience", Tipo.TRED,null,null)
		    );

		    List<Sala> saleSalvate = salaRepository.saveAll(saleDaInserire);

		    List<Posto> postiDaInserire = new ArrayList<>();

		    for (Sala sala : saleSalvate) {

		        for (int fila = 1; fila <= 3; fila++) {

		            for (int colonna = 1; colonna <= 5; colonna++) {

		                postiDaInserire.add(
		                    new Posto(
		                    		null,
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
