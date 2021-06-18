package seguros;

import contas.Conta;

public class SeguroPessoaFisica {

	public static void main(String[] args) {
		Conta cc3 = new Conta();
		cc3.setCliente("Felps Triste");
		cc3.setSaldo(9000);
		System.out.println("Cliente: " + cc3.getCliente());
		cc3.getSaldo();
		System.out.println("----------------------------");

	}

}
