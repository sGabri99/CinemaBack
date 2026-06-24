package org.elis.movieexplorer.controller;

import java.util.List;

import org.elis.movieexplorer.service.definition.ChatService;
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
    public ResponseEntity<String> creaChat(@RequestBody @Valid CreateChatDTO dto, Authentication authenticator) {

    }

    //invio messaggio sia da parte di cliente sia da parte di staff
    @PostMapping("/user/inviamessaggio")
    public ResponseEntity<String> inviaMessaggio(@RequestBody @Valid InsertMessageDTO dto, Authentication authenticator) {

    }

    //recupero di tutte le proprie chat da parte dell'utente o recupero di tutte le chat da parte dello staff
    @GetMapping("/user/chat")
    public ResponseEntity<List<ResponseChatDTO>> listaChat(Authentication authenticator) {


    }

    @GetMapping("/user/chat")
    public ResponseEntity<ResponseChatDTO> singolaChat(@RequestParam Long id, Authentication authenticator) {
        return ResponseEntity.ok(chatService.(id));
    }


    @PatchMapping("/staff/cambiostato")
    public ResponseEntity<Boolean> cambioStato(@RequestParam Long idChat) {
        return ResponseEntity.ok(chatService.cambioStato(idChat));
    }


}
