package br.eti.carlosgeorgi.trabalhodeconclusaoboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain.Servico;
import br.eti.carlosgeorgi.trabalhodeconclusaoboot.service.ServicoService;

@Controller
@RequestMapping("/servicos")
public class ServicoController {
	
	@Autowired
	private ServicoService service;
	
	
	@GetMapping("/cadastrar")
	public String cadastrar(){
		return "/servicos/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(){
		return "/servicos/lista";
	}
	
	@PostMapping("/salvar")
	public String salvar(Servico servico , RedirectAttributes attr) {
		service.salvar(servico);
		attr.addFlashAttribute("success", "Serviço cadastrado com sucesso.");
		return "redirect:/servicos/cadastrar";
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model ) {
		/*if(!service.ProdutoTemOrdens(id)) {
			model.addAttribute("fail", "Servico não removido. Possui este serviço esta atrelado a outro coponentes do sistema.");
		}else {*/
			service.excluir(id);
			model.addAttribute("success", "Serviço excluído com sucesso.");
		//}
		return "redirect:/servicos/listar";
		
	}
	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model){
		model.addAttribute("servico", service.buscarPorId(id));
		return "/servicos/cadastro";	
	
	}
	
	@PostMapping("/editar")
	public String editar(Servico servico, RedirectAttributes attr) {
		service.editar(servico);
		attr.addFlashAttribute("success", "servico editado com sucesso.");
		
		return "redirect:/servicos/listar";
	}
}
