package br.eti.carlosgeorgi.trabalhodeconclusaoboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ordens")
public class OrdemServicoController {

	@GetMapping("/cadastrar")
	public String cadastrar(){
		return "/ordens/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(){
		return "/ordens/lista";
	}
}
