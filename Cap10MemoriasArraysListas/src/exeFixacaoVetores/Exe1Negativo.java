package exeFixacaoVetores;

import java.util.Locale;
import java.util.Scanner;

public class Exe1Negativo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voc vai digitar?");
		int n = sc.nextInt();
		int[] vetor = new int[n];

		for(int i=0; i<vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
			 }
		

		System.out.print("NUMEROS NEGATIVOS:");
	    for (int i=0; i<n; i++) {
	        if (vetor[i] < 0) {
	        	System.out.println( vetor[i]);
	        }
	    }
		sc.close();
	}

}
