package org.elis.movieexplorer.dto.posto.response;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class ResponsePostoBySalaDTO {
	
	@NotNull
    @Min(1)
    private Integer colonna;

    @NotNull
    @Pattern(regexp = "^[A-Z]$")
    private String fila;
}
