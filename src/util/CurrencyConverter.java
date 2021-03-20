package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06; //declarando uma constante, sendo ela o valor da IOF sobre o valor em d�lares
	
	//criando m�todo que ir� calcular o valor em reais que dever� ser pago pela quantia deseja de d�lares, este m�todo recebe como par�metro por valor a cota��o do dolar e a quantia desejada em d�lares 
	public static double dollarToReal(double dollarPrice, double amount) {
		
		//retorna para a classe principal o calculo do valor em reais de determinada quantia em d�lares e ainda acrescenta IOF sobre o valor em d�lares
		return dollarPrice * amount * (1.0 + IOF);
	}
}
