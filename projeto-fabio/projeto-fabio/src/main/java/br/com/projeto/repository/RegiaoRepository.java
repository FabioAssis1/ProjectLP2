package br.com.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.domain.Regiao;

@Repository
public interface RegiaoRepository extends JpaRepository<Regiao, Integer> {

}
