package org.elis.movieexplorer.utility;

import java.util.ArrayList;
import java.util.Optional;

import org.elis.movieexplorer.model.Utente;
import org.elis.movieexplorer.model.enums.Ruolo;
import org.elis.movieexplorer.repository.UtenteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
	private final UtenteRepository utenteRepository;
	private final PasswordEncoder passwordEncoder;
	
	@Override
	public void run(String... args) throws Exception {
		Optional<Utente> optional = utenteRepository.findUtenteByEmail("admin@gmail.com");
		if(optional.isPresent()) {
			System.out.println("super già presente");
			return;
		}
		Utente utente = new Utente();
		utente.setNome("admin");
		utente.setCognome("admin");
		utente.setEmail("admin@gmail.com");
		utente.setPassword(passwordEncoder.encode("Password1!"));
		utente.setRuolo(Ruolo.SUPERADMIN);
		utente.setBiglietti(new ArrayList<>());
		utenteRepository.save(utente);
	}

}
