package br.edu.ifpb.edu.pweb2.pratica1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TreinoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		TreinamentoIntl treinamento = context.getBean("treinamento", TreinamentoIntl.class);
		treinamento.fazTreinamento();
		context.close();

	}
	

}
