package br.edu.ifpb.pweb2.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifpb.pweb2.model.Aluno;

@Controller
@RequestMapping("/alunos")
public class AlunoController {

	@RequestMapping("/form")
	public ModelAndView showAlunoForm() {
		ModelAndView mav = new ModelAndView("form-aluno");
		mav.addObject("aluno", new Aluno());
		return mav;
	}
	
	@RequestMapping("/salve")
	public String cadastreAluno(@Valid Aluno aluno, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "form-aluno";
		} else {
			return "cadastro-aluno";
		}
	}
}
