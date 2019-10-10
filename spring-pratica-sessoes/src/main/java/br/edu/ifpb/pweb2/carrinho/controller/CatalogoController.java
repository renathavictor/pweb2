package br.edu.ifpb.pweb2.carrinho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifpb.pweb2.carrinho.model.Catalogo;

@Controller
@RequestMapping("/catalogo")
public class CatalogoController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView m = new ModelAndView("catalogo");
		m.addObject("itens", Catalogo.getItens());
		return m;
	}
}
