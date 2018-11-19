package br.eti.carlosgeorgi.trabalhodeconclusaoboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain.Funcionario1;
import br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain.UF;
import br.eti.carlosgeorgi.trabalhodeconclusaoboot.service.Funcionario1Service;



@Controller
@RequestMapping("/funcionarios1")
public class Funcionario1Controller {

	@Autowired
	private Funcionario1Service service;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Funcionario1 funcionario1){
		return "/funcionario1/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model){
		model.addAttribute("funcionarios1", service.buscarTodos());
		return "/funcionario1/lista";
	}
	
	@PostMapping("/salvar")
	public String salvar(Funcionario1 funcionario , RedirectAttributes attr) {
		service.salvar(funcionario);
		attr.addFlashAttribute("success", "cliente cadastrado com sucesso.");
		return "redirect:/funcionario1/cadastrar";
	}
	
	@ModelAttribute("ufs")
	public UF[] getUf() {
		return UF.values();
	}
}
