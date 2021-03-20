package aplication;

import java.util.Locale;
import java.util.Scanner;

//importando a classe CurrencyConverter
import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale."uma determinada localidade informada") definide uma outra localidade padr�o diferente da que o computador est� configurado
		Locale.setDefault(Locale.US);
		//criando um objeto do tipo Scanner associando ele com a entrada de dados padr�o(teclado) de modo a ser poss�vel realziar a entradas de dados, 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Whats is the dolar price? ");
		//criando a vari�vel dollarPrice do tipo double e atribuindo nela a cota��o do dolar que o usu�rio digitou
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		//criando a vari�vel amount do tipo double e atribuindo nela a quantia em dolares que o usu�rio digitou
		double amount = sc.nextDouble();
		
		//desta forma o pr�ximo print ficar� uma linha a mais para baixo em compara��o com o print anterior
		System.out.println();
		//criando a vari�vel result do tipo double a qual receber� o retorno do m�todo dollarToReal que est� na classe CurrencyConverter, que � chamado passando como par�metro por valor as vari�veis dollarPrice e amount sendo que elas cont�m o valor da cota��o do d�lar e a quantia desejada em d�lares
		double result = CurrencyConverter.dollarToReal(dollarPrice, amount);
		System.out.printf("Amount to be paid in reais = R$ %.2f%n", result);
		
		//encerra o recurso criado no in�cio(linha 14), ou seja, fecha o Scanner
		sc.close();
	}
}
