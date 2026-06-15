package org.elis.movieexplorer.dto.spettacolo.response;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class ResponseSpettacoloDTO {
	@NotNull
	private Long id;

	@EqualsAndHashCode.Exclude
	@NotNull
	@Future
	private LocalDate data;

	@EqualsAndHashCode.Exclude
	@NotNull
	private LocalDateTime oraInizio;
	
	@EqualsAndHashCode.Exclude
	@NotNull
	@Future
	private LocalDateTime oraFine;
	
	@EqualsAndHashCode.Exclude
	@NotNull
	private Short postiRimanenti;
	
	@EqualsAndHashCode.Exclude
	private List<Long> idBiglietti;
	
	@EqualsAndHashCode.Exclude
	@NotNull
	private String nomeSala;
	
	@EqualsAndHashCode.Exclude
	@NotNull
	private String nomeFilm;
	
	@EqualsAndHashCode.Exclude
	@NotNull
	private Long idFilm;
}
