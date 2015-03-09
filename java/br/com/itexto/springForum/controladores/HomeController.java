package br.com.itexto.springForum.controladores;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.itexto.springForum.dao.DAOPermissaoUsuario;
import br.com.itexto.springForum.dao.DAOUsuario;
import br.com.itexto.springForum.entidades.Usuario;

@Controller

public class HomeController {
	
	@Autowired
	private DAOUsuario daoUsuario;
	@Autowired
	private DAOPermissaoUsuario daoPermissaoUsuario;
	
	public DAOPermissaoUsuario getDaoPermissaoUsuario() {
		return daoPermissaoUsuario;
	}
	
	public void setDaoPermissaoUsuario(DAOPermissaoUsuario dao) {
		daoPermissaoUsuario = dao;
	}
	
	public DAOUsuario getDaoUsuario() {
		return daoUsuario;
	}

	public void setDaoUsuario(DAOUsuario daoUsuario) {
		this.daoUsuario = daoUsuario;
	}
	
	@RequestMapping("/")
	public String index(Map<String, Object> model) {
		
        return "index";
        
	}
	
	@RequestMapping("/registro")
	public String registro(Map<String, Object> model) {
		if (model.get("usuario") == null) {
			Usuario usr = new Usuario();
			
			model.put("usuario", usr);
		}
		return "registro";
	}
	
	@RequestMapping(value="/executarRegistro", method=RequestMethod.POST)
	public String executarRegistro(@Valid Usuario usuario, 
									BindingResult bindingResult, 
									HttpSession sessao) {
		if (bindingResult.hasErrors()) {
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("usuario", usuario);
			return registro(model);
		}
		getDaoUsuario().persistir(usuario);
		getDaoPermissaoUsuario().addRole("ROLE_MEMBRO", usuario);
		
		
		sessao.setAttribute("usuario", usuario);
		return "redirect:/";
	}
}
