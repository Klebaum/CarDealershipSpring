package dsw1.CarDealershipSpring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import dsw1.CarDealershipSpring.domain.Proposta;
import dsw1.CarDealershipSpring.domain.Usuario;
import dsw1.CarDealershipSpring.security.UsuarioDetails;
import dsw1.CarDealershipSpring.service.spec.IPropostaService;

@Controller
@RequestMapping("/propostas")
public class PropostaController {
	@Autowired
	private IPropostaService propostaService;

	
	@GetMapping("/cadastrar")
	public String cadastrar(Proposta proposta) {
		return "proposta/cadastro";
	}

	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("propostas", propostaService.buscarTodos());
		return "proposta/lista";
	}
	
	private Usuario getUsuario() {
		UsuarioDetails usuarioDetails = (UsuarioDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return usuarioDetails.getUsuario();
	}
	
	@GetMapping("/listaPorLoja")
	public String listaDaLoja(ModelMap model) {
		//Tá pegando o email, não o usuario
		model.addAttribute("propostas", propostaService.buscarTodosPorUsuario(this.getUsuario()));
		
		return "logado/loja/listaPropostaCarro";
	}
	
	@PostMapping("/salvar")
	public String salvar(@Valid Proposta proposta, BindingResult result, RedirectAttributes attr) {

		if (result.hasErrors()) {
			return "proposta/cadastro";
		}

		propostaService.salvar(proposta);
		attr.addFlashAttribute("sucess", "proposta.create.sucess");
		return "redirect:/propostas/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("proposta", propostaService.buscarPorId(id));
		return "proposta/cadastro";
	}

	@PostMapping("/editar")
	public String editar(@Valid Proposta proposta, BindingResult result, RedirectAttributes attr) {

		if (result.hasErrors()) {
			return "proposta/cadastro";
		}

		propostaService.salvar(proposta);
		attr.addFlashAttribute("sucess", "proposta.edit.sucess");
		return "redirect:/propostas/listar";
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, RedirectAttributes attr) {
		propostaService.excluir(id);
		attr.addFlashAttribute("sucess", "proposta.delete.sucess");
		return "redirect:/propostas/listar";
	}
}
