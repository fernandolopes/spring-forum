package br.com.itexto.springForum.controladores;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class AutenticacaoController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(HttpSession sessao){
		
				return "loginFalho";
		
	}
}
