package br.com.mundo_senai.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mundo_senai.quiz.model.PerguntaModel;
import br.com.mundo_senai.quiz.service.PerguntaService;

@RestController
public class PerguntaController {

  @Autowired
  private PerguntaService ps;

  @GetMapping("/listar")
  public Iterable<PerguntaModel> listar(){
    return ps.listar();
  }

  @GetMapping("/perguntas")
  public String route() {
    return "Rota de pergunta funcionando";
  }
  
}
