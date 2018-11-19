package br.eti.carlosgeorgi.trabalhodeconclusaoboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String listar(ModelMap model){
		model.addAttribute("produtos", service.buscarTodos());
		return "/produtos/lista";
	}
	
	@PostMapping("/salvar")
	public String salvar(Produto produto , RedirectAttributes attr) {
		service.salvar(produto);
		attr.addFlashAttribute("success", "Produto cadastrado com sucesso.");
		return "redirect:/produtos/cadastrar";
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model ) {
		if(!service.ProdutoTemOrdens(id)) {
			model.addAttribute("fail", "Produto não removido. Possui este produto esta atrelado a outro coponentes do sistema.");
		}else {
			service.excluir(id);
			model.addAttribute("success", "Produto excluído com sucesso.");
		}
		return "redirect:/produtos/listar";
		
	}
	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model){
		model.addAttribute("produto", service.buscarPorId(id));
		return "/produtos/cadastro";	
	
	}
	
	@PostMapping("/editar")
	public String editar(Produto produto, RedirectAttributes attr) {
		service.editar(produto);
		attr.addFlashAttribute("success", "Produto editado com sucesso.");
		
		return "redirect:/produtos/listar";
	}
}
