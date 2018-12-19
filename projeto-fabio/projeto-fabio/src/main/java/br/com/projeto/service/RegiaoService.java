package br.com.projeto.service;

import java.util.Optional;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.domain.Regiao;
import br.com.projeto.repository.RegiaoRepository;

@Service
public class RegiaoService {

	private RegiaoRepository regiaoRepository;
	
	@Autowired
	public RegiaoService(RegiaoRepository regiaoRepository) {
		this.regiaoRepository = regiaoRepository;
	}
	
	public void save (Regiao regiao) {
		this.regiaoRepository.saveAndFlush(regiao);
	}
	
	public Regiao findById(Integer id) {
		Optional<Regiao> findedRegiao = this.regiaoRepository.findById(id);
		if(findedRegiao.isPresent()) {
			return findedRegiao.get();
		}
		throw new ServiceException("Região não encontrada");
	}
}
