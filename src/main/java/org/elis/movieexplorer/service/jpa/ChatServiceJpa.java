package org.elis.movieexplorer.service.jpa;

import java.util.List;
import java.util.Optional;
import org.elis.movieexplorer.dto.chat.request.CreateChatDTO;
import org.elis.movieexplorer.dto.chat.request.InsertChatDTO;
import org.elis.movieexplorer.dto.chat.response.ResponseChatDTO;
import org.elis.movieexplorer.dto.message.request.InsertMessageDTO;
import org.elis.movieexplorer.dto.message.response.ResponseMessageDTO;
import org.elis.movieexplorer.exception.definition.MENotFoundException;
import org.elis.movieexplorer.model.Chat;
import org.elis.movieexplorer.model.Messaggio;
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
	public ResponseChatDTO insertChat(InsertChatDTO dto, Utente utente) {
		Chat chat = chatMapper.toEntity(dto, utente);
		chat = chatRepo.save(chat);
		insertMessage(
			new InsertMessageDTO(
				dto.getMessaggio(),
				false,
				chat.getId(),
				utente.getId()
			),
			utente
		);
		return chatMapper.toResponse(chat);
	}

	@Override
	public ResponseMessageDTO insertMessage(InsertMessageDTO dto, Utente utente) {
		Messaggio message = messageRepo.save(messageMapper.toEntity(dto, utente));
		return messageMapper.toResponse(message);
	}

	@Override
	public List<ResponseChatDTO> findAllChats(Utente utente) {
		if(utente.getRuolo().toString() == "Cliente") {
			return chatRepo.findAllByUtenteId(utente.getId())
						   .stream()
						   .map(c -> chatMapper.toResponse(c))
						   .toList();
		}
		return chatRepo.findAll().stream()
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
