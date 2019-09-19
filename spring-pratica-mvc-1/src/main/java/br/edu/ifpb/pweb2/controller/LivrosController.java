package br.edu.ifpb.pweb2.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifpb.pweb2.model.Livro;

@Controller
@RequestMapping("/livros")
public class LivrosController {

	@RequestMapping("/form")
	public String showForm(Livro livro, Model model) {
		model.addAttribute("estiloOptions", this.getEstiloOption());
		return "livros-form";
	}
	
	private Map<String, String> getEstiloOption() {
		LinkedHashMap<String, String> options = new LinkedHashMap<>();
	}
}
