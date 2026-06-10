-- ======================================
-- MOVIE EXPLORER - DATA.SQL
-- Script di popolamento database
-- Date relative a partire da OGGI: 2026-06-10
-- ======================================

-- ======================================
-- TABELLA: GENERE (15 generi)
-- ======================================
INSERT INTO genere (nome) VALUES ('Azione');        -- 1
INSERT INTO genere (nome) VALUES ('Avventura');     -- 2
INSERT INTO genere (nome) VALUES ('Commedia');      -- 3
INSERT INTO genere (nome) VALUES ('Drammatico');    -- 4
INSERT INTO genere (nome) VALUES ('Thriller');      -- 5
INSERT INTO genere (nome) VALUES ('Horror');        -- 6
INSERT INTO genere (nome) VALUES ('Fantascienza');  -- 7
INSERT INTO genere (nome) VALUES ('Fantasy');       -- 8
INSERT INTO genere (nome) VALUES ('Animazione');    -- 9
INSERT INTO genere (nome) VALUES ('Romantico');     -- 10
INSERT INTO genere (nome) VALUES ('Noir');          -- 11
INSERT INTO genere (nome) VALUES ('Musical');       -- 12
INSERT INTO genere (nome) VALUES ('Western');       -- 13
INSERT INTO genere (nome) VALUES ('Documentario'); -- 14
INSERT INTO genere (nome) VALUES ('Biografico');   -- 15

-- ======================================
-- TABELLA: UTENTE
-- Password: "password123" (BCrypt)
-- ======================================
-- SuperAdmin
INSERT INTO utente (ruolo, nome, cognome, email, password)
VALUES (0, 'Mario', 'Rossi', 'admin@movieexplorer.it', '$2a$10$N9qo8uLOickgx2ZMRZoMyeIjZAgcfl7p92ldGxad68LJZdL17lhPy');

-- Staff
INSERT INTO utente (ruolo, nome, cognome, email, password)
VALUES (1, 'Luca', 'Bianchi', 'luca.bianchi@movieexplorer.it', '$2a$10$N9qo8uLOickgx2ZMRZoMyeIjZAgcfl7p92ldGxad68LJZdL17lhPy');

INSERT INTO utente (ruolo, nome, cognome, email, password)
VALUES (1, 'Giulia', 'Verdi', 'giulia.verdi@movieexplorer.it', '$2a$10$N9qo8uLOickgx2ZMRZoMyeIjZAgcfl7p92ldGxad68LJZdL17lhPy');

-- Clienti
INSERT INTO utente (ruolo, nome, cognome, email, password)
VALUES (2, 'Marco', 'Neri', 'marco.neri@gmail.com', '$2a$10$N9qo8uLOickgx2ZMRZoMyeIjZAgcfl7p92ldGxad68LJZdL17lhPy');

INSERT INTO utente (ruolo, nome, cognome, email, password)
VALUES (2, 'Anna', 'Ferrari', 'anna.ferrari@gmail.com', '$2a$10$N9qo8uLOickgx2ZMRZoMyeIjZAgcfl7p92ldGxad68LJZdL17lhPy');

INSERT INTO utente (ruolo, nome, cognome, email, password)
VALUES (2, 'Paolo', 'Romano', 'paolo.romano@email.it', '$2a$10$N9qo8uLOickgx2ZMRZoMyeIjZAgcfl7p92ldGxad68LJZdL17lhPy');

INSERT INTO utente (ruolo, nome, cognome, email, password)
VALUES (2, 'Sara', 'Colombo', 'sara.colombo@email.it', '$2a$10$N9qo8uLOickgx2ZMRZoMyeIjZAgcfl7p92ldGxad68LJZdL17lhPy');

INSERT INTO utente (ruolo, nome, cognome, email, password)
VALUES (2, 'Federico', 'Ricci', 'federico.ricci@email.it', '$2a$10$N9qo8uLOickgx2ZMRZoMyeIjZAgcfl7p92ldGxad68LJZdL17lhPy');

INSERT INTO utente (ruolo, nome, cognome, email, password)
VALUES (2, 'Elena', 'Marino', 'elena.marino@email.it', '$2a$10$N9qo8uLOickgx2ZMRZoMyeIjZAgcfl7p92ldGxad68LJZdL17lhPy');

INSERT INTO utente (ruolo, nome, cognome, email, password)
VALUES (2, 'Alessandro', 'Gallo', 'alessandro.gallo@email.it', '$2a$10$N9qo8uLOickgx2ZMRZoMyeIjZAgcfl7p92ldGxad68LJZdL17lhPy');

-- ======================================
-- TABELLA: SALA (7 sale)
-- Tipo: 0=TRED (3D, €15), 1=IMAX (€10), 2=NORMALE (€7)
-- ======================================
INSERT INTO sala (nome, numero_posti, tipo) VALUES ('Sala Apollo',   150, 2);  -- 1 NORMALE
INSERT INTO sala (nome, numero_posti, tipo) VALUES ('Sala Saturno',  200, 1);  -- 2 IMAX
INSERT INTO sala (nome, numero_posti, tipo) VALUES ('Sala Marte',    120, 0);  -- 3 3D
INSERT INTO sala (nome, numero_posti, tipo) VALUES ('Sala Giove',    180, 2);  -- 4 NORMALE
INSERT INTO sala (nome, numero_posti, tipo) VALUES ('Sala Venere',   100, 0);  -- 5 3D
INSERT INTO sala (nome, numero_posti, tipo) VALUES ('Sala Nettuno',  250, 1);  -- 6 IMAX
INSERT INTO sala (nome, numero_posti, tipo) VALUES ('Sala Mercurio',  80, 2);  -- 7 NORMALE

