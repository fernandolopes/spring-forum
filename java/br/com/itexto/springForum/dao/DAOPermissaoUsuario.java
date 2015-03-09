package br.com.itexto.springForum.dao;

import java.util.List;

import br.com.itexto.springForum.entidades.PermissaoUsuario;
import br.com.itexto.springForum.entidades.Usuario;

public interface DAOPermissaoUsuario {
	
	public List<PermissaoUsuario> getPermissoesUsuario(Usuario usuario);
	
	public void addRole(String role, Usuario usuario);
	
}
