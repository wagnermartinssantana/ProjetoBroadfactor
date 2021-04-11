package br.com.projetobroadfactor.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetobroadfactor.model.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Integer>  {
	
	public List<Usuario> findByNomeContainingIgnoreCase(String nome);

}
