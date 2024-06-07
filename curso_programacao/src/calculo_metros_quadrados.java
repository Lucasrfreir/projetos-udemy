import java.util.Locale;
import java.util.Scanner;

public class calculo_metros_quadrados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//pode ser feito as declarações de variaveis antes.
		//mas fica mais demorado.
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n",  area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();
	}

}
