package org.elis.movieexplorer.dto.spettacolo.request;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
	private Long idSala;

	@NotNull
	private Long idFilm;
}
