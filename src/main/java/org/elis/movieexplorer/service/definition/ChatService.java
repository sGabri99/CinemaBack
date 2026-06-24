package org.elis.movieexplorer.service.definition;

import java.util.List;
import org.elis.movieexplorer.dto.chat.request.CreateChatDTO;
import org.elis.movieexplorer.dto.chat.response.ResponseChatDTO;
import org.elis.movieexplorer.dto.message.request.InsertMessageDTO;
import org.elis.movieexplorer.dto.message.response.ResponseMessageDTO;

public interface ChatService {
	ResponseChatDTO insertChat(CreateChatDTO dto);
	ResponseMessageDTO insertMessage(InsertMessageDTO dto);
	List<ResponseChatDTO> findAllChats();
	List<ResponseChatDTO> findAllChatsByUtente(Long utenteId);
}
