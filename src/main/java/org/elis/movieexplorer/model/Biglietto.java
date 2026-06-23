package org.elis.movieexplorer.model;

import java.math.BigDecimal;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.elis.movieexplorer.service.definition.SpettacoloService;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Biglietto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	@NotNull
	private Utente utente;
	
	@Column(nullable = false, unique = true)
    private String codiceBiglietto;
	
	@Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal prezzo;

	@ManyToOne
	@JoinColumn(nullable = false)
	@NotNull
	private Spettacolo spettacolo;

	@OneToOne
	@JoinColumn(nullable = false)
	@NotNull
	private Posto posto;

	@PostRemove
	private void liberaPosto(){
		spettacolo.setPostiRimanenti(spettacolo.getPostiRimanenti()+1);
	}

	@PostPersist
	private void occupaPosti(){
		spettacolo.setPostiRimanenti(spettacolo.getPostiRimanenti()-1);
	}

}
