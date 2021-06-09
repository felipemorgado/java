package array;

public class ArrayM {

	public static void main(String[] args) {
		String[][] agenda = { { "José", "91234-5000", "professormeusaco.com" },
				{ "Bill", "2222-4444", "bill@meusaco.com" }, { "Linux", "99999-9999", "tux@meusaco.com" } };
		
		System.out.println(agenda[0][1]);
		System.out.println("--------");
		
		for (int l = 0; l < agenda.length; l++) {
			System.out.println("");
			for (int c = 0; c < agenda.length; c++) {
				System.out.println(agenda[l][c]);
			}
		}
	}

}
