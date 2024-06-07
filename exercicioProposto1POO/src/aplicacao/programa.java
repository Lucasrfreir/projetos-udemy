package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.retangulo;

public class programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		retangulo retan = new retangulo();
		
		System.out.println("Entre com a largura e  altura do retangulo");
		retan.Altura = sc.nextDouble();
		retan.Largura = sc.nextDouble();
		
		System.out.printf("AREA: %.2f%n", retan.Area() );
		System.out.printf("Perimetro: %.2f%n", retan.Perimetro());
		System.out.printf("Diagonal: %.2f%n", retan.Diagonal());
		
		sc.close();
	}

}
