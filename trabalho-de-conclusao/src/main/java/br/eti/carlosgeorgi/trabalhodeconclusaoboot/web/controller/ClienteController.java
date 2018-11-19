package br.eti.carlosgeorgi.trabalhodeconclusaoboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain.Cliente;
import br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain.UF;
import br.eti.carlosgeorgi.trabalhodeconclusaoboot.service.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Cliente cliente){
		return "/clientes/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model){
		model.addAttribute("clientes", service.buscarTodos());
		return "/clientes/lista";
	}
	
	@PostMapping("/salvar")
	public String salvar(Cliente cliente , RedirectAttributes attr) {
		service.salvar(cliente);
		attr.addFlashAttribute("success", "cliente cadastrado com sucesso.");
		return "redirect:/clientes/cadastrar";
	}
	
	@ModelAttribute("ufs")
	public UF[] getUf() {
		return UF.values();
	}

}
