package temperaturas;

import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) {
		Temperatura c = new Temperatura();
		double cel;
		
		//Objt
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("-----------------------------------");
		System.out.println("Converter Celsius para Fahrenheit");
		System.out.println("");
		System.out.print("Informe a temperatura em Celsius: ");
		cel = teclado.nextDouble();
		
		c.setC(cel);
		c.setF(c.converterC(c.getC()));
		c.exibirTemperatura();
		System.out.println("-----------------------------------");
		
		teclado.close();
	}

}
