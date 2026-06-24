package org.elis.movieexplorer.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Posto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Min(0)
	private int fila;

    @NotNull
    @Min(1)
	private int colonna;

    @NotNull
    @ManyToOne
    @JoinColumn(nullable = false)
    private Sala sala;
}
