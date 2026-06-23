package org.elis.movieexplorer.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Messaggio {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY ) 
	private Long id;
	
	@NotNull
	private String messaggio;

	@NotNull
	private boolean visualizzato = false;
	
	@CreationTimestamp
	@NotNull
	private LocalDateTime createdAt;
	
	@NotNull
	@ManyToOne
	private Chat chat;
	
	@ManyToOne
	private Utente mittente;

	
}
