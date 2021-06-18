package temperaturas;

import java.text.DecimalFormat;

public class Temperatura {
	private double f;
	
	public void setF(double f) {
		this.f = f;
	}
	
	public double getF() {
		return f;
	}
	
	private double c;
	
	public void setC(double c) {
		this.c = c;
	}
	
	public double getC() {
		return c;
	}
	
	//objetos
	DecimalFormat formatador = new DecimalFormat("#0.0");
	
	public void exibirTemperatura() {
		System.out.println("");
		System.out.println("Temperatura: " + formatador.format(getF()) + 
				" °F ou " + formatador.format(getC()) + " °C.");
	}
	
	double converterF(double f) {
		double res = (f - 32) / 1.8;
		return res;
	}
	
	double converterC(double c) {
		double res = c * 1.8 + 32;
		return res;
	}
	
}
