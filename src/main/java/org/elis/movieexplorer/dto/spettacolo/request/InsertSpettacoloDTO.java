package org.elis.movieexplorer.dto.spettacolo.request;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class InsertSpettacoloDTO {
	@Future
	@NotNull
	private LocalDate data;
	
	@NotNull
	private LocalDateTime oraInizio;
	
	@NotNull
	private LocalDateTime oraFine;
	
	@NotNull
	private Long idSala;
	
	@NotNull
	private Long idFilm;
}
