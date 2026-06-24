package org.elis.movieexplorer.dto.chat.request;

import org.elis.movieexplorer.model.enums.StatoChat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateChatDTO {
	@NotBlank
	private String oggetto;
	
	@NotNull
	private StatoChat stato;
	
	@NotNull
	private Long utenteId;
}
