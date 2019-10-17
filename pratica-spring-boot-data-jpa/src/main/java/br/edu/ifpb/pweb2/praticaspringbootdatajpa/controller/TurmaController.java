package br.edu.ifpb.pweb2.praticaspringbootdatajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifpb.pweb2.praticaspringbootdatajpa.entity.Turma;
import br.edu.ifpb.pweb2.praticaspringbootdatajpa.repository.TurmaRepository;

@Controller
@RequestMapping("/turmas")
public class TurmaController {

	@Autowired
	private TurmaRepository repository;
	
	@RequestMapping
	private ModelAndView list(String disciplina) {
		ModelAndView model = new ModelAndView("turma/turmas");
		disciplina = (disciplina == null) ? "" : disciplina;
//		List<Turma> turmas = repository.findAll();
//		List<Turma> turmas = repository.findByDisciplinaStartingWithIgnoreCase(disciplina);
		List<Turma> turmas = repository.findByNomeDisciplina(disciplina);
		model.addObject("turmas", turmas);
		return model;
	}
	
	@RequestMapping("/form")
	public String form() {
		return "turma/form";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String save(Turma turma) {
		repository.save(turma);
		return "redirect:turmas";
	}
}
