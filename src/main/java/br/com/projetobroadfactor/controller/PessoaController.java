package br.com.projetobroadfactor.controller;

/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.apibf.models.Pessoa;
import br.com.apibf.repository.PessoaRepository;

@Controller 
public class PessoaController {
	
	@Autowired
	private PessoaRepository pr;
	
	
	@RequestMapping(value="/cadastrarPessoa", method=RequestMethod.GET)
	public String form() {
		return "cadastrarPessoa";
	}

	@RequestMapping(value="/cadastrarPessoa", method=RequestMethod.POST)
	public String form(Pessoa  pessoa)  {
	
		pr.save(pessoa);
		return "redirect:/cadastrarPessoa";
	} 
	
	@RequestMapping("/pessoas")
	public ModelAndView listaPessoas() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Pessoa> pessoas = pr.findAll();
		mv.addObject("pessoas", pessoas);
		return mv;
	}
	
	
	@RequestMapping("/{id}")
	public ModelAndView detalhesPessoa(@PathVariable("id") long id) {
		Pessoa pessoa = pr.findById(id);
		ModelAndView mv = new ModelAndView("detalhesPessoa");
		mv.addObject("pessoa", pessoa);
		return mv;
	}
	
	
	@RequestMapping("/deletar")
	public String deletarPessoa(long id) {
			Pessoa pessoa = pr.findById(id);
			pr.delete(pessoa);
	return "redirect:/pessoas";
	}
	
	
	
	@GetMapping("/editar/{id}")
	public	ModelAndView editar(@PathVariable("id")Integer id){
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/editar");
		Pessoa pessoa = pr.findById(id);
		return mv.addObject ("pessoa", pessoa);
		
	}
	
	@PostMapping("/editar")
	public ModelAndView editar(Pessoa pessoa) {
		ModelAndView mv = new ModelAndView();
		pr.save(pessoa);
		mv.setViewName("redirect:/pessoas");
		return mv;
	}
	
	
	
	
	
}
*/