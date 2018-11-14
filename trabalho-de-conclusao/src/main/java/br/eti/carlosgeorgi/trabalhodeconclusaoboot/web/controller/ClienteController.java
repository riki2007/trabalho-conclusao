package br.eti.carlosgeorgi.trabalhodeconclusaoboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	
	@GetMapping("/cadastrar")
	public String cadastrar(){
		return "/clientes/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(){
		return "/clientes/lista";
	}

}