-- ======================================
-- TABELLA: FILM (20 film)
-- ======================================

-- Film 1
INSERT INTO film (titolo, descrizione, durata, attori, url_locandina)
VALUES (
    'Il Cavaliere Oscuro',
    'Batman si trova ad affrontare il suo nemico più temibile: il Joker, un criminale psicopatico che vuole gettare Gotham City nel caos totale.',
    152,
    'Christian Bale, Heath Ledger, Aaron Eckhart, Michael Caine, Maggie Gyllenhaal',
    'https://image.tmdb.org/t/p/w500/qJ2tW6WMUDux911r6m7haRef0WH.jpg'
);

-- Film 2
INSERT INTO film (titolo, descrizione, durata, attori, url_locandina)
VALUES (
    'Inception',
    'Un ladro che ruba segreti aziendali attraverso la tecnologia di condivisione dei sogni riceve il compito inverso di impiantare un''idea nella mente di un CEO.',
    148,
    'Leonardo DiCaprio, Marion Cotillard, Tom Hardy, Ellen Page, Joseph Gordon-Levitt',
    'https://image.tmdb.org/t/p/w500/8IB2e4r4oVhHnANbnm7O3Tj6tF8.jpg'
);

-- Film 3
INSERT INTO film (titolo, descrizione, durata, attori, url_locandina)
VALUES (
    'Interstellar',
    'Un gruppo di esploratori viaggia attraverso un wormhole nello spazio nel tentativo di garantire la sopravvivenza dell''umanità.',
    169,
    'Matthew McConaughey, Anne Hathaway, Jessica Chastain, Michael Caine, Matt Damon',
    'https://image.tmdb.org/t/p/w500/gEU2QniE6E77NI6lCU6MxlNBvIx.jpg'
);

-- Film 4
INSERT INTO film (titolo, descrizione, durata, attori, url_locandina)
VALUES (
    'Il Padrino',
    'La storia della famiglia Corleone sotto il patriarca Vito Corleone, concentrandosi sulla trasformazione del figlio Michael da riluttante estraneo a spietato boss mafioso.',
    175,
    'Marlon Brando, Al Pacino, James Caan, Robert Duvall, Diane Keaton',
    'https://image.tmdb.org/t/p/w500/3bhkrj58Vtu7enYsRolD1fZdja1.jpg'
);

-- Film 5
INSERT INTO film (titolo, descrizione, durata, attori, url_locandina)
VALUES (
    'Pulp Fiction',
    'Le vite di due sicari, un pugile, la moglie di un gangster e due rapinatori si intrecciano in quattro storie di violenza e redenzione.',
    154,
    'John Travolta, Samuel L. Jackson, Uma Thurman, Bruce Willis, Ving Rhames',
    'https://image.tmdb.org/t/p/w500/dRbM4p27pFA3BDOjrp3bTBSP7bj.jpg'
);

-- Film 6
INSERT INTO film (titolo, descrizione, durata, attori, url_locandina)
VALUES (
    'Matrix',
    'Un hacker informatico scopre dalla misteriosa ribelle Trinity che il mondo in cui vive è una simulazione creata dalle macchine.',
    136,
    'Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss, Hugo Weaving, Joe Pantoliano',
    'https://image.tmdb.org/t/p/w500/f89U3ADr1oiB1s9GkdPOEpXUk5H.jpg'
);

-- Film 7
INSERT INTO film (titolo, descrizione, durata, attori, url_locandina)
VALUES (
    'Forrest Gump',
    'Le presidenze di Kennedy e Johnson, la guerra del Vietnam e il Watergate si svolgono dal punto di vista di un uomo dell''Alabama con un QI di 75.',
    142,
    'Tom Hanks, Robin Wright, Gary Sinise, Sally Field, Mykelti Williamson',
    'https://image.tmdb.org/t/p/w500/arw2vcBveWOVZr6pxd9XTd1TdQa.jpg'
);

-- Film 8
INSERT INTO film (titolo, descrizione, durata, attori, url_locandina)
VALUES (
    'Avengers: Endgame',
    'Dopo gli eventi devastanti di Infinity War, gli Avengers si riuniscono per annullare le azioni di Thanos e ripristinare l''equilibrio nell''universo.',
    181,
    'Robert Downey Jr., Chris Evans, Mark Ruffalo, Chris Hemsworth, Scarlett Johansson',
    'https://image.tmdb.org/t/p/w500/or06FN3Dka5tukK1e9sl16pB3iy.jpg'
);

