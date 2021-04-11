package br.com.projetobroadfactor.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import br.com.projetobroadfactor.dao.UsuarioDao;
import br.com.projetobroadfactor.model.Usuario;

@Controller
public class UsuarioControler{
	
	@Autowired
	private UsuarioDao usuariorepositorio;
	
	@GetMapping("/inserirUsuarios")
	public ModelAndView InsertUsuarios(Usuario usuario) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/formUsuario");
		mv.addObject("usuario", new Usuario());
		return mv;
	}
	
	@PostMapping("InsertUsuarios")
	public ModelAndView inserirUsuario(@Valid Usuario usuario, BindingResult br) {
		ModelAndView mv = new ModelAndView();
		if(br.hasErrors()) {
			mv.setViewName("formUsuario");
			mv.addObject("usuario");
		}else {

		mv.setViewName("redirect:/usuarios-adicionados");
		usuariorepositorio.save(usuario);
		}
		return mv;
	}
	
	
	@GetMapping("usuarios-adicionados")
	public ModelAndView listagemUsuarios() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("listUsuarios");
		mv.addObject("usuariosList", usuariorepositorio.findAll());
		return mv;
	}
	
	@GetMapping("/alterar/{id}")
	public ModelAndView alterar(@PathVariable("id") Integer id) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("alterar");
		Usuario usuario = usuariorepositorio.getOne(id);
		mv.addObject("usuario", usuario);
		return mv;
	}
	
	@PostMapping("/alterar")
	public ModelAndView alterar(Usuario usuario) {
		ModelAndView mv = new ModelAndView();
		usuariorepositorio.save(usuario);
		mv.setViewName("redirect:/usuarios-adicionados");
		return mv;
		
	}
	
	@GetMapping("/excluir/{id}")
		public String excluirUsuario(@PathVariable("id")Integer id) {
			usuariorepositorio.deleteById(id);
			return "redirect:/usuarios-adicionados";
			
		}
	
	@PostMapping("pesquisar-usuario")
	public ModelAndView pesquisarUsuario(@RequestParam(required = false) String nome){
		ModelAndView mv = new ModelAndView();
		List<Usuario> listaUsuarios;
		if(nome== null || nome.trim().isEmpty()) {
			listaUsuarios=usuariorepositorio.findAll();
		}else {
			listaUsuarios = usuariorepositorio.findByNomeContainingIgnoreCase(nome);
		}
		mv.addObject("ListaDeUsuarios", listaUsuarios);
		mv.setViewName("pesquisa-resultado");
		return mv;
		
	}
	
	@GetMapping("/")
	public ModelAndView loigin() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
		
	}
		
}
	
	