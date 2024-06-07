import java.util.Locale;
import java.util.Scanner;

public class while_exercico_proposto2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int soma = 0;
		int conta = 0;
		
		while (idade >= 0) {
			soma = soma + idade;
			conta = conta + 1;
			idade = sc.nextInt();
		}
		
		if ( conta > 0) {
			double media =  (double) soma / conta;
			System.out.printf("%.2f%n", media);
		}
		else {
			System.out.println("Impossivel calcular");
		}
		
		sc.close();
	}

}
