package AtvFundamentosLiguagemJava;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		/*
		 * Leia 2 valores de ponto flutuante de dupla precisão A e B, 
		 * que correspondem a 2 notas de um aluno. A seguir, calcule a média
		 * do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 
		 * (A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, 
		 * sempre com uma casa decimal.
		 * 
		 * 
		 */
		  
		Scanner sc = new Scanner(System.in);	  

	        double numero1, numero2, media;

	        System.out.println("Qual foi sua primeira nota: ");
	        numero1 = sc.nextDouble();
	        System.out.println("Qual foi sua segunda nota: ");
	        numero2 = sc.nextDouble();
 
	        media = (numero1 * 3.5 + numero2 * 7.5)/11; 

	        System.out.printf("MEDIA = %.5f", media);
	        System.out.println();
		
		
	}

}
