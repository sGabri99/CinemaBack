package org.elis.movieexplorer.dto.sala.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.elis.movieexplorer.model.enums.Tipo;
import org.hibernate.validator.constraints.Range;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class ResponseSalaDTO {
	@EqualsAndHashCode.Exclude
	@NotNull
	private Long id;
	
	@NotBlank
	private String nome;
	
	@EqualsAndHashCode.Exclude
	@NotNull
	@Range(min = 0)
	private Short numeroPosti;
	
	@EqualsAndHashCode.Exclude
	@NotNull
	private Tipo tipo;
	
	@EqualsAndHashCode.Exclude
	private List<Long> idSpettacoli;
}