-- Film 9
INSERT INTO film (titolo, descrizione, durata, attori, url_locandina)
VALUES (
    'Il Signore degli Anelli: Il Ritorno del Re',
    'Gandalf e Aragorn guidano il Mondo degli Uomini contro l''esercito di Sauron mentre Frodo e Sam si avvicinano al Monte Fato con l''Unico Anello.',
    201,
    'Elijah Wood, Viggo Mortensen, Ian McKellen, Orlando Bloom, Sean Astin',
    'https://image.tmdb.org/t/p/w500/rCzpDGLbOoPwLjy3OAm5NUPOTrC.jpg'
);

-- Film 10
INSERT INTO film (titolo, descrizione, durata, attori, url_locandina)
VALUES (
    'Joker',
    'A Gotham City, il comico fallito Arthur Fleck viene spinto alla follia e diventa il criminale psicopatico noto come il Joker.',
    122,
    'Joaquin Phoenix, Robert De Niro, Zazie Beetz, Frances Conroy, Brett Cullen',
    'https://image.tmdb.org/t/p/w500/udDclJoHjfjb8Ekgsd4FDteOkCU.jpg'
);

-- Film 11
INSERT INTO film (titolo, descrizione, durata, attori, url_locandina)
VALUES (
    'Spider-Man: No Way Home',
    'Peter Parker chiede aiuto al Doctor Strange per far dimenticare al mondo la sua identità segreta, ma l''incantesimo apre il multiverso.',
    148,
    'Tom Holland, Zendaya, Benedict Cumberbatch, Jacob Batalon, Jon Favreau',
    'https://image.tmdb.org/t/p/w500/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg'
);

-- Film 12
INSERT INTO film (titolo, descrizione, durata, attori, url_locandina)
VALUES (
    'Dune',
    'Il figlio di una famiglia nobile viene affidato alla protezione del pianeta desertico più prezioso dell''universo, ricco di una droga che allunga la vita.',
    155,
    'Timothée Chalamet, Rebecca Ferguson, Oscar Isaac, Josh Brolin, Zendaya',
    'https://image.tmdb.org/t/p/w500/d5NXSklXo0qyIYkgV94XAgMIckC.jpg'
);

-- Film 13
INSERT INTO film (titolo, descrizione, durata, attori, url_locandina)
VALUES (
    'Toy Story 4',
    'Quando Bonnie aggiunge un riluttante giocattolo di nome Forky alla sua stanza, Woody scopre quanto grande possa essere il mondo per un giocattolo.',
    100,
    'Tom Hanks, Tim Allen, Annie Potts, Tony Hale, Keanu Reeves',
    'https://image.tmdb.org/t/p/w500/w9kR8qbmQ01HwnvK4alvnQ2ca0L.jpg'
);

-- Film 14
INSERT INTO film (titolo, descrizione, durata, attori, url_locandina)
VALUES (
    'Parasite',
    'L''avidità e la discriminazione di classe minacciano la relazione simbiotica appena formata tra la ricca famiglia Park e il clan impoverito dei Kim.',
    132,
    'Song Kang-ho, Lee Sun-kyun, Cho Yeo-jeong, Choi Woo-shik, Park So-dam',
    'https://image.tmdb.org/t/p/w500/7IiTTgloJzvGI1TAYymCfbfl3vT.jpg'
);

-- Film 15
INSERT INTO film (titolo, descrizione, durata, attori, url_locandina)
VALUES (
    'Coco',
    'Aspirante musicista Miguel entra nella Terra dei Morti per trovare il suo bisnonno, un leggendario cantante, e scopre il vero valore della famiglia.',
    105,
    'Anthony Gonzalez, Gael García Bernal, Benjamin Bratt, Alanna Ubach, Renée Victor',
    'https://image.tmdb.org/t/p/w500/gGEsBPAijhVUFoiNpgZXqRVWJt2.jpg'
);

-- Film 16
INSERT INTO film (titolo, descrizione, durata, attori, url_locandina)
VALUES (
    'Oppenheimer',
    'La storia del fisico J. Robert Oppenheimer e del suo ruolo nello sviluppo della bomba atomica durante il Progetto Manhattan nella Seconda Guerra Mondiale.',
    180,
    'Cillian Murphy, Emily Blunt, Matt Damon, Robert Downey Jr., Florence Pugh',
    'https://image.tmdb.org/t/p/w500/8Gxv8gSFCU0XGDykEGv7zR1n2ua.jpg'
);

-- Film 17
INSERT INTO film (titolo, descrizione, durata, attori, url_locandina)
VALUES (
    'Barbie',
    'Barbie e Ken vivono una vita perfetta a Barbieland. Quando però Barbie comincia ad avere pensieri sulla morte, parte per il mondo reale.',
    114,
    'Margot Robbie, Ryan Gosling, America Ferrera, Kate McKinnon, Issa Rae',
    'https://image.tmdb.org/t/p/w500/iuFNMS8vlbSam1rm1LVHsezHMbT.jpg'
);

-- Film 18
INSERT INTO film (titolo, descrizione, durata, attori, url_locandina)
VALUES (
    'Killers of the Flower Moon',
    'Negli anni ''20, i membri della tribù Osage vengono assassinati in circostanze misteriose, dando vita a una delle prime grandi indagini dell''FBI.',
    206,
    'Leonardo DiCaprio, Lily Gladstone, Robert De Niro, Jesse Plemons, Tantoo Cardinal',
    'https://image.tmdb.org/t/p/w500/dB6aLSGXt6IYMF0u8o5tTpnfqMA.jpg'
);

