package br.edu.ifpb.pweb2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping("/form")
	public String showLoginForm() {
		return "form-login";
	}
	
	@RequestMapping("/valide")
	public String valideLogin(String login, String senha, Model model) {
		if (login.equals("admin") && senha.equals("secret")) {
			model.addAttribute("login", login);
			return "index";
		} else {
			model.addAttribute("erro", "Login inv�lido!");
			return "form-login";
		}
	}
}
