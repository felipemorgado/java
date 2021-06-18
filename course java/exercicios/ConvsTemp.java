package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvsTemp {

	public static void main(String[] args) {
		double c,f;
		//obj
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");

		//entrada de dados
		System.out.println("Conversão de temperatura");
		System.out.print("Digite a temperatura em fahrenheit: ");
		f = teclado.nextDouble();
		
		c = (5 * (f - 32)) / 9;
		
		System.out.println("Temperatura em celsius:" + formatador.format(c) + " °C.");

		teclado.close();
	}

}
