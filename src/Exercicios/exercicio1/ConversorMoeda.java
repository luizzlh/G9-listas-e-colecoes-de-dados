package Exercicios.exercicio1;

public class ConversorMoeda implements ConversaoFinanceira{

	public void converterDolarParaReal(double valor) {
		System.out.println(valor * 5.50);
		
	}
	
	public static void main(String[] args) {
		ConversorMoeda cm = new ConversorMoeda();
		cm.converterDolarParaReal(5.50);
	}
	
}