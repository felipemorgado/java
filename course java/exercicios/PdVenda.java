package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PdVenda {

	public static void main(String[] args) {
		double total, desconto, troco, totalDesconto, valorPago;

		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");

		System.out.println("--------------------------");
		System.out.print("Entre com o valor total: ");
		total = teclado.nextDouble();
		System.out.println("");
		System.out.print("Entre com o desconto: ");
		desconto = teclado.nextDouble();
		System.out.println("");

		totalDesconto = total - (desconto * total) / 100;
		
		System.out.println("Total com desconto R$ " + formatador.format(totalDesconto));
		System.out.println("--------------------------");
		System.out.println("");

		System.out.print("Entre com o valor pago:");
		valorPago = teclado.nextDouble();
		
		troco = valorPago - totalDesconto;
		
		System.out.println("O seu troco é R$ " + formatador.format(troco) + "!");

		teclado.close();
	}

}
