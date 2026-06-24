package org.elis.movieexplorer.dto.message.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsertMessageDTO {
	
	@NotBlank
	private String messaggio;

	@NotNull
	private boolean visualizzato;
	
	@NotNull
	private Long chatId;

	@NotNull
	private Long mittenteId;
}
