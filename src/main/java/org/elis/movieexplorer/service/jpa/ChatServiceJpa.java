package org.elis.movieexplorer.service.jpa;

import java.util.List;
import java.util.Optional;
import org.elis.movieexplorer.dto.chat.request.CreateChatDTO;
import org.elis.movieexplorer.dto.chat.response.ResponseChatDTO;
import org.elis.movieexplorer.dto.message.request.InsertMessageDTO;
import org.elis.movieexplorer.dto.message.response.ResponseMessageDTO;
import org.elis.movieexplorer.exception.definition.MENotFoundException;
import org.elis.movieexplorer.model.Chat;
import org.elis.movieexplorer.model.Utente;
import org.elis.movieexplorer.repository.ChatRepository;
import org.elis.movieexplorer.repository.MessaggioRepository;
import org.elis.movieexplorer.service.definition.ChatService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ChatServiceJpa implements ChatService {
	private final ChatRepository chatRepo;
	private final MessaggioRepository messageRepo;
	private final ChatMapper chatMapper;
	private final MessaggioMapper messageMapper;

	@Override
	public ResponseChatDTO insertChat(CreateChatDTO dto, Utente utente) {
		return chatMapper.toResponse(chatRepo.save(chatMapper.toEntity(dto, utente)));
	}

	@Override
	public ResponseMessageDTO insertMessage(InsertMessageDTO dto, Utente utente) {
		return messageMapper.toResponse(messageRepo.save(messageMapper.toEntity(dto, utente)));
	}

	@Override
	public List<ResponseChatDTO> findAllChats() {
		return chatRepo.findAll().stream()
								 .map(c -> chatMapper.toResponse(c))
								 .toList();
	}

	@Override
	public List<ResponseChatDTO> findAllChatsByUtente(Long utenteId) {
		return chatRepo.findAllByUtenteId(utenteId).stream()
												   .map(c -> chatMapper.toResponse(c))
												   .toList();
	}

	@Override
	public ResponseChatDTO findChatById(Long chatId) {
		Optional<Chat> chat = chatRepo.findById(chatId)
			.orElseThrow(
				() -> new MENotFoundException("id non trovato")
		);
		return chatMapper.toResponse(chat.get());
	}

	@Override
	public ResponseChatDTO cambiaStatoChat(Long messageId) {
		Optional<Chat> chat = messageRepo.findById(messageId)
			.orElseThrow(
				() -> new MENotFoundException("id non trovato")
		);
		return messageMapper.toResponse(chat.get());
	}
}
