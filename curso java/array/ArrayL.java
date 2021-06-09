package array;

import java.util.ArrayList;

public class ArrayL {

	public static void main(String[] args) {
		ArrayList<String> contatos = new ArrayList<>();
		contatos.add("Felps boladão");
		contatos.add("97172-8280");
		contatos.add("felipemegadopinto@gmail.com");
		contatos.add("Elly boladão");
		contatos.add("99999-8000");
		contatos.add("ellybxt@gmail.com");
		
		System.out.println("Tamanho do Array: " + contatos.size());
		System.out.println(contatos);
		System.out.println("");
		System.out.println("Email da elly: " + contatos.get(5));
		System.out.println("____________________");
		for (int i = 0; i < contatos.size(); i++) {
			System.out.println(contatos.get(i));
		}
	}

}
