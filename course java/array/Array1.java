package array;

public class Array1 {

	public static void main(String[] args) {
		String[] carros = {"ferrari", "fusca", "camaro", "uno"};
		
		System.out.println("Tamanho do array: " + carros.length);
		System.out.println("Carro: " + carros[0]);
		carros[0]= "CU";
		System.out.println("Carro: " + carros[0]);
		
		for (int i = 0; i < carros.length; i++) {
			System.out.println("Carro[" + i + "] = " + carros[i]);
		}
	}

}
