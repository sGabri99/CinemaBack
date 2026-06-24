package org.elis.movieexplorer.model;

import java.time.LocalDateTime;
import java.util.List;

import org.elis.movieexplorer.model.enums.StatoChat;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chat {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	
	@NotNull
	private String oggetto;
	
	@NotNull
	private StatoChat stato = StatoChat.IN_ATTESA;
	
	@NotNull
	@CreationTimestamp
	private LocalDateTime createdAt;

	@NotNull
	private boolean messaggiSospesoPerStaff = true;

	@NotNull
	private boolean messaggiSospesoPerCliente = false;
	
	@OneToMany( mappedBy = "chat" )
	private List<Messaggio> messaggi;
	
	@ManyToOne
	private Utente utente;
	
}
