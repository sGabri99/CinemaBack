package org.elis.movieexplorer.controller;

import java.util.List;

import org.elis.movieexplorer.dto.chat.request.InsertChatDTO;
import org.elis.movieexplorer.dto.chat.response.ResponseChatDTO;
import org.elis.movieexplorer.dto.chat.response.ResponseInfoChatDTO;
import org.elis.movieexplorer.dto.message.request.InsertMessageDTO;
import org.elis.movieexplorer.model.Utente;
import org.elis.movieexplorer.service.definition.ChatService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ChatController {

	private ChatService chatService;


	//creazione da parte dell'utente di una chat
	@PostMapping("/cliente/chat")
	public ResponseEntity<Void> creaChat(@RequestBody @Valid InsertChatDTO dto, Authentication authenticator) {
		Utente u=(Utente) authenticator.getPrincipal();
		chatService.insertChat(dto, u);
		return ResponseEntity.ok().build();

	}

	//invio messaggio sia da parte di cliente sia da parte di staff
	@PostMapping("/user/inviamessaggio")
	public ResponseEntity<Void> inviaMessaggio(@RequestBody @Valid InsertMessageDTO dto, Authentication authenticator) {
		Utente u=(Utente) authenticator.getPrincipal();
		chatService.insertMessage(dto, u);
		return ResponseEntity.ok().build();
	}

	//recupero di tutte le proprie chat da parte dell'utente o recupero di tutte le chat da parte dello staff
	@GetMapping("/user/chats")
	public ResponseEntity<List<ResponseInfoChatDTO>> listaChat(Authentication authenticator) {
		Utente u=(Utente) authenticator.getPrincipal();

		return ResponseEntity.ok(chatService.findAllChats(u));

	}
	//singola chat
	@GetMapping("/user/chat")
	public ResponseEntity<ResponseChatDTO> singolaChat(@RequestParam Long id, Authentication authenticator) {
		Utente u=(Utente) authenticator.getPrincipal();

		return ResponseEntity.ok(chatService.findChatById(id, u));
	}


	@PatchMapping("/staff/cambiostato")
	public ResponseEntity<Void> cambioStato(@RequestParam Long idChat) {
		chatService.cambiaStatoChat(idChat);
		return ResponseEntity.ok().build();
	}
	//conta quante chat non lette ha un utente
	@GetMapping("/user/contatore")
	public ResponseEntity<Integer> contatoreChatNonLette(Authentication authenticator){
		Utente u=(Utente) authenticator.getPrincipal();
		return ResponseEntity.ok(chatService.countChatNotRead(u));

	}



}
