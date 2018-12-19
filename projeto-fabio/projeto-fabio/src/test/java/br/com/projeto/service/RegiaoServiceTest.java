package br.com.projeto.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.projeto.domain.Regiao;

@RunWith(value=SpringRunner.class)
@SpringBootTest
public class RegiaoServiceTest {

	@Autowired
	private RegiaoService regiaoService;
	
	@Test
	public void deveSalvarUmaRegiao() {
		Regiao regiao = new Regiao("São Paulo", "SP");
		regiaoService.save(regiao);
		
		Regiao regiaoSalva = regiaoService.findById(regiao.getId());
		Assert.assertEquals(regiao.getNome(), regiaoSalva.getNome());
		Assert.assertEquals(regiao.getSigla(), regiaoSalva.getSigla());
	}

}
