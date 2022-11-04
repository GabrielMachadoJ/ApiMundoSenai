package br.com.mundo_senai.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mundo_senai.quiz.model.RespostaModel;

@Repository
public interface RespostaRepository extends JpaRepository<RespostaModel, Long>{

}
