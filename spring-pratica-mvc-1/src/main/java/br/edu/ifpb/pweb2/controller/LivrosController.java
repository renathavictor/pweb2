package br.edu.ifpb.pweb2.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.ifpb.pweb2.model.Livro;
import br.edu.ifpb.pweb2.repo.LivrosRepository;

@Controller
@RequestMapping("/livros")
public class LivrosController {

	@RequestMapping("/form")
	public String showForm(Livro livro, Model model) {
		model.addAttribute("estiloOptions", this.getEstiloOption());
		return "livros-form";
	}
	
	@RequestMapping("/save")
	public String saveLivro(Livro livro, Model model) {
		LivrosRepository.store(livro);
		model.addAttribute(livro);
		model.addAttribute("livros", LivrosRepository.findAll());
		return "livros-cadastrados";
	}
	
	@RequestMapping("/list")
	public String listeLivros(Model model) {
		model.addAttribute("livros", LivrosRepository.findAll());
		return "livros-cadastrados";
	}
	
//	@RequestMapping("/busque")
//	public String busqueLivro(@RequestParam("id") Long id, Model model) {
//		Livro livro = LivrosRepository.findById(id);
//		model.addAttribute(livro);
//		model.addAttribute("estiloOptions", this.getEstiloOption());
//		return "livros-form";
//	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public String busqueLivro(@PathVariable("id") Long id, Model model) {
		Livro livro = LivrosRepository.findById(id);
		model.addAttribute(livro);
		model.addAttribute("estiloOptions", this.getEstiloOption());
		return "livros-form";
	}
	
	private Map<String, String> getEstiloOption() {
		LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
		options.put("Romance", "Romance");
		options.put("Terror", "Terror");
		options.put("Suspense", "Suspense");
		options.put("Drama", "Drama");
		options.put("Ciências", "Ciências");
		return options;
	}
	
}
