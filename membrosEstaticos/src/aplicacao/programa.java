package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import util.Calculo;

public class programa {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entre com o valor do raio: ");
		double raio = sc.nextDouble();
		
		double c = Calculo.circunferencia(raio);
		
		double v = Calculo.volume(raio);
		
		System.out.printf("circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", Calculo.PI);
		
		sc.close();

	}
}
