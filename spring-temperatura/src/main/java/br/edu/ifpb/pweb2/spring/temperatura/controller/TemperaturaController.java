package br.edu.ifpb.pweb2.spring.temperatura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/temperatura")
public class TemperaturaController {
	
	private double paraF;
	private double paraC;

	@RequestMapping(method = RequestMethod.GET)
	public String geraTemperatura(Model model) {
		return "temperatura";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String converter(String celsius, String farenheit) {
		double c = Double.parseDouble(celsius);
		double f = Double.parseDouble(farenheit);
		converteCelsius(c);
		converteFarenheit(f);
		System.out.println(c);
		System.out.println(f);
		return "redirect:temperatura";
	}
	
	
	private void converteCelsius(double f) {
		paraF = 5/9 * (f - 32);
	}
	
	private void converteFarenheit(double c) {
		paraC = (c * 1.8) + 32;
	}
}
