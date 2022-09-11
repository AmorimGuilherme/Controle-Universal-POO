package br.com.brq.inicio.exercicios.controle_universal;

public class AparelhoTelevisor {

	private int canal = 1;
	private int volume = 0;
	private boolean ligado = false;

	public AparelhoTelevisor() {

	}

	public AparelhoTelevisor(int canal, int volume) {
		this.canal = canal;
		this.volume = volume;
	}

	public int getCanal() {
		return canal;
	}

	public int getVolume() {
		return volume;
	}

	public boolean getLigado() {
		return ligado;
	}

	public void diminueVolume() {
		if (ligado == true) {
			if (volume <= 0) {
				volume = 0;
			} else {
				volume--;
			}

		} else {
			System.out.println("Ligue o aparelho!");
		}
	}

	public void aumentaVolume() {
		if (ligado == true) {
			if (volume >= 100) {
				volume = 100;
			} else {
				volume++;
			}
		} else {
			System.out.println("Ligue o aparelho!");
		}
	}

	public void mudaCanal(int canal) {
		if (ligado == true) {
			if (canal > 0 && canal <= 50) {
				this.canal = canal;
			}
		} else {
			System.out.println("Ligue o aparelho!");
		}
	}

	public boolean ligaAparelho() {
		return ligado = true;
	}

	public boolean desligaAparelho() {
		return ligado = false;
	}

	@Override
	public String toString() {
		if (ligado == true) {
			return "Aparelho: " + getClass().getSimpleName() + " | Canal: " + getCanal() + " | Volume: " + getVolume();
		} else {
			return "Aparelho desligado!";
		}
	}
}