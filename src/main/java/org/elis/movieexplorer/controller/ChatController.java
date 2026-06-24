package org.elis.movieexplorer.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
public ResponseEntity<String> creachat(@RequestBody @Valid CreateChatDTO dto, Authentication authenticator){
	
	
	
}
//invio messaggio sia da parte di cliente sia da parte di staff
@PostMapping("/inviamessaggio")
public ResponseEntity<String> inviaMessaggio(@RequestBody @Valid InsertMessageDTO dto, Authentication authenticator){
	
}
	
//recupero da parte del cliente delle proprie chat 	
@GetMapping("/cliente/chat")
public ResponseEntity<List<ResponseChatDTO>> listaChat(Authentication authenticator){
	
	
}
//recupero da parte dello staff di tutte le chat 

@GetMapping("/staff/chat")
public ResponseEntity<List<ResponseChatDTO>> listaChat(){
	
}

@GetMapping("")



@PatchMapping("/staff/cambiostato")	
public ResponseEntity<Boolean> cambioStato(@PathVariable Long idChat){
	
}



}
