package br.com.brq.inicio.exercicios.controle_universal;

public class ControleMain {

	public static void main(String[] args) {

		ControleRemoto controle = new ControleRemoto();
		AparelhoTelevisor tv = new Televisor(1, 2);
		AparelhoTelevisor setTop = new SetTopBox(5, 7);

		controle.diminueVolume(setTop); // Não permite, pois aparelho inicializa ligado = false
		controle.diminueVolume(tv); // Não permite, pois aparelho inicializa ligado = false

		controle.ligaAparelho(setTop); // Liga SetTop
		controle.ligaAparelho(tv); // Liga TV

		System.out.println(tv); // Aparelho: Televisor | Canal: 1 | Volume: 2
		System.out.println(setTop); // Aparelho: SetTopBox | Canal: 5 | Volume: 7

		controle.aumentaVolume(setTop); // Aumenta o volume +1
		controle.aumentaVolume(setTop); // Aumenta o volume +1n
		controle.aumentaVolume(setTop); // Aumenta o volume +1
		System.out.println(setTop); // Canal = 5 | Volume = 10

		controle.mudaCanal(tv, 15); // Muda canal da TV para 15

		System.out.println(tv); // Aparelho: Televisor | Canal: 15 | Volume: 2
		System.out.println(setTop); // Aparelho: SetTopBox | Canal: 5 | Volume: 10

	}

}
