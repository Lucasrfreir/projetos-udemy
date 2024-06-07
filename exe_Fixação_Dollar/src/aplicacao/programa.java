package aplicacao;

import ConversordeMoeda.Conversor;
import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conversor conversor = new Conversor();
		
		System.out.println("Qual o valor do dollar? ");
		conversor.valor = sc.nextDouble();
		
		System.out.println("Quanto vai ser comprado?");
		conversor.quantidade = sc.nextDouble();
		
		System.out.printf("Valor convertido: " + conversor.Calculo());
		
		
		
		sc.close();

	}

}
