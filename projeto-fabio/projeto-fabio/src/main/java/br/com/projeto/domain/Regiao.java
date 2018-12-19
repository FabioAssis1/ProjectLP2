package br.com.projeto.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.projeto.domain.DomainBase;

@Entity
@Table(name = "regiao")
public class Regiao extends DomainBase{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "regiaoID")
	private Integer id;

	@NotNull(message = "Nome da Região não pode ser nulo.")
	@NotEmpty(message = "Nome da Região não pode ser vazio.")
	@Size(max = 50, message = "Nome da Região não pode ultrapassar 50 caracteres.")
	private String nome;

	@NotNull(message = "Sigla da Região não pode ser nulo.")
	@NotEmpty(message = "Sigla da Região não pode ser vazio.")
	@Size(max = 2, min = 2, message = "Sigla deve conter 2 caracteres.")
	private String sigla;

	private Regiao() {
		// constructor for hibernate
	}
	
	public Regiao(String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
		validarDomain();
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}
}
