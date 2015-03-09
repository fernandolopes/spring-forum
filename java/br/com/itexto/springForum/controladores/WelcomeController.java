package br.com.itexto.springForum.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public String welcomeAdmin(ModelMap model) {
		
		model.addAttribute("message","Spring Security - ROLE ADMIN");
		return "hello";
	}
}
