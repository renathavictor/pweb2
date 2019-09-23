package br.edu.ifpb.pweb2.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CodCursoConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CodCurso {

	public String value() default "TSI";
	public String message() default "Deve iniciar por TSI";
	public Class<?>[] groups() default {};
	public Class<? extends Payload>[] payload() default {};
}
