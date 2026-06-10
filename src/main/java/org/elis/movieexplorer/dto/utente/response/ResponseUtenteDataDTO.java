package org.elis.movieexplorer.dto.utente.response;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResponseUtenteDataDTO {
    @NotBlank
    private String nome;

    @NotBlank
    private String cognome;

    @NotBlank
    private String email;
}