-- Film 19
INSERT INTO film (titolo, descrizione, durata, attori, url_locandina)
VALUES (
    'Poor Things',
    'La straordinaria storia di Bella Baxter, una giovane donna riportata in vita dal brillante e non ortodosso scienziato Dr. Godwin Baxter.',
    141,
    'Emma Stone, Mark Ruffalo, Willem Dafoe, Ramy Youssef, Christopher Abbott',
    'https://image.tmdb.org/t/p/w500/kCGlIMHnOm8JPXIbpAlB1qRVWMd.jpg'
);

-- Film 20
INSERT INTO film (titolo, descrizione, durata, attori, url_locandina)
VALUES (
    'Past Lives',
    'Nora e Hae Sung, due amici d''infanzia profondamente legati in Corea del Sud, si ritrovano a New York dopo decenni di separazione e si confrontano con il destino.',
    106,
    'Greta Lee, Teo Yoo, John Magaro, Moon Seung-ah, Ji Hye Yoo',
    'https://image.tmdb.org/t/p/w500/k3waqVXsnäskjfhaksjdh.jpg'
);

-- ======================================
-- TABELLA: FILM_GENERI (Many-to-Many)
-- ======================================
-- Film 1 - Il Cavaliere Oscuro: Azione, Drammatico, Thriller
INSERT INTO film_generi (films_id, generi_id) VALUES (1, 1);
INSERT INTO film_generi (films_id, generi_id) VALUES (1, 4);
INSERT INTO film_generi (films_id, generi_id) VALUES (1, 5);

-- Film 2 - Inception: Azione, Fantascienza, Thriller
INSERT INTO film_generi (films_id, generi_id) VALUES (2, 1);
INSERT INTO film_generi (films_id, generi_id) VALUES (2, 7);
INSERT INTO film_generi (films_id, generi_id) VALUES (2, 5);

-- Film 3 - Interstellar: Avventura, Drammatico, Fantascienza
INSERT INTO film_generi (films_id, generi_id) VALUES (3, 2);
INSERT INTO film_generi (films_id, generi_id) VALUES (3, 4);
INSERT INTO film_generi (films_id, generi_id) VALUES (3, 7);

-- Film 4 - Il Padrino: Drammatico, Noir
INSERT INTO film_generi (films_id, generi_id) VALUES (4, 4);
INSERT INTO film_generi (films_id, generi_id) VALUES (4, 11);

-- Film 5 - Pulp Fiction: Drammatico, Thriller, Noir
INSERT INTO film_generi (films_id, generi_id) VALUES (5, 4);
INSERT INTO film_generi (films_id, generi_id) VALUES (5, 5);
INSERT INTO film_generi (films_id, generi_id) VALUES (5, 11);

-- Film 6 - Matrix: Azione, Fantascienza
INSERT INTO film_generi (films_id, generi_id) VALUES (6, 1);
INSERT INTO film_generi (films_id, generi_id) VALUES (6, 7);

-- Film 7 - Forrest Gump: Drammatico, Romantico
INSERT INTO film_generi (films_id, generi_id) VALUES (7, 4);
INSERT INTO film_generi (films_id, generi_id) VALUES (7, 10);

-- Film 8 - Avengers: Endgame: Azione, Avventura, Fantascienza
INSERT INTO film_generi (films_id, generi_id) VALUES (8, 1);
INSERT INTO film_generi (films_id, generi_id) VALUES (8, 2);
INSERT INTO film_generi (films_id, generi_id) VALUES (8, 7);

-- Film 9 - Il Signore degli Anelli: Avventura, Fantasy
INSERT INTO film_generi (films_id, generi_id) VALUES (9, 2);
INSERT INTO film_generi (films_id, generi_id) VALUES (9, 8);

-- Film 10 - Joker: Drammatico, Thriller
INSERT INTO film_generi (films_id, generi_id) VALUES (10, 4);
INSERT INTO film_generi (films_id, generi_id) VALUES (10, 5);

-- Film 11 - Spider-Man: No Way Home: Azione, Avventura, Fantascienza
INSERT INTO film_generi (films_id, generi_id) VALUES (11, 1);
INSERT INTO film_generi (films_id, generi_id) VALUES (11, 2);
INSERT INTO film_generi (films_id, generi_id) VALUES (11, 7);

-- Film 12 - Dune: Avventura, Fantascienza
INSERT INTO film_generi (films_id, generi_id) VALUES (12, 2);
INSERT INTO film_generi (films_id, generi_id) VALUES (12, 7);

-- Film 13 - Toy Story 4: Animazione, Avventura, Commedia
INSERT INTO film_generi (films_id, generi_id) VALUES (13, 9);
INSERT INTO film_generi (films_id, generi_id) VALUES (13, 2);
INSERT INTO film_generi (films_id, generi_id) VALUES (13, 3);

