package org.elis.movieexplorer.service.definition;

import java.util.List;
import org.elis.movieexplorer.dto.chat.request.InsertChatDTO;
import org.elis.movieexplorer.dto.chat.response.ResponseChatDTO;
import org.elis.movieexplorer.dto.message.request.InsertMessageDTO;
import org.elis.movieexplorer.model.Utente;

public interface ChatService {


	void insertChat(InsertChatDTO dto, Utente utente);

	void insertMessage(InsertMessageDTO dto, Utente utente);

	List<ResponseChatDTO> findAllChats(Utente utente);

	ResponseChatDTO findChatById(Long idChat, Utente utente);

	ResponseChatDTO cambiaStatoChat(Long idChat);

	Integer countNotRead(Utente utente); 
}
