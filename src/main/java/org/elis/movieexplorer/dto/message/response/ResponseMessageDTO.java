package org.elis.movieexplorer.dto.message.response;

import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseMessageDTO {
	@NotNull
	private Long id;
	
	@NotBlank
	private String messaggio;

	@NotNull
	private boolean visualizzato;
	
	@NotNull
	@DateTimeFormat
	private LocalDateTime createdAt;
	
	@NotNull
	private Long chatId;

	@NotNull
	private Long mittenteId;
}
