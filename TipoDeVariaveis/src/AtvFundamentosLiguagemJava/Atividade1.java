package AtvFundamentosLiguagemJava;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*Você receberá dois valores inteiros. Faça a leitura e em seguida calcule
		 *o produto entre estes dois valores. Atribua esta operação à variável PROD,
		 *mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo). 
		 */

		int numero1, numero2, PROD;
		
		System.out.println("Digite um número INTEIRO: ");
		numero1 = sc.nextInt();
		
		System.out.println("Digite outro número INTEIRO: ");
		numero2 = sc.nextInt();
		
		PROD = numero1 * numero2;
		System.out.println("O resultado do PRODUTO desse dois números é: " + PROD);
		
		
		
		
		
		
		
		
	}

}
