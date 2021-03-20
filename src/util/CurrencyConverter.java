package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06; //declarando uma constante, sendo ela o valor da IOF sobre o valor em dólares
	
	//criando método que irá calcular o valor em reais que deverá ser pago pela quantia deseja de dólares, este método recebe como parâmetro por valor a cotação do dolar e a quantia desejada em dólares 
	public static double dollarToReal(double dollarPrice, double amount) {
		
		//retorna para a classe principal o calculo do valor em reais de determinada quantia em dólares e ainda acrescenta IOF sobre o valor em dólares
		return dollarPrice * amount * (1.0 + IOF);
	}
}
