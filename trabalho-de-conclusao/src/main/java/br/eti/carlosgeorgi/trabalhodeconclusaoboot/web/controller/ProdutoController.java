package br.eti.carlosgeorgi.trabalhodeconclusaoboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain.Produto;
import br.eti.carlosgeorgi.trabalhodeconclusaoboot.service.ProdutoService;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoService service;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Produto produto){
		return "/produtos/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(){
		return "/produtos/lista";
	}
	
	@PostMapping("/salvar")
	public String salvar(Produto produto) {
		service.salvar(produto);
		return "redirect:/produtos/cadastrar";
	}
}
