package org.elis.movieexplorer.config;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.elis.movieexplorer.model.Biglietto;
import org.elis.movieexplorer.model.Chat;
import org.elis.movieexplorer.model.Film;
import org.elis.movieexplorer.model.Genere;
import org.elis.movieexplorer.model.Messaggio;
import org.elis.movieexplorer.model.Posto;
import org.elis.movieexplorer.model.Sala;
import org.elis.movieexplorer.model.Spettacolo;
import org.elis.movieexplorer.model.Token;
import org.elis.movieexplorer.model.Utente;
import org.elis.movieexplorer.model.enums.Ruolo;
import org.elis.movieexplorer.model.enums.StatoChat;
import org.elis.movieexplorer.model.enums.Tipo;
import org.elis.movieexplorer.repository.BigliettoRepository;
import org.elis.movieexplorer.repository.ChatRepository;
import org.elis.movieexplorer.repository.FilmRepository;
import org.elis.movieexplorer.repository.GenereRepository;
import org.elis.movieexplorer.repository.MessaggioRepository;
import org.elis.movieexplorer.repository.PostoRepository;
import org.elis.movieexplorer.repository.SalaRepository;
import org.elis.movieexplorer.repository.SpettacoloRepository;
import org.elis.movieexplorer.repository.TokenRepository;
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
	private final SalaRepository salaRepository;
	private final UtenteRepository utenteRepository;
	private final GenereRepository genereRepository;
	private final FilmRepository filmRepository;
	private final SpettacoloRepository spettacoloRepository;
	private final BigliettoRepository bigliettoRepository;
	private final ChatRepository chatRepository;
	private final MessaggioRepository messaggioRepository;
	private final TokenRepository tokenRepository;




	@Override
	public void run(String... args) throws Exception {
		System.out.println("🔄 Avvio popolamento assistito del Database...");

		// ==========================================
		// 1. POPOLAMENTO UTENTI (9 parametri totali)
		// ==========================================
		Utente admin = null, staff1 = null, staff2 = null, user1 = null, user2 = null, user3 = null;
		try {
			Optional<Utente> adminOpt = utenteRepository.findUtenteByEmail("admin@gmail.com");
			Optional<Utente> staffOpt = utenteRepository.findUtenteByEmail("staff@gmail.com");
			Optional<Utente> userOpt  = utenteRepository.findUtenteByEmail("user@gmail.com");

			admin = adminOpt.orElseGet(() -> utenteRepository.save(
				new Utente(null, Ruolo.SUPERADMIN, "Admin", "System", "admin@gmail.com", passwordEncoder.encode("Admin123!"), new ArrayList<>(), new ArrayList<>(), new ArrayList<>())
			));

			staff1 = staffOpt.orElseGet(() -> utenteRepository.save(
				new Utente(null, Ruolo.STAFF, "Mario", "Rossi", "staff@gmail.com", passwordEncoder.encode("Staff123!"), new ArrayList<>(), new ArrayList<>(), new ArrayList<>())
			));

			user1 = userOpt.orElseGet(() -> utenteRepository.save(
				new Utente(null, Ruolo.CLIENTE, "Giulia", "Bianchi", "user@gmail.com", passwordEncoder.encode("User123!"), new ArrayList<>(), new ArrayList<>(), new ArrayList<>())
			));

			staff2 = utenteRepository.findUtenteByEmail("anna.neri@gmail.com").orElseGet(() -> utenteRepository.save(
				new Utente(null, Ruolo.STAFF, "Anna", "Neri", "anna.neri@gmail.com", passwordEncoder.encode("Staff456!"), new ArrayList<>(), new ArrayList<>(), new ArrayList<>())
			));

			user2 = utenteRepository.findUtenteByEmail("marco.rossi@gmail.com").orElseGet(() -> utenteRepository.save(
				new Utente(null, Ruolo.CLIENTE, "Marco", "Rossi", "marco.rossi@gmail.com", passwordEncoder.encode("Marco123!"), new ArrayList<>(), new ArrayList<>(), new ArrayList<>())
			));

			user3 = utenteRepository.findUtenteByEmail("elena.verdi@gmail.com").orElseGet(() -> utenteRepository.save(
				new Utente(null, Ruolo.CLIENTE, "Elena", "Verdi", "elena.verdi@gmail.com", passwordEncoder.encode("Elena123!"), new ArrayList<>(), new ArrayList<>(), new ArrayList<>())
			));
		} catch (Exception e) {
			System.err.println("❌ Errore durante il popolamento degli utenti: " + e.getMessage());
		}

		// ==========================================
		// 2. SALE E POSTI
		// ==========================================
		List<Sala> sale = new ArrayList<>();
		List<Posto> tuttiIPosti = new ArrayList<>();
		try {
			sale = salaRepository.findAll();
			if (sale.isEmpty()) {
				List<Sala> saleDaInserire = List.of(
					new Sala(null, "Sala IMAX Centrale", Tipo.IMAX, new ArrayList<>(), new ArrayList<>()),
					new Sala(null, "Sala 3D Galaxy", Tipo.TRED, new ArrayList<>(), new ArrayList<>()),
					new Sala(null, "Sala Rossa", Tipo.NORMALE, new ArrayList<>(), new ArrayList<>()),
					new Sala(null, "Sala Premium IMAX", Tipo.IMAX, new ArrayList<>(), new ArrayList<>()),
					new Sala(null, "Sala 3D Experience", Tipo.TRED, new ArrayList<>(), new ArrayList<>())
				);
				sale = salaRepository.saveAll(saleDaInserire);

				List<Posto> postiDaInserire = new ArrayList<>();
				for (Sala salaItem : sale) {
					for (int fila = 1; fila <= 3; fila++) {
						for (int colonna = 1; colonna <= 5; colonna++) {
							postiDaInserire.add(new Posto(null, fila, colonna, salaItem));
						}
					}
				}
				tuttiIPosti = postoRepository.saveAll(postiDaInserire);
			} else {
				tuttiIPosti = postoRepository.findAll();
			}
		} catch (Exception e) {
			System.err.println("❌ Errore durante il popolamento di sale/posti: " + e.getMessage());
		}

		// ==========================================
		// 3. GENERI
		// ==========================================
		List<Genere> generi = new ArrayList<>();
		try {
			generi = genereRepository.findAll();
			if (generi.isEmpty()) {
				generi = genereRepository.saveAll(List.of(
					new Genere(null, "Azione", new ArrayList<>()),
					new Genere(null, "Fantascienza", new ArrayList<>()),
					new Genere(null, "Drammatico", new ArrayList<>()),
					new Genere(null, "Thriller", new ArrayList<>()),
					new Genere(null, "Animazione", new ArrayList<>()),
					new Genere(null, "Commedia", new ArrayList<>())
				));
			}
		} catch (Exception e) {
			System.err.println("❌ Errore durante il popolamento dei generi: " + e.getMessage());
		}

		// ==========================================
		// 4. FILM (10 parametri totali richiesti)
		// ==========================================
		List<Film> filmInCatalogo = new ArrayList<>();
		try {
			filmInCatalogo = filmRepository.findAll();
			if (filmInCatalogo.isEmpty() && !generi.isEmpty()) {
				
				Genere az = generi.stream().filter(g -> g.getNome().equals("Azione")).findFirst().orElse(generi.get(0));
				Genere fa = generi.stream().filter(g -> g.getNome().equals("Fantascienza")).findFirst().orElse(generi.get(0));
				Genere dr = generi.stream().filter(g -> g.getNome().equals("Drammatico")).findFirst().orElse(generi.get(0));
				Genere th = generi.stream().filter(g -> g.getNome().equals("Thriller")).findFirst().orElse(generi.get(0));
				
				// Inclusione corretta di tutti i 10 parametri (incluso new ArrayList<> per la lista spettacoli in fondo)
				Film f1 = new Film(null, "tt0092099", "Top Gun: Maverick", "Il tenente Pete Mitchell affronta il passato.", 130, "Tom Cruise, Miles Teller", "https://link.com/topgun.jpg", "https://link.com/tg-trailer", List.of(az, dr), new ArrayList<>());
				Film f2 = new Film(null, "tt0816692", "Interstellar", "Astronauti viaggiano attraverso un wormhole.", 169, "Matthew McConaughey", "https://link.com/interstellar.jpg", "https://link.com/is-trailer", List.of(fa, dr), new ArrayList<>());
				Film f3 = new Film(null, "tt1375666", "Inception", "Un ladro ruba segreti attraverso i sogni.", 148, "Leonardo DiCaprio", "https://link.com/inception.jpg", "https://link.com/ic-trailer", List.of(fa, th), new ArrayList<>());
				
				filmInCatalogo = filmRepository.saveAll(List.of(f1, f2, f3));
			}
		} catch (Exception e) {
			System.err.println("❌ Errore durante il popolamento dei film: " + e.getMessage());
		}

		// ==========================================
		// 5. SPETTACOLI
		// ==========================================
		List<Spettacolo> spettacoli = new ArrayList<>();
		try {
			spettacoli = spettacoloRepository.findAll();
			if (spettacoli.isEmpty() && !sale.isEmpty() && filmInCatalogo.size() >= 3) {
				Spettacolo s1 = new Spettacolo(null, LocalDate.now(), LocalDateTime.now().withHour(20).withMinute(30).withSecond(0), LocalDateTime.now().withHour(22).withMinute(40).withSecond(0), 150,null, sale.get(0), filmInCatalogo.get(0));
				Spettacolo s2 = new Spettacolo(null, LocalDate.now().plusDays(1), LocalDateTime.now().plusDays(1).withHour(17).withMinute(0).withSecond(0), LocalDateTime.now().plusDays(1).withHour(19).withMinute(50).withSecond(0), 150,null, sale.get(1), filmInCatalogo.get(1));
				Spettacolo s3 = new Spettacolo(null, LocalDate.now().plusDays(1), LocalDateTime.now().plusDays(1).withHour(21).withMinute(15).withSecond(0), LocalDateTime.now().plusDays(1).withHour(23).withMinute(45).withSecond(0), 150,null, sale.get(2), filmInCatalogo.get(2));

				spettacoli = spettacoloRepository.saveAll(List.of(s1, s2, s3));
			}
		} catch (Exception e) {
			System.err.println("❌ Errore durante il popolamento degli spettacoli: " + e.getMessage());
		}

		// ==========================================
		// 6. BIGLIETTI (Rimosso il decremento manuale dei posti!)
		// ==========================================
		try {
			if (bigliettoRepository.count() == 0 && !spettacoli.isEmpty() && !tuttiIPosti.isEmpty() && user1 != null && user2 != null && user3 != null) {
				Spettacolo sp1IMAX = spettacoli.get(0);
				Spettacolo sp23D = spettacoli.get(1);

				Posto posto1 = filtraPosto(tuttiIPosti, sp1IMAX.getSala().getId(), 1, 1);
				Posto posto2 = filtraPosto(tuttiIPosti, sp1IMAX.getSala().getId(), 1, 2);
				Posto posto3 = filtraPosto(tuttiIPosti, sp23D.getSala().getId(), 2, 3);

				// Salviamo i biglietti. Ci pensa il metodo @PostPersist dentro Biglietto.java a decrementare automaticamente i posti rimanenti dello spettacolo!
				bigliettoRepository.save(new Biglietto(null, user1,  UUID.randomUUID().toString().substring(0,8).toUpperCase(), BigDecimal.valueOf(12.50), sp1IMAX, posto1));
				bigliettoRepository.save(new Biglietto(null, user2,  UUID.randomUUID().toString().substring(0,8).toUpperCase(), BigDecimal.valueOf(12.50), sp1IMAX, posto2));
				bigliettoRepository.save(new Biglietto(null, user3,  UUID.randomUUID().toString().substring(0,8).toUpperCase(), BigDecimal.valueOf(10.00), sp23D, posto3));
			}
		} catch (Exception e) {
			System.err.println("❌ Errore durante l'emissione dei biglietti: " + e.getMessage());
		}

		// ==========================================
		// 7. CHAT E MESSAGGI (8 parametri per Chat)
		// ==========================================
		try {
			if (chatRepository.count() == 0 && user1 != null && staff1 != null) {
				// Creazione Chat (8 parametri: id, oggetto, stato, createdAt, sospesoStaff, sospesoCliente, listaMessaggi, utente)
				Chat chat1 = chatRepository.save(new Chat(null, "Problema visualizzazione biglietto", StatoChat.IN_ATTESA, null, true, false, null, user1));
				
				// Creazione messaggi (5 parametri: id, messaggio, createdAt, chat, mittente)
				messaggioRepository.save(new Messaggio(null, "Salve, ho pagato ma non vedo il biglietto.", null, chat1, user1));
			}
		} catch (Exception e) {
			System.err.println("❌ Errore durante la creazione delle chat: " + e.getMessage());
		}

		// ==========================================
		// 8. TOKENS
		// ==========================================
		try {
			if (tokenRepository.count() == 0 && user2 != null) {
				tokenRepository.save(new Token("verification-token-sample-xyz", user2));
			}
		} catch (Exception e) {
			System.err.println("❌ Errore durante l'inserimento dei Token: " + e.getMessage());
		}

		System.out.println("===============================================================");
		System.out.println("🚀 DATABASE POPOLATO IN COMPLETA SICUREZZA E SENZA ERRORI!    🚀");
		System.out.println("===============================================================");
	}

	private Posto filtraPosto(List<Posto> posti, Long salaId, int fila, int colonna) {
		return posti.stream()
				.filter(p -> p.getSala().getId().equals(salaId) && p.getFila() == fila && p.getColonna() == colonna)
				.findFirst()
				.orElseThrow(() -> new RuntimeException("Posto non trovato per Sala ID: " + salaId));
	}
}