-- Film 14 - Parasite: Drammatico, Thriller
INSERT INTO film_generi (films_id, generi_id) VALUES (14, 4);
INSERT INTO film_generi (films_id, generi_id) VALUES (14, 5);

-- Film 15 - Coco: Animazione, Avventura, Fantasy
INSERT INTO film_generi (films_id, generi_id) VALUES (15, 9);
INSERT INTO film_generi (films_id, generi_id) VALUES (15, 2);
INSERT INTO film_generi (films_id, generi_id) VALUES (15, 8);

-- Film 16 - Oppenheimer: Drammatico, Biografico, Thriller
INSERT INTO film_generi (films_id, generi_id) VALUES (16, 4);
INSERT INTO film_generi (films_id, generi_id) VALUES (16, 15);
INSERT INTO film_generi (films_id, generi_id) VALUES (16, 5);

-- Film 17 - Barbie: Commedia, Avventura
INSERT INTO film_generi (films_id, generi_id) VALUES (17, 3);
INSERT INTO film_generi (films_id, generi_id) VALUES (17, 2);

-- Film 18 - Killers of the Flower Moon: Drammatico, Thriller, Biografico
INSERT INTO film_generi (films_id, generi_id) VALUES (18, 4);
INSERT INTO film_generi (films_id, generi_id) VALUES (18, 5);
INSERT INTO film_generi (films_id, generi_id) VALUES (18, 15);

-- Film 19 - Poor Things: Drammatico, Commedia, Fantasy
INSERT INTO film_generi (films_id, generi_id) VALUES (19, 4);
INSERT INTO film_generi (films_id, generi_id) VALUES (19, 3);
INSERT INTO film_generi (films_id, generi_id) VALUES (19, 8);

-- Film 20 - Past Lives: Drammatico, Romantico
INSERT INTO film_generi (films_id, generi_id) VALUES (20, 4);
INSERT INTO film_generi (films_id, generi_id) VALUES (20, 10);

-- ======================================
-- TABELLA: SPETTACOLO
-- Base: OGGI = 2026-06-10
-- Orario ora_inizio/ora_fine come LocalDateTime
-- posti_rimanenti = numero_posti della sala (aggiornati da biglietti dopo)
-- ======================================

-- ============================================================
-- OGGI: 2026-06-10
-- ============================================================

-- Sala Apollo (NORMALE, 150p) - Il Cavaliere Oscuro (152 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-10', '2026-06-10 15:00:00', '2026-06-10 17:32:00', 150, 1, 1);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-10', '2026-06-10 18:00:00', '2026-06-10 20:32:00', 150, 1, 1);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-10', '2026-06-10 21:00:00', '2026-06-10 23:32:00', 150, 1, 1);

-- Sala Saturno (IMAX, 200p) - Dune (155 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-10', '2026-06-10 14:30:00', '2026-06-10 17:05:00', 200, 2, 12);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-10', '2026-06-10 17:30:00', '2026-06-10 20:05:00', 200, 2, 12);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-10', '2026-06-10 20:30:00', '2026-06-10 23:05:00', 200, 2, 12);

-- Sala Marte (3D, 120p) - Avengers: Endgame (181 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-10', '2026-06-10 16:00:00', '2026-06-10 19:01:00', 120, 3, 8);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-10', '2026-06-10 19:30:00', '2026-06-10 22:31:00', 120, 3, 8);

-- Sala Giove (NORMALE, 180p) - Inception (148 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-10', '2026-06-10 15:30:00', '2026-06-10 17:58:00', 180, 4, 2);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-10', '2026-06-10 18:30:00', '2026-06-10 20:58:00', 180, 4, 2);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-10', '2026-06-10 21:30:00', '2026-06-10 23:58:00', 180, 4, 2);

-- Sala Venere (3D, 100p) - Spider-Man: No Way Home (148 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-10', '2026-06-10 17:00:00', '2026-06-10 19:28:00', 100, 5, 11);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-10', '2026-06-10 20:00:00', '2026-06-10 22:28:00', 100, 5, 11);

-- Sala Mercurio (NORMALE, 80p) - Toy Story 4 (100 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-10', '2026-06-10 15:00:00', '2026-06-10 16:40:00', 80, 7, 13);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-10', '2026-06-10 17:00:00', '2026-06-10 18:40:00', 80, 7, 13);

-- ============================================================
-- DOMANI: 2026-06-11
-- ============================================================

-- Sala Apollo (NORMALE, 150p) - Joker (122 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-11', '2026-06-11 15:00:00', '2026-06-11 17:02:00', 150, 1, 10);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-11', '2026-06-11 17:30:00', '2026-06-11 19:32:00', 150, 1, 10);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-11', '2026-06-11 20:00:00', '2026-06-11 22:02:00', 150, 1, 10);

-- Sala Saturno (IMAX, 200p) - Interstellar (169 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-11', '2026-06-11 14:00:00', '2026-06-11 16:49:00', 200, 2, 3);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-11', '2026-06-11 17:15:00', '2026-06-11 20:04:00', 200, 2, 3);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-11', '2026-06-11 20:30:00', '2026-06-11 23:19:00', 200, 2, 3);

