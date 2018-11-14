package br.eti.carlosgeorgi.trabalhodeconclusaoboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/funcionarios1")
public class Funcionario1Controller {

	@GetMapping("/cadastrar")
	public String cadastrar(){
		return "/funcionario1/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(){
		return "/funcionario1/lista";
	}
}
