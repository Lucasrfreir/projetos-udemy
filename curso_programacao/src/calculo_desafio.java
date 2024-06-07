import java.util.Scanner;

public class calculo_desafio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int soma;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.println("soma = " + soma);
		
		sc.close();

	}

}
