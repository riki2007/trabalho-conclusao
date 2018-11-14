package br.eti.carlosgeorgi.trabalhodeconclusaoboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/servicos")
public class ServicoController {
	@GetMapping("/cadastrar")
	public String cadastrar(){
		return "/servicos/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(){
		return "/servicos/lista";
	}
}