-- Sala Marte (3D, 120p) - Matrix (136 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-11', '2026-06-11 16:00:00', '2026-06-11 18:16:00', 120, 3, 6);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-11', '2026-06-11 18:45:00', '2026-06-11 21:01:00', 120, 3, 6);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-11', '2026-06-11 21:30:00', '2026-06-11 23:46:00', 120, 3, 6);

-- Sala Giove (NORMALE, 180p) - Il Padrino (175 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-11', '2026-06-11 15:00:00', '2026-06-11 17:55:00', 180, 4, 4);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-11', '2026-06-11 18:30:00', '2026-06-11 21:25:00', 180, 4, 4);

-- Sala Venere (3D, 100p) - Il Signore degli Anelli (201 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-11', '2026-06-11 16:00:00', '2026-06-11 19:21:00', 100, 5, 9);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-11', '2026-06-11 20:00:00', '2026-06-11 23:21:00', 100, 5, 9);

-- Sala Nettuno (IMAX, 250p) - Oppenheimer (180 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-11', '2026-06-11 14:30:00', '2026-06-11 17:30:00', 250, 6, 16);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-11', '2026-06-11 18:00:00', '2026-06-11 21:00:00', 250, 6, 16);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-11', '2026-06-11 21:30:00', '2026-06-12 00:30:00', 250, 6, 16);

-- Sala Mercurio (NORMALE, 80p) - Coco (105 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-11', '2026-06-11 15:00:00', '2026-06-11 16:45:00', 80, 7, 15);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-11', '2026-06-11 17:15:00', '2026-06-11 19:00:00', 80, 7, 15);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-11', '2026-06-11 19:30:00', '2026-06-11 21:15:00', 80, 7, 15);

-- ============================================================
-- DOPODOMANI: 2026-06-12
-- ============================================================

-- Sala Apollo (NORMALE, 150p) - Pulp Fiction (154 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-12', '2026-06-12 15:30:00', '2026-06-12 18:04:00', 150, 1, 5);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-12', '2026-06-12 18:30:00', '2026-06-12 21:04:00', 150, 1, 5);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-12', '2026-06-12 21:30:00', '2026-06-13 00:04:00', 150, 1, 5);

-- Sala Saturno (IMAX, 200p) - Dune (155 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-12', '2026-06-12 15:00:00', '2026-06-12 17:35:00', 200, 2, 12);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-12', '2026-06-12 18:00:00', '2026-06-12 20:35:00', 200, 2, 12);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-12', '2026-06-12 21:00:00', '2026-06-12 23:35:00', 200, 2, 12);

-- Sala Marte (3D, 120p) - Spider-Man: No Way Home (148 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-12', '2026-06-12 16:30:00', '2026-06-12 18:58:00', 120, 3, 11);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-12', '2026-06-12 19:30:00', '2026-06-12 21:58:00', 120, 3, 11);

-- Sala Giove (NORMALE, 180p) - Forrest Gump (142 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-12', '2026-06-12 15:00:00', '2026-06-12 17:22:00', 180, 4, 7);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-12', '2026-06-12 18:00:00', '2026-06-12 20:22:00', 180, 4, 7);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-12', '2026-06-12 21:00:00', '2026-06-12 23:22:00', 180, 4, 7);

-- Sala Venere (3D, 100p) - Barbie (114 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-12', '2026-06-12 15:00:00', '2026-06-12 16:54:00', 100, 5, 17);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-12', '2026-06-12 17:30:00', '2026-06-12 19:24:00', 100, 5, 17);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-12', '2026-06-12 20:00:00', '2026-06-12 21:54:00', 100, 5, 17);

-- Sala Nettuno (IMAX, 250p) - Interstellar (169 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-12', '2026-06-12 14:00:00', '2026-06-12 16:49:00', 250, 6, 3);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-12', '2026-06-12 17:15:00', '2026-06-12 20:04:00', 250, 6, 3);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-12', '2026-06-12 20:30:00', '2026-06-12 23:19:00', 250, 6, 3);

-- Sala Mercurio (NORMALE, 80p) - Parasite (132 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-12', '2026-06-12 16:00:00', '2026-06-12 18:12:00', 80, 7, 14);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-12', '2026-06-12 18:45:00', '2026-06-12 20:57:00', 80, 7, 14);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-12', '2026-06-12 21:30:00', '2026-06-12 23:42:00', 80, 7, 14);

-- ============================================================
-- FINE SETTIMANA: 2026-06-13 (Sabato)
-- ============================================================

-- Sala Apollo (NORMALE, 150p) - Il Cavaliere Oscuro (152 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-13', '2026-06-13 14:00:00', '2026-06-13 16:32:00', 150, 1, 1);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-13', '2026-06-13 17:00:00', '2026-06-13 19:32:00', 150, 1, 1);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-13', '2026-06-13 20:00:00', '2026-06-13 22:32:00', 150, 1, 1);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-13', '2026-06-13 23:00:00', '2026-06-14 01:32:00', 150, 1, 1);

-- Sala Saturno (IMAX, 200p) - Avengers: Endgame (181 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-13', '2026-06-13 13:00:00', '2026-06-13 16:01:00', 200, 2, 8);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-13', '2026-06-13 16:30:00', '2026-06-13 19:31:00', 200, 2, 8);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-13', '2026-06-13 20:00:00', '2026-06-13 23:01:00', 200, 2, 8);

