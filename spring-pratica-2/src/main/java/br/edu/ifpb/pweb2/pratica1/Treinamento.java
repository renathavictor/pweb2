package br.edu.ifpb.pweb2.pratica1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Treinamento implements TreinamentoIntl {
	
	@Autowired
	@Qualifier("treinoMeioTemporada")
	private TreinoIntf treino;

	private TreinoInicioTemporada treinoInicio;
	
	Treinamento(TreinoInicioTemporada treinoInicio) {
		this.treinoInicio = treinoInicio;
	}
	
	public Treinamento(TreinoIntf treino) {
		this.treino = treino;
	}

	public Treinamento() {
	}
	
//	@Autowired
//	@Qualifier("treinoInicioTemporada")
	public void setTreino(TreinoIntf treino) {
		this.treino = treino;
	}
	
	public void fazTreinamento() {
		System.out.println("Vamos lá!");
		System.out.println("Primeiro: ");
		treino.preparoFisico();
		System.out.println("Agora quero: ");
		treino.jogoTreino();
		System.out.println("Para terminar: ");
		treino.treinoTatico();
	}


}
