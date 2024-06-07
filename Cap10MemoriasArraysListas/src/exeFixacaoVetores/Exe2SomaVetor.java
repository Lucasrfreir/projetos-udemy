package exeFixacaoVetores;

import java.util.Locale;
import java.util.Scanner;

public class Exe2SomaVetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar?");
		
		int n = sc.nextInt();
		int[] vetor = new int[n];

		for(int i=0; i<vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}

		System.out.print("Valores = ");
		for(int i=0; i<vetor.length; i++) {
			System.out.print(" " + vetor[i]);
		}
		
		int soma = 0;
		
		for(int i=0; i<vetor.length; i++) {
			soma += vetor[i];
		}
		System.out.println();
		System.out.println("Soma = " + soma);
		
		int media = soma/vetor.length;
		System.out.println("Media = " + media);
		
		sc.close();
	}

}
