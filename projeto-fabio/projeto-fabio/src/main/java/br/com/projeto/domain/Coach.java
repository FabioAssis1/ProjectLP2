package br.com.projeto.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Coach")
public class Coach {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "coachID")
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
	
	@NotNull(message = "Descreva sua experiência como Coach.")
	@NotEmpty(message = "Descreva sua experiência como Coach.")
	private String xpCoach;
	
	@ManyToOne
	@JoinColumn(name = "regiaoID")
	private Regiao regiao;
	
	
	
	
}
