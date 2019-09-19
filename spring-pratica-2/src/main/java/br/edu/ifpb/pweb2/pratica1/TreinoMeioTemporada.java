package br.edu.ifpb.pweb2.pratica1;

import org.springframework.stereotype.Component;

@Component
public class TreinoMeioTemporada implements TreinoIntf {

	public void preparoFisico() {
		System.out.println("Preparo treino meio temporada");
	}
	
	public void jogoTreino() {
		System.out.println("Jogo treino meio temporada");
	}
	
	public void treinoTatico() {
		System.out.println("Treino tatico meio temporada");
	}
}
