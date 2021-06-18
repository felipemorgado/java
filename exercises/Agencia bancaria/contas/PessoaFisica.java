package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.setCliente("Felps Rabudo");
		cc1.setSaldo(10000); //usa o set para atribuir valor nessa variavel
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.getSaldo();
		cc1.sacar(2000);
		cc1.exibirSaldo();
		System.out.println("----------------------------");
		
		Conta cc2 = new Conta();
		cc2.setCliente("Felps Gotico");
		cc2.setSaldo(8500);
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.getSaldo();
		cc2.depositar(2000);
		cc2.exibirSaldo();
		System.out.println("----------------------------");
		
		System.out.println("Transferencia");
		System.out.println("Cliente: " + cc1.getCliente());
		System.out.println("Favorecido: " + cc2.getCliente());
		cc1.transferir(cc2, 2000);
		System.out.println("");
		
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		System.out.println("Favorecido: " + cc2.getCliente());
		cc2.exibirSaldo();
		System.out.println("----------------------------");
		
		System.out.println("Relatório");
		Conta gerente = new Conta();
		double relatorio = gerente.soma(cc1.getSaldo(), cc2.getSaldo());
		System.out.println("Saldo total: R$" + relatorio);
	}

}
