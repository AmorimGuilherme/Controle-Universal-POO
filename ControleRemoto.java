package br.com.brq.inicio.exercicios.controle_universal;

public class ControleRemoto {

	public ControleRemoto() {
	}

	public void diminueVolume(AparelhoTelevisor aparelho) {
		aparelho.diminueVolume();
	}

	public void aumentaVolume(AparelhoTelevisor aparelho) {
		aparelho.aumentaVolume();
	}

	public void mudaCanal(AparelhoTelevisor aparelho, int canal) {
		aparelho.mudaCanal(canal);

	}

	public boolean ligaAparelho(AparelhoTelevisor aparelho) {
		return aparelho.ligaAparelho();

	}

	public boolean desligaAparelho(AparelhoTelevisor aparelho) {
		return aparelho.desligaAparelho();
	}

}
