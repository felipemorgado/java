package exercicios;

import java.util.Scanner;

public class Jkp {

	public static void main(String[] args) {
		int jogador, computador;

		Scanner teclado = new Scanner(System.in);
		System.out.println("______Jokênpo______");
		System.out.println("");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.print("Digite a opção desejada: ");
		jogador = teclado.nextInt();
		System.out.println("");

		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu PEDRA");
			break;

		case 2:
			System.out.println("Jogador escolheu PAPEL");
			break;

		case 3:
			System.out.println("Jogador escolheu TESOURA");
			break;

		default:
			System.out.println("Opção inválida.");
		}
		// função gera nmrs aleatorios n inteiros por isso os casting
		computador = (int) (Math.random() * 3 + 1); // vai dar 0 1 2 entao + 1 pra isso

		switch (computador) {
		case 1:
			System.out.println("Computador escolheu PEDRA");
			break;

		case 2:
			System.out.println("Computador escolheu PAPEL");
			break;

		case 3:
			System.out.println("Computador escolheu TESOURA");
			break;
		}
		System.out.println("");

		if (jogador == computador) {
			System.out.println("EMPATE");
		} else {
			if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
					|| (jogador == 3 && computador == 2)) {
				System.out.println("JOGADOR VENCEU");
			} else {
				System.out.println("COMPUTADOR VENCEU");
			}
		}

		teclado.close();
	}

}
