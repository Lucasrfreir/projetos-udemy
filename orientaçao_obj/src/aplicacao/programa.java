package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.triangulo;

public class programa {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		triangulo x, y;
		x = new triangulo();
		y =  new triangulo();
		
		System.out.println("Entre com as medidas do triangulo x:  ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println(" Entre com as medidas do triangulo y:  ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areax = x.area();
		double areay = y.area();
				
		System.out.printf("Area do triangulo x : %.4f%n", areax);
		System.out.printf("Area do triangulo y : %.4f%n", areay);
		
		if(areax > areay) {
			System.out.println("Area mais larga: x");
			
		}
		else{
			System.out.println("Area mais Larga: y");
		}

		sc.close();
		
		
	}

}
