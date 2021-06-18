package exercicios_eu;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Porcentagem {

	public static void main(String[] args) {
		double n1, n2, res;

		// objt
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");

		System.out.println("----------------------------------");
		System.out.println("Calculador de Porcentagem");
		System.out.println("");
		System.out.print("Informe o número da porcentagem desejada: ");
		n1 = teclado.nextDouble();
		System.out.println("");
		System.out.print("Informe um número: ");
		n2 = teclado.nextDouble();
		System.out.println("");

		res = (n1 * n2) / 100;

		System.out.println(
				formatador.format(n1) + "% de " + formatador.format(n2) + " é igual a " + formatador.format(res));
		System.out.println("----------------------------------");

		teclado.close();
	}

}
