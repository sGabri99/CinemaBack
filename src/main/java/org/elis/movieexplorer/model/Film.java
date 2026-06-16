package org.elis.movieexplorer.model;

import java.util.List;

import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column( unique = true)
	private String imdbID;
	
	@Column(nullable = false, unique = true)
	@NotBlank
	private String titolo;
	
	@Column(nullable = false)
	@NotBlank
	private String descrizione;
	
	@Column(nullable = false)
	@NotNull
	@Range(min = 0, max = 500)
	private Integer durata;
	
	@Column(nullable = false)
	@NotBlank
	private String attori;
	
	@Column(nullable = false)
	@NotNull
	@URL
	private String urlLocandina;

	@Column
	private String urlTrailer;
	
	@ManyToMany
	@NotEmpty
	private List<Genere> generi;
	
	@OneToMany(mappedBy = "film")
	private List<Spettacolo> spettacoli;
}
