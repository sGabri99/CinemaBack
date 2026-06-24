package org.elis.movieexplorer.service.definition;

import java.util.List;
import org.elis.movieexplorer.dto.chat.request.CreateChatDTO;
import org.elis.movieexplorer.dto.chat.response.ResponseChatDTO;
import org.elis.movieexplorer.dto.message.request.InsertMessageDTO;
import org.elis.movieexplorer.dto.message.response.ResponseMessageDTO;
import org.elis.movieexplorer.model.Utente;

public interface ChatService {

	ResponseChatDTO insertChat(CreateChatDTO dto, Utente utente);

	ResponseMessageDTO insertMessage(InsertMessageDTO dto, Utente utente);

	List<ResponseChatDTO> findAllChats();

	List<ResponseChatDTO> findAllChatsByUtente(Long utenteId);

	ResponseChatDTO findChatById(Long idChat);

	ResponseChatDTO cambiaStatoChat(Long idChat);
}
