package org.elis.movieexplorer.service.jpa;

import java.util.List;

import jakarta.transaction.Transactional;
import org.elis.movieexplorer.dto.chat.request.InsertChatDTO;
import org.elis.movieexplorer.dto.chat.response.ResponseChatDTO;
import org.elis.movieexplorer.dto.message.request.InsertMessaggioDTO;
import org.elis.movieexplorer.exception.definition.MENotAuthorizedException;
import org.elis.movieexplorer.exception.definition.MENotFoundException;
import org.elis.movieexplorer.mapper.ChatMapper;
import org.elis.movieexplorer.mapper.MessaggioMapper;
import org.elis.movieexplorer.model.Chat;
import org.elis.movieexplorer.model.Messaggio;
import org.elis.movieexplorer.model.Utente;
import org.elis.movieexplorer.model.enums.Ruolo;
import org.elis.movieexplorer.model.enums.StatoChat;
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
	@Transactional
	public void insertChat(InsertChatDTO dto, Utente utente) {
		Chat chat = chatMapper.toEntity(dto);
		chat.setUtente(utente);
		chat = chatRepo.save(chat);
		Messaggio message = new Messaggio(
				null,
				dto.getMessaggio(),
				chat.getCreatedAt(), chat, utente);
		messageRepo.save(message);
	}

	@Override
	public void insertMessage(InsertMessaggioDTO dto, Utente utente) {
		Chat chat = chatRepo.findById(dto.getIdChat()).orElseThrow(
				() -> new MENotFoundException("Chat non trovata")
		);

		Messaggio message = messageMapper.toEntity(dto, chat, utente);
		messageRepo.save(message);
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
	public ResponseChatDTO findChatById(Long chatId, Utente utente) {
		Chat chat = chatRepo.findById(chatId)
			.orElseThrow(
				() -> new MENotFoundException("Chat non trovata.")
		);

		if(utente.getId().equals(chat.getUtente().getId())
				|| (utente.getRuolo() == Ruolo.STAFF
				|| utente.getRuolo() == Ruolo.SUPERADMIN)){
			List<Messaggio> messaggi = messageRepo.findByChat(chatId).orElseThrow(
					() -> new MENotFoundException("Messaggio non trovato.")
			);
            return chatMapper.toResponse(chat, messaggi);

		}else{
			throw new MENotAuthorizedException("Non hai accesso a questo contenuto.");
		}
	}

	@Override
	public void cambiaStatoChat(Long idChat) {
		Chat chat = chatRepo.findById(idChat)
			.orElseThrow(
				() -> new MENotFoundException("Chat non trovata.")
		);
		chat.setStato(
				chat.getStato()==StatoChat.IN_ATTESA?
						StatoChat.APERTO:StatoChat.CHIUSO
		);
	}

	@Override
	public Integer countNotRead(Utente utente){
		return utente.getRuolo() == Ruolo.CLIENTE?
				chatRepo.countNotReadedChatForUser(utente.getId()):
				chatRepo.countNotReadedChatForStaff();
	}
}
