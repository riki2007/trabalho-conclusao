package br.eti.carlosgeorgi.trabalhodeconclusaoboot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain.Cliente;
import br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain.Funcionario1;
import br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain.OrdemServico;
import br.eti.carlosgeorgi.trabalhodeconclusaoboot.service.ClienteService;
import br.eti.carlosgeorgi.trabalhodeconclusaoboot.service.Funcionario1Service;
import br.eti.carlosgeorgi.trabalhodeconclusaoboot.service.OrdemServicoService;

@Controller
@RequestMapping("/ordens")
public class OrdemServicoController {
	
	@Autowired
	private OrdemServicoService service;
	
	@Autowired
	private ClienteService clienteService;
	@Autowired
	private Funcionario1Service funcionariosService;

	@GetMapping("/cadastrar")
	public String cadastrar(OrdemServico OS){
		return "/ordem/cadastro";
	}
	
	
	@GetMapping("/listar")
	public String listar(ModelMap model){
		model.addAttribute("ordens", service.buscarTodos());
		return "/ordem/lista";
	}
	@PostMapping("/salvar")
	public String salvar(OrdemServico OS, RedirectAttributes attr) {
		service.salvar(OS);
		attr.addFlashAttribute("success", "OS cadastrada com sucesso.");
		return "redirect:/ordens/cadastrar";
	}
	
	@ModelAttribute("clientes")
	public List<Cliente> getClientes() {
		return clienteService.buscarTodos();
	}
	@ModelAttribute("funcionarios1")
	public List<Funcionario1> getFuncioanrios() {
		return funcionariosService.buscarTodos();
	}
}
