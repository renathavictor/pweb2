package br.edu.ifpb.pweb2.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CodCursoConstraintValidator implements ConstraintValidator<CodCurso, String> {

	private String prefix;
	
	@Override
	public void initialize(CodCurso c) {
		prefix = c.value();
	}
	
	public boolean isValid(String codigo, ConstraintValidatorContext context) {
		boolean resultado;
		if (codigo != null)
			resultado = codigo.startsWith(prefix);
		else 
			resultado = false;
		return resultado;
	}
}
