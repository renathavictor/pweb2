package br.edu.ifpb.pweb2.pratica1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TreinoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(TreinoSpringConfig.class);
		
		TreinamentoIntl treinamento = context.getBean("treinamentoCrossFit", TreinamentoIntl.class);
		//TreinamentoIntl treinamento2 = context.getBean("treinamento", TreinamentoIntl.class);

		
		System.out.println(treinamento);
		//System.out.println(treinamento2);
		
		treinamento.fazTreinamento();
		context.close();

	}
	

}
