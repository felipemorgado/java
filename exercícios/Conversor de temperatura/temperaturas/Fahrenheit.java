package temperaturas;

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		Temperatura f = new Temperatura();
		double far;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("-----------------------------------");
		System.out.println("Converter Fahrenheit para Celsius");
		System.out.println("");
		System.out.print("Informe a temperatura em Fahrenheit: ");
		far = teclado.nextDouble();
		
		f.setF(far);
		f.setC(f.converterF(f.getF()));
		f.exibirTemperatura();
		System.out.println("-----------------------------------");
		
		teclado.close();
	}

}
