package br.com.projeto.domain;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;

public class RegiaoTest {

	@Test
	public void deveCriarUmaRegiao() {
		Regiao saoPaulo = new Regiao("São Paulo", "SP");
		Assert.assertEquals("São Paulo", saoPaulo.getNome());
		Assert.assertEquals("SP", saoPaulo.getSigla());	
	}
	
	@Test(expected = DomainInvalidException.class)
	public void deveValidarInformacaoVazia() {
		new Regiao ("", "");
	}
	
	@Test(expected = DomainInvalidException.class)
	public void deveValidarInformacaoNula() {
		new Regiao (null, null);
	}
	
	@Test(expected = DomainInvalidException.class)
	public void deveValidarInformacaoInvalida() {
		String nome = RandomStringUtils.randomAlphabetic(125);
		String sigla = RandomStringUtils.randomAlphabetic(5);
		new Regiao (nome, sigla);
	}
}

