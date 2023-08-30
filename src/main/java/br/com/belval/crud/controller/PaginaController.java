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
	@GetMapping("/pacote/bahia")
	public ModelAndView pacote4() {
		ModelAndView modelAndView = new ModelAndView("pacote-sao-paulo");
		return modelAndView;
	}
	@GetMapping("/pacote/floripa")
	public ModelAndView pacote5() {
		ModelAndView modelAndView = new ModelAndView("pacote-sao-paulo");
		return modelAndView;
	}
	@GetMapping("/pacote/fortaleza")
	public ModelAndView pacote6() {
		ModelAndView modelAndView = new ModelAndView("pacote-sao-paulo");
		return modelAndView;
	}
	@GetMapping("/pacote/natal")
	public ModelAndView pacote7() {
		ModelAndView modelAndView = new ModelAndView("pacote-sao-paulo");
		return modelAndView;
	}
	@GetMapping("/pacote/fernando/de/noronha")
	public ModelAndView pacote8() {
		ModelAndView modelAndView = new ModelAndView("pacote-sao-paulo");
		return modelAndView;
	}
	@GetMapping("/pacote/rio/de/janeiro")
	public ModelAndView pacote9() {
		ModelAndView modelAndView = new ModelAndView("pacote-sao-paulo");
		return modelAndView;
	}
	@GetMapping("/pagina/login")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView("pagina-login");
		return modelAndView;
	}
	
}
