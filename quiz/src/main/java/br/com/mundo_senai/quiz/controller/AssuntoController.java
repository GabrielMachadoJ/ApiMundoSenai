package br.com.mundo_senai.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mundo_senai.quiz.model.AssuntoModel;
import br.com.mundo_senai.quiz.service.AssuntoSerivce;

@RestController
public class AssuntoController {
  
  @Autowired
  private AssuntoSerivce as;

  @GetMapping("/assuntos")
  public Iterable<AssuntoModel> listar(){
    return as.listar();
  }
}
