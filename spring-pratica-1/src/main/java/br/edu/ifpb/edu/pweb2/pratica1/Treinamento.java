package br.edu.ifpb.edu.pweb2.pratica1;

public class Treinamento implements TreinamentoIntl {
	
	private static TreinoIntf treino;

	private TreinoInicioTemporada treinoInicio;
	
	Treinamento(TreinoInicioTemporada treinoInicio) {
		this.treinoInicio = treinoInicio;
	}
	
	public Treinamento(TreinoIntf treino) {
		this.treino = treino;
	}

	public Treinamento() {
	}
	
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
