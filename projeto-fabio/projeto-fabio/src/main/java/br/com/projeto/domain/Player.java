package br.com.projeto.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Player")
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "playerId")
	private Integer id;

	@NotNull(message = "Informe seu nome.")
	@NotEmpty(message = "Informe seu nome.")
	@Size(max = 50, message = "Nome não pode exceder 50 caracteres.")
	private String nome;
	
	@NotNull(message = "Informe seu Elo da temporada atual e da última temporada.")
	@NotEmpty(message = "Informe seu Elo da temporada atual e da última temporada.")
	private String elo;
	
	@NotNull(message = "Informe sua experiência em time.")
	@NotEmpty(message = "Informe sua experiência em time.")
	private String xpTime;
	
	@NotNull(message = "Descreva sua experiência com o jogo.")
	@NotEmpty(message = "Descreva sua experiência com o jogo.")
	private String xpJogo;
	
	@ManyToOne
	@JoinColumn(name = "regiaoID")
	private Regiao regiao;
	
	
}
