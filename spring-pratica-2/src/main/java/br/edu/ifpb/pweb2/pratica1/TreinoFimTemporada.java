package br.edu.ifpb.pweb2.pratica1;

import org.springframework.stereotype.Component;

@Component
public class TreinoFimTemporada implements TreinoIntf {

	public void preparoFisico() {
		System.out.println("Corrida leve de 10 minutos. fim.");
	}
	
	public void jogoTreino() {
		System.out.println("Jogo com a equipe de juniores. fim.");
	}
	
	public void treinoTatico() {
		System.out.println("Cobrança de escanteios e faltas. fim.");
	}
	
	public TreinoFimTemporada() {
	}
	
}
