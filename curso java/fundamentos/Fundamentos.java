package fundamentos;

public class Fundamentos {

	public static void main(String[] args) {
		//String nome = "fckF�lps";
		String nome;
		int idade = 71;
		char sexo = 'M';
		double temp = 26.7;
		boolean arCondicionado = false;
		nome = "fckFelps";
		System.out.println("Uso de variav�is na linguagem JAVA");
		System.out.println("Exemplos:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("G�nero: " + sexo);
		System.out.println("Temperatura: " + temp);
		System.out.println("Ar condicionado: " + arCondicionado);
		double i = 10;
		System.out.println("_______________________________________");
		System.out.println("");
		System.out.println("Operadores Aritm�ticos e Atribui��es:");
		System.out.println("Exemplos: ");
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5 | i = " + (i + 5));
		System.out.println("i = " + i + " - 5 | i = " + (i - 5));
		System.out.println("i = " + i + " * 5 | i = " + (i * 5));
		System.out.println("i = " + i + " / 5 | i = " + (i / 5));
		System.out.println("i = " + i + " % 5 | i = " + (i % 5));
		System.out.println("_______________________________________");
		System.out.println("Estruturas de contorle:");
		System.out.println("Estruturas de controle condicional");
		System.out.println("");
		System.out.println("Exemplo 1 - Uso do IF/Else");
		if (sexo == 'M') {
			System.out.println("Alistamento militar obrigat�rio!");
		} else {
			System.out.println("Alistamento militar n�o obrigat�rio!");
		}
		System.out.println("");
		if (idade <= 16 || idade >=71) {
			System.out.println("Voto n�o obrigat�rio");
		} else if (idade >= 18 && idade <= 70) {
			System.out.println("Voto obrigat�rio");
		}
		
		System.out.println("_______________________________________");
		System.out.println("");
		System.out.println("Exemplo 2 - Switch case:");
		System.out.println("1 - Cadastro de cliente");
		System.out.println("2 - Cadastro de usu�rio");
		System.out.println("3 - Relat�rios");
		System.out.println("");
		int op = 4;
		
		switch (op) {
		
		case 1: 
			System.out.println("--> Clientes");
			break;
			
		case 2:
			System.out.println("--> Usu�rios");
			break;
			
		case 3:
			System.out.println("--> Relat�rios");
			break;
			
		default:
			System.out.println("Verifique e tente novamente!");
			break;
		}
		
		System.out.println("");
		System.out.println("Exemplo 3 - Estruturas de repeti��o");
		System.out.println("");
		System.out.println("Tabuada brabona");
		
		int tab, valor;
		
		for (tab = 0; tab <= 10; tab++) {
			System.out.println("");
			for (valor = 0; valor <= 10 ; valor++) {
				System.out.println(tab + " x " + valor + " = " + (tab * valor));
			}
		}
		
		System.out.println("");
		System.out.println("_______________________________________");
		System.out.println("");
		
		char op2;
		System.out.println("");
		System.out.println("Exemplo 4 - do while");
		System.out.println("");
		
		do {
			System.out.println("Deseja sair? (s/n)");
			op2 = 's';
		} while (op2 == 'n');
		System.out.println("Player1 has left");
		
	}
}


