package br.edu.ifpb.pweb2.spring.pratica.spring.boot.controller;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MegaSenaController {

	private Set<Integer> aposta = null;
	
	@RequestMapping("/aposta")
	private String gereNumeros(Model model) {
		aposta = new LinkedHashSet<Integer>(6);
		
		while (aposta.size() < 6) {
			aposta.add(ThreadLocalRandom.current().nextInt(1, 60));
		}
		
		model.addAttribute("aposta", aposta);
		return "aposta";
	}
}
