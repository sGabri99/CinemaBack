package org.elis.movieexplorer.dto.film.response;

import java.util.List;

import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class ResponseFilmDTO {
	@EqualsAndHashCode.Exclude
	@NotNull
	private Long id;
	
	@NotBlank
	private String titolo;
	
	@EqualsAndHashCode.Exclude
	@NotBlank
	private String descrizione;
	
	@EqualsAndHashCode.Exclude
	@NotNull
	@Range(min = 0, max = 500)
	private Integer durata;
	
	@EqualsAndHashCode.Exclude
	@NotBlank
	private String attori;
	
	@EqualsAndHashCode.Exclude
	@NotBlank
	@URL
	private String urlLocandina;

	@EqualsAndHashCode.Exclude
	private String urlTrailer;
	
	@EqualsAndHashCode.Exclude
	@NotEmpty
	private List<String> nomeGeneri;

}
