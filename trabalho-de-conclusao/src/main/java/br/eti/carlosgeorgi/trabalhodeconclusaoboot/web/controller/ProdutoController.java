package br.eti.carlosgeorgi.trabalhodeconclusaoboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {
	@GetMapping("/cadastrar")
	public String cadastrar(){
		return "/produtos/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(){
		return "/produtos/lista";
	}
}
