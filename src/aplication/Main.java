package aplication;

import java.util.Locale;
import java.util.Scanner;

//importando a classe CurrencyConverter
import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale."uma determinada localidade informada") definide uma outra localidade padrão diferente da que o computador está configurado
		Locale.setDefault(Locale.US);
		//criando um objeto do tipo Scanner associando ele com a entrada de dados padrão(teclado) de modo a ser possível realziar a entradas de dados, 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Whats is the dolar price? ");
		//criando a variável dollarPrice do tipo double e atribuindo nela a cotação do dolar que o usuário digitou
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		//criando a variável amount do tipo double e atribuindo nela a quantia em dolares que o usuário digitou
		double amount = sc.nextDouble();
		
		//desta forma o próximo print ficará uma linha a mais para baixo em comparação com o print anterior
		System.out.println();
		//criando a variável result do tipo double a qual receberá o retorno do método dollarToReal que está na classe CurrencyConverter, que é chamado passando como parâmetro por valor as variáveis dollarPrice e amount sendo que elas contém o valor da cotação do dólar e a quantia desejada em dólares
		double result = CurrencyConverter.dollarToReal(dollarPrice, amount);
		System.out.printf("Amount to be paid in reais = R$ %.2f%n", result);
		
		//encerra o recurso criado no início(linha 14), ou seja, fecha o Scanner
		sc.close();
	}
}
