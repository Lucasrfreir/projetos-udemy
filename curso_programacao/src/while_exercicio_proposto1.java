import java.util.Scanner;

public class while_exercicio_proposto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Acesso Negado!");
			senha = sc.nextInt();
		}
					
		System.out.println("Acesso permitido!");
		
		
		sc.close();
	}

}
