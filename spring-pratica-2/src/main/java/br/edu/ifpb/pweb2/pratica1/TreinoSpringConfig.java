package br.edu.ifpb.pweb2.pratica1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = {"br.edu.ifpb.pweb2"})
public class TreinoSpringConfig {
	
	@Bean
	public TreinamentoIntl treinamentoCrossFit() {
		return new TreinamentoCrossFit(treinoFimTemporada());
	}
	
	@Bean
	public TreinoIntf treinoFimTemporada() {
		return new TreinoFimTemporada();
	}
	

}
