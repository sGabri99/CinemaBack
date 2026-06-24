package org.elis.movieexplorer.dto.chat.response;

import java.time.LocalDateTime;

public class ResponseInfoChatDTO {
	private Long id;
	
	private String oggetto;
	
	private String stato;
	
	private Boolean messaggiNonVisualizzati;
	
	private String nome;
	
	private String cognome;
	
	private LocalDateTime dataUltimoMessaggio;
}
