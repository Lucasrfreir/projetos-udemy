import java.util.Scanner;

public class while_exercicio_proposto3 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int Alcool = 0;
	int Gasolina = 0;
	int Disel = 0;
	
	int tipo = sc.nextInt();
	
	while( tipo != 4) {
		if (tipo == 1) {
			Alcool = Alcool + 1;
		}
		else if ( tipo == 2) {
			Gasolina = Gasolina + 1;
		}
		else if( tipo == 3) {
			Disel = Disel + 1;
		}
		tipo = sc.nextInt();
	}
	
	System.out.println("MUITO OBRIGADO!");
	System.out.println("Alcool; " + Alcool);
	System.out.println("Gasolina; " + Gasolina);
	System.out.println("Disel; " + Disel);

	sc.close();
	}

}
