package exeFixacaoVetores;

import java.util.Locale;
import java.util.Scanner;

import entidadeAltura.Dados;

public class exe3Altura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		
		int n= sc.nextInt();
		Dados[] vetor = new Dados[n];
		
		for(int i=0; i<vetor.length; i++) {
			sc.nextLine();
			System.out.println("Dados da " + i + "a pessoa:");
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade:");
			int idade = sc.nextInt();
			System.out.printf("Altura: ");
			double altura = sc.nextDouble();
			vetor[i] = new Dados(nome, idade, altura);	
			
		}
		
		double soma= 0.0;
			for(int i=0; i<vetor.length; i++) {
				soma += vetor[i].getAltura();
			}
		double averigSoma = soma/ vetor.length;
		System.out.printf("%.2f%n",averigSoma);

		double averigAltura = 0.0;
		for(int i=1; i<vetor.length; i++) {
			if(vetor[i].getIdade()<16 ) {
				averigAltura = ((vetor[i].getIdade() / n )*100);
				System.out.println(averigAltura);
				System.out.println(vetor[i].getNome());
			}
		}

			
		
		sc.close();
	}

}
