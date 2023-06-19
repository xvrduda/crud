package br.com.belval.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class PaginaController {

	
	@GetMapping("/pagina/inicial")
	public ModelAndView inicial() {
		ModelAndView modelAndView = new ModelAndView("pagina-inicial");
		return modelAndView;
	}
	@GetMapping("/pacote/copacabana")
	public ModelAndView pacote1() {
		ModelAndView modelAndView = new ModelAndView("pacote-copacabana");
		return modelAndView;
	}
	@GetMapping("/pacote/copa/do/mundo")
	public ModelAndView pacote2() {
		ModelAndView modelAndView = new ModelAndView("pacote-copa-do-mundo");
		return modelAndView;
	}
	@GetMapping("/pacote/sao/paulo")
	public ModelAndView pacote3() {
		ModelAndView modelAndView = new ModelAndView("pacote-sao-paulo");
		return modelAndView;
	}
	@GetMapping("/pagina/login")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView("pagina-login");
		return modelAndView;
	}
	
}
