package poo;

import java.util.Random;

public class Carro {
	int ano;
	String cor;
	
	public Carro() {
		Random gerador = new Random();
		int chassi = gerador.nextInt(1000);
		System.out.println("Chassi: " + chassi);
	}
	
	public Carro(int ano, String cor) {
		this.ano = ano;
		this.cor = cor;
	}
	
	void ligar() {
		System.out.println("O carro est� ligado!");
	}
	
	void desligar() {
		System.out.println("O carro est� desligado!");
	}
	
	void acelerar() {
		System.out.println("O carro est� em movimento!");
	}
}
