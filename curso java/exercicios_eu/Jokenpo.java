package exercicios_eu;

import java.io.IOException;
//import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) throws IOException {
		int op = 5, rand;
		String j1 = "ERROR", bot1 = "ERROR", res = "ERROR";
		
		//objetos
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		
		do {
		
		for (int i = 0; i < 20; i++) {
			System.out.println("");
		}
		System.out.println("-------------------------------");
		System.out.println("	    Jokênpo");
		System.out.println("");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("0 - Sair");
		System.out.println("");
		System.out.print("Digite a opção desejada: ");
		op = teclado.nextInt();
		
			switch (op) {
			case 0:
				System.out.println("");
				System.out.println("Aplicativo encerrado!");
				System.exit(0);
				break;
			
			case 1:
				j1 = "Pedra";
				break;
			
			case 2:
				j1 = "Papel";
				break;
				
			case 3: 
				j1 = "Tesoura";
				break;
				
			default:
				System.out.println("Opção inválida! Pressione enter e tente novamente.");
				System.in.read();
				for (int i = 0; i < 20; i++) {
					System.out.println("");
				}
				break;
				
			}
			
			rand = 0;	//gerar um nmr aleatorio com intervalo de 1 a 3
			while (true) {
				rand = gerador.nextInt(4);
				if (rand != 0) {
					break;
				}
			}
			
			if (rand == 1) {
				bot1 = "Pedra";
			} else if (rand == 2) {
				bot1 = "Papel";
			} else {
				bot1 = "Tesoura";
			}
			
			System.out.println("");
			System.out.println("Jogador1 escolheu: " + j1);
			System.out.println("Bot1 escolheu: " + bot1);
			
			if ((op == 1 && rand == 3) || (op == 2 && rand == 1) || (op == 3 && rand == 2)){
				res = "Jogador1!";
				
			} else if (op == rand) {
				res = "Ninguém! Deu empate.";
			} else {
				res = "Bot1!";
			}
			
			System.out.println("");
			System.out.println("Vencedor: " + res);
			//String pausa = teclado.next();
			System.out.println("");
			System.out.println("Pressione enter para continuar...");
			System.in.read();
			
			
		} while (op != 0);
		System.out.println("-------------------------------");
		teclado.close();
	}

}
