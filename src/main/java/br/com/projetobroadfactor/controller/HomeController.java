package br.com.projetobroadfactor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.projetobroadfactor.model.Usuario;


@Controller
public class HomeController {
	
	@GetMapping("/index")
		public ModelAndView index() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("index");
			mv.addObject("usuario", new Usuario());
			return mv; 
		}

}