-- Sala Marte (3D, 120p) - Il Signore degli Anelli (201 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-13', '2026-06-13 14:30:00', '2026-06-13 17:51:00', 120, 3, 9);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-13', '2026-06-13 18:30:00', '2026-06-13 21:51:00', 120, 3, 9);

-- Sala Giove (NORMALE, 180p) - Matrix (136 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-13', '2026-06-13 15:00:00', '2026-06-13 17:16:00', 180, 4, 6);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-13', '2026-06-13 17:45:00', '2026-06-13 20:01:00', 180, 4, 6);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-13', '2026-06-13 20:30:00', '2026-06-13 22:46:00', 180, 4, 6);

-- Sala Venere (3D, 100p) - Toy Story 4 (100 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-13', '2026-06-13 14:00:00', '2026-06-13 15:40:00', 100, 5, 13);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-13', '2026-06-13 16:00:00', '2026-06-13 17:40:00', 100, 5, 13);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-13', '2026-06-13 18:00:00', '2026-06-13 19:40:00', 100, 5, 13);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-13', '2026-06-13 20:00:00', '2026-06-13 21:40:00', 100, 5, 13);

-- Sala Nettuno (IMAX, 250p) - Killers of the Flower Moon (206 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-13', '2026-06-13 13:30:00', '2026-06-13 17:56:00', 250, 6, 18);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-13', '2026-06-13 18:30:00', '2026-06-13 22:56:00', 250, 6, 18);

-- Sala Mercurio (NORMALE, 80p) - Coco (105 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-13', '2026-06-13 14:30:00', '2026-06-13 16:15:00', 80, 7, 15);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-13', '2026-06-13 16:45:00', '2026-06-13 18:30:00', 80, 7, 15);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-13', '2026-06-13 19:00:00', '2026-06-13 20:45:00', 80, 7, 15);

-- ============================================================
-- DOMENICA: 2026-06-14
-- ============================================================

-- Sala Apollo (NORMALE, 150p) - Barbie (114 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-14', '2026-06-14 14:30:00', '2026-06-14 16:24:00', 150, 1, 17);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-14', '2026-06-14 17:00:00', '2026-06-14 18:54:00', 150, 1, 17);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-14', '2026-06-14 19:30:00', '2026-06-14 21:24:00', 150, 1, 17);

-- Sala Saturno (IMAX, 200p) - Oppenheimer (180 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-14', '2026-06-14 14:00:00', '2026-06-14 17:00:00', 200, 2, 16);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-14', '2026-06-14 17:30:00', '2026-06-14 20:30:00', 200, 2, 16);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-14', '2026-06-14 21:00:00', '2026-06-15 00:00:00', 200, 2, 16);

-- Sala Giove (NORMALE, 180p) - Poor Things (141 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-14', '2026-06-14 15:00:00', '2026-06-14 17:21:00', 180, 4, 19);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-14', '2026-06-14 18:00:00', '2026-06-14 20:21:00', 180, 4, 19);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-14', '2026-06-14 21:00:00', '2026-06-14 23:21:00', 180, 4, 19);

-- Sala Nettuno (IMAX, 250p) - Dune (155 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-14', '2026-06-14 13:30:00', '2026-06-14 16:05:00', 250, 6, 12);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-14', '2026-06-14 16:30:00', '2026-06-14 19:05:00', 250, 6, 12);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-14', '2026-06-14 19:30:00', '2026-06-14 22:05:00', 250, 6, 12);

-- Sala Mercurio (NORMALE, 80p) - Past Lives (106 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-14', '2026-06-14 15:30:00', '2026-06-14 17:16:00', 80, 7, 20);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-14', '2026-06-14 17:45:00', '2026-06-14 19:31:00', 80, 7, 20);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-14', '2026-06-14 20:00:00', '2026-06-14 21:46:00', 80, 7, 20);

-- ============================================================
-- PROSSIMA SETTIMANA: 2026-06-17 (Martedì)
-- ============================================================

-- Sala Apollo (NORMALE, 150p) - Joker (122 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-17', '2026-06-17 16:00:00', '2026-06-17 18:02:00', 150, 1, 10);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-17', '2026-06-17 18:30:00', '2026-06-17 20:32:00', 150, 1, 10);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-17', '2026-06-17 21:00:00', '2026-06-17 23:02:00', 150, 1, 10);

-- Sala Saturno (IMAX, 200p) - Killers of the Flower Moon (206 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-17', '2026-06-17 14:00:00', '2026-06-17 17:26:00', 200, 2, 18);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-17', '2026-06-17 18:00:00', '2026-06-17 21:26:00', 200, 2, 18);

-- Sala Giove (NORMALE, 180p) - Past Lives (106 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-17', '2026-06-17 15:30:00', '2026-06-17 17:16:00', 180, 4, 20);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-17', '2026-06-17 17:45:00', '2026-06-17 19:31:00', 180, 4, 20);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-17', '2026-06-17 20:00:00', '2026-06-17 21:46:00', 180, 4, 20);

