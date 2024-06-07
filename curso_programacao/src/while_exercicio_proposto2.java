import java.util.Scanner;

public class while_exercicio_proposto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			
			if ( x > 0 && y > 0 ) {
			System.out.println("Primeiro2");	
			}
			else if(x < 0 && y > 0 ){
				System.out.println("Segundo");
			}
			else if(x < 0 && y < 0){
				System.out.println("Terceiro");
			}
			else {
				System.out.println("Quarta");
			}

			x = sc.nextInt();

			y =sc.nextInt();
		}
		
		
		sc.close();
	}

}
