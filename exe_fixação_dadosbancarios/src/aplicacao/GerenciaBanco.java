package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Aplicacao;

public class GerenciaBanco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aplicacao conta;

		System.out.print("Entre com o CPF da conta: ");
		int cpf = sc.nextInt();
		System.out.println("Entre com o nome da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.println("Avera um valor inicial de deposito(S/N?)");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.println("Entre com o valor inicial da conta: ");
			double depositoInicial = sc.nextDouble();
			conta = new Aplicacao(cpf, titular, depositoInicial);
		} else {
			conta = new Aplicacao(cpf, titular);
		}

		int respOps;
		System.out.println("Qual sera o serviço desejado "+ conta.getTitular() + "?");
		System.out.println("Depositar: 1");
		System.out.println("saque: 2");
		System.out.println("Consultar saldo: 3");
		System.out.println("Sair: 4");
		respOps = sc.nextInt();

		while(respOps != 4) {
			if(respOps == 1) {				
				System.out.println();
				System.out.print("Entre com o valor de deposito: ");
				double volorDeposito = sc.nextDouble();
				conta.deposito(volorDeposito);
			} else if(respOps == 2){
				System.out.println();
				System.out.print("Entre com o valor de saque: ");
				double saque = sc.nextDouble();
				conta.saque(saque);
			} else if (respOps == 3) {
				System.out.println();
				System.out.println("Dados da conta:");
				System.out.println(conta);				
			}
			System.out.println();
			System.out.println("Qual sera o serviço desejado "+ conta.getTitular() + "?");
			System.out.println("Depositar: 1");
			System.out.println("saque: 2");
			System.out.println("Consultar saldo: 3");
			System.out.println("Sair: 4");
			respOps = sc.nextInt();
	
		}
		System.out.println("Obrigado, e volte sempre!");
		
		sc.close();
	}

}
