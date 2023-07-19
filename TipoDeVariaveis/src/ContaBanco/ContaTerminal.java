package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		//TODO: Conhecer e importar a classe Scanner
		
		//TODO: Exibir as mensagens para o usuário
		
		//TODO: Obter pela classe Scanner os valores digitados no terminal
		
		//TODO: Exibir a mensagem da conta criada
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int numero;
		String agencia, nomeCliente; 
		float saldo;
		
		System.out.println("Por favor, digite seu nome: ");
		nomeCliente = sc.nextLine();
		
		System.out.println("Por favor, digite o número da conta: ");
		numero = sc.nextInt();
		
		System.out.println("Por favor, digite o número da agência: ");
		agencia = sc.next();
		
		System.out.println("Por favor, digite o seu saldo em conta: ");
		saldo = sc.nextFloat();
		
		System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
				+ "sua agência é " + agencia + ", conta " + numero + " e saldo %.2f", saldo, 
				" já está disponível para saque.");
		
		

		

		

	}

}