-- Sala Nettuno (IMAX, 250p) - Avengers: Endgame (181 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-17', '2026-06-17 16:00:00', '2026-06-17 19:01:00', 250, 6, 8);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-17', '2026-06-17 19:30:00', '2026-06-17 22:31:00', 250, 6, 8);

-- ============================================================
-- 2026-06-20 (Sabato)
-- ============================================================

-- Sala Apollo (NORMALE, 150p) - Oppenheimer (180 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-20', '2026-06-20 14:00:00', '2026-06-20 17:00:00', 150, 1, 16);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-20', '2026-06-20 17:30:00', '2026-06-20 20:30:00', 150, 1, 16);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-20', '2026-06-20 21:00:00', '2026-06-21 00:00:00', 150, 1, 16);

-- Sala Saturno (IMAX, 200p) - Interstellar (169 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-20', '2026-06-20 13:30:00', '2026-06-20 16:19:00', 200, 2, 3);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-20', '2026-06-20 16:45:00', '2026-06-20 19:34:00', 200, 2, 3);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-20', '2026-06-20 20:00:00', '2026-06-20 22:49:00', 200, 2, 3);

-- Sala Marte (3D, 120p) - Poor Things (141 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-20', '2026-06-20 15:00:00', '2026-06-20 17:21:00', 120, 3, 19);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-20', '2026-06-20 18:00:00', '2026-06-20 20:21:00', 120, 3, 19);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-20', '2026-06-20 21:00:00', '2026-06-20 23:21:00', 120, 3, 19);

-- Sala Nettuno (IMAX, 250p) - Il Signore degli Anelli (201 min)
INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-20', '2026-06-20 14:00:00', '2026-06-20 17:21:00', 250, 6, 9);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-20', '2026-06-20 18:00:00', '2026-06-20 21:21:00', 250, 6, 9);

INSERT INTO spettacolo (data, ora_inizio, ora_fine, posti_rimanenti, sala_id, film_id)
VALUES ('2026-06-20', '2026-06-20 22:00:00', '2026-06-21 01:21:00', 250, 6, 9);

-- ======================================
-- TABELLA: BIGLIETTO
-- ======================================

-- Marco Neri (id=4)
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (4, 1);   -- Il Cavaliere Oscuro oggi 15:00
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (4, 1);   -- secondo biglietto stesso spettacolo
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (4, 16);  -- Joker domani 15:00

-- Anna Ferrari (id=5)
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (5, 7);   -- Avengers oggi 16:00
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (5, 31);  -- Il Signore degli Anelli domani 16:00
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (5, 14);  -- Toy Story oggi 15:00

-- Paolo Romano (id=6)
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (6, 4);   -- Dune oggi 14:30
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (6, 5);   -- Dune oggi 17:30
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (6, 20);  -- Interstellar domani 14:00

-- Sara Colombo (id=7)
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (7, 14);  -- Toy Story oggi 15:00
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (7, 15);  -- Toy Story oggi 17:00
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (7, 35);  -- Coco domani 15:00
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (7, 36);  -- Coco domani 17:15

-- Federico Ricci (id=8)
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (8, 9);   -- Inception oggi 15:30
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (8, 10);  -- Inception oggi 18:30
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (8, 32);  -- Il Signore degli Anelli domani 20:00

-- Elena Marino (id=9)
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (9, 12);  -- Spider-Man oggi 17:00
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (9, 13);  -- Spider-Man oggi 20:00
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (9, 33);  -- Oppenheimer domani 14:30

-- Alessandro Gallo (id=10)
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (10, 26); -- Il Padrino domani 15:00
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (10, 6);  -- Dune oggi 20:30
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (10, 21); -- Interstellar domani 17:15

-- Biglietti multipli per lo stesso spettacolo (per testare la logica dei posti rimanenti)
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (4, 2);
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (5, 2);
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (6, 2);
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (7, 2);
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (8, 2);

INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (4, 8);
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (5, 8);
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (6, 8);
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (7, 8);
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (8, 8);

INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (4, 6);
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (5, 6);
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (6, 6);
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (7, 6);
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (8, 6);
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (9, 6);
INSERT INTO biglietto (utente_id, spettacolo_id) VALUES (10, 6);

-- ======================================
-- AGGIORNAMENTO POSTI RIMANENTI
-- Ricalcola i posti in base ai biglietti venduti
-- ======================================
UPDATE spettacolo SET posti_rimanenti = (
    SELECT numero_posti - (SELECT COUNT(*) FROM biglietto WHERE biglietto.spettacolo_id = spettacolo.id)
    FROM sala WHERE sala.id = spettacolo.sala_id
);

-- ======================================
-- RIEPILOGO DATI INSERITI
-- ======================================
-- Generi:     15
-- Utenti:     10 (1 SuperAdmin, 2 Staff, 7 Clienti)
-- Sale:        7 (2 NORMALE posti-piccoli, 2 IMAX, 2 3D, 1 NORMALE grande)
-- Film:       20
-- Spettacoli: ~110 distribuiti su 6 giorni (10, 11, 12, 13, 14, 17, 20 giugno 2026)
-- Biglietti:  ~42
-- Password:   "password123" per tutti gli utenti
-- ======================================
