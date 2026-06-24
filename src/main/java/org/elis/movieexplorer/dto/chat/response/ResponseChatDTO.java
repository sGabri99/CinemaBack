package org.elis.movieexplorer.dto.chat.response;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseChatDTO {
	private Long id;
	
	private String oggetto;
	
	private String stato;
	
	private LocalDateTime createdAt;
	
	private Long utenteId;
}
