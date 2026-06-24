package org.elis.movieexplorer.controller;

import java.net.Authenticator;
import java.util.List;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ChatController {
private ChatService chatService;

@PostMapping("/cliente/chat")
public ResponseEntity<String> creachat(@RequestBody @Valid CreateChatDTO dto, Authentication authenticator){
	
	
	
}
@PostMapping("/inviamessaggio")
public ResponseEntity<String> inviaMessaggio(@RequestBody @Valid InsertMessageDTO dto, Authentication authenticator){
	
}
	
	
@GetMapping("/cliente/chat")
public ResponseEntity<List<ResponseChatDTO>> listaChat(Authentication authenticator){
	
	
}

@GetMapping("/staff/chat")
public ResponseEntity<List<ResponseChatDTO>> listaChat(){
	
	
}



}
