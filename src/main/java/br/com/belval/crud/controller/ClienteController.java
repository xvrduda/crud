package br.com.belval.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.belval.crud.model.Cliente;
import br.com.belval.crud.repository.ClienteRepository;


@Controller
public class ClienteController {

	//private static List<Cliente> listaClientes = new ArrayList<Cliente>();
	//private static int proxId = 1;
	@Autowired
	private ClienteRepository repository;


	@GetMapping("/cliente/novo")
	public ModelAndView novo() {
		//return "novo-cliente";
		ModelAndView modelAndView = new ModelAndView("novo-cliente");
		modelAndView.addObject("cliente", new Cliente());
		return modelAndView;
	}

	@PostMapping("/cliente/novo")
	public ModelAndView novo(Cliente cliente, RedirectAttributes redirectAttributes) {
		ModelAndView modelAndView = new ModelAndView("redirect:/cliente/list");
		String msg = "";
		if (cliente.getId() == 0) {
			msg = "Parabéns, cadastro feito!";
		} else {
			msg = "cadastro atualizado!";
		}
		redirectAttributes.addFlashAttribute("msg", msg);
		repository.save(cliente);
		return modelAndView;

	}

	@GetMapping("/cliente/list")
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("lista-cliente");
		//modelAndView.addObject("clientes", listaClientes);
		modelAndView.addObject("clientes", repository.findAll());
		return modelAndView;
	}
	
	@GetMapping("/cliente/{id}")
	public String detalhe(@PathVariable("id") int id, Model model) {
		Cliente p = repository.findById(id);
		if (p == null) {
			return "cliente-nao-encontrado";
		}
		model.addAttribute("cliente", p);
		return "detalhe-cliente";
	}
	
	@GetMapping("/cliente/{id}/edit")
	public String edit(@PathVariable("id") int id, Model model) {
		Cliente p = repository.findById(id);
		if (p == null) {
			return "cliente-nao-encontrado";
		}
		model.addAttribute("cliente", p);
		return "novo-cliente";
	}
	
	@GetMapping("/cliente/{id}/delete")
	public String delete(@PathVariable("id") int id) {
		Cliente p = repository.findById(id);
		if (p == null) {
			return "cliente-nao-encontrado";
		}
		repository.delete(p);
		return "redirect:/cliente/list";
	}
	
}
