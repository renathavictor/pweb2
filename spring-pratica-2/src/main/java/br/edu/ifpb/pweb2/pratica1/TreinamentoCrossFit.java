package br.edu.ifpb.pweb2.pratica1;


import org.springframework.stereotype.Component;

@Component
public class TreinamentoCrossFit implements TreinamentoIntl {

	private TreinoIntf treino;

	public TreinamentoCrossFit(TreinoIntf treino) {
		this.treino = treino;
	}

	public TreinamentoCrossFit() {
	}
	
	@Override
	public void fazTreinamento() {
		System.out.println("Vamos lá!");
		System.out.println("Primeiro: ");
		treino.preparoFisico();
		System.out.println("Agora quero: ");
		treino.jogoTreino();
		System.out.println("Para terminar: ");
		treino.treinoTatico();
	}

	@Override
	public void setTreino(TreinoIntf treino) {
		// TODO Auto-generated method stub
		
	}

}
