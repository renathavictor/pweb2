package br.edu.ifpb.pweb2.praticaspringbootdatajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifpb.pweb2.praticaspringbootdatajpa.entity.Aluno;
import br.edu.ifpb.pweb2.praticaspringbootdatajpa.repository.AlunoRepository;

@Controller
@RequestMapping("/alunos")
public class AlunoController {

	@Autowired
	private AlunoRepository repository;
	
	@RequestMapping
	private ModelAndView list() {
		ModelAndView model = new ModelAndView("aluno/alunos");
		List<Aluno> alunos = repository.findAll();
		model.addObject("alunos", alunos);
		return model;
	}
	
	@RequestMapping("/form")
	public String form() {
		return "turma/form";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String save(Aluno aluno) {
		repository.save(aluno);
		return "redirect:alunos";
	}
}
