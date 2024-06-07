package projetoPosto;

import java.util.Locale;
import java.util.Scanner;

import entidadePosto.ProgramaPosto;

public class PostoCombustivel {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		/*Importação da classe ProgramaPosto*/
		ProgramaPosto produtos = new ProgramaPosto();
		
		/*Entrada dos dados do dia*/
		System.out.println("Entre com os dados do dia: ");
		System.out.print("nome do veiculo: ");
		produtos.veiculo = sc.nextLine();
		System.out.print("Valor da gasolina: ");
		produtos.vlGasolina = sc.nextDouble();
		System.out.print("Valor do etanol: ");
		produtos.vlEtanol = sc.nextDouble();

		System.out.println();
		System.out.println("dados do dia:"
				+ " veiculo "
				+ produtos.veiculo 
				+ ", valor da gasolina: " 
				+ produtos.vlGasolina 
				+ ", valor do etanol: " 
				+ produtos.vlEtanol);
		
		

		/*Variaveis para acrecentar valor dos combustiveis em IF e ELSE*/
		int gasolina = 0;
		int etanol = 0;
		
		/* Variavel para entrada em IF e ElSE IF*/
		int resposta = 0;

		
		System.out.println();
		System.out.printf("Escolha uma das opções a baixo%n"
		+ "bomba 1(GASOLINA): 1%n" 
		+ "bomba 2(ETANOL): 2%n");
		System.out.println();
		System.out.print("resposta: ");

		resposta = sc.nextInt();

		while (resposta != 5) {

			if (resposta == 1) {
				System.out.print("Quantidade de litros: ");
				gasolina += sc.nextInt();
				System.out.println();
			} else if (resposta == 2) {
				System.out.print("Quantidade de litros: ");
				etanol += sc.nextInt();
				System.out.println();
			}

			System.out.printf("Deseja finalizar (5 encerra)?" 
			+ "%nSe não, digite as respostas mostradas anteriormente:"
			+ "%nGasolina: 1" 
			+ "%nEtanol: 2 ");
			System.out.println();
			System.out.print("resposta: ");
			resposta = sc.nextInt();
		}

		/*Quantidade de litros abastecida no dia*/		
		System.out.println();
		System.out.println("total de litros por gasolina: " + gasolina);

		System.out.println();
		System.out.println("total de litros por etanol: " + etanol);

		/*Deve ser colocado o valor de litros para dar o resutado de lucro*/
		System.out.println();		
		System.out.print("Quantidade de litros abastecida de gasolina: ");
		produtos.quantidadeGasol = sc.nextInt();
		
		System.out.println();
		System.out.print("Quantidade de litros abastecida de etanol: ");
		produtos.quantidadeEtan = sc.nextInt();

		System.out.println();
		System.out.println("Lucro do dia: " + produtos);
		
		
		sc.close();
	}

}
