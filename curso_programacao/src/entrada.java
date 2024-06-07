
import java.util.Scanner;

public class entrada {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);
        
        int numero;
        String agencia;
        char nomeCliente;
        double saldo;

        //Exibir as mensagens para o usuario
        System.out.println("---------PRECISAMOS CRIAR SUA CONTA!---------");
        System.out.println("Por favor, Digite o numero da agencia: ");
        agencia = sc.toString();
        sc.nextLine();
        System.out.println("Agora digite o NUMERO da conta do Usuario: ");
        numero = sc.nextInt();
        System.out.println("Digite seu nome: ");
        nomeCliente = sc.next().charAt(0);
        System.out.println("Saldo inicial: ");
        saldo = sc.nextDouble();
      
        //Obter pelo Scanner os valores digitados pelo terminal
        System.out.println("AGENCIA: " + agencia);
        System.out.println("NUMERO DA CONTA: " + numero);
        System.out.println("NOME DO USUARIO: " + nomeCliente);
        System.out.println("SALDO INICIAL: " + saldo);
        
        //Exibir a mensagem "Conta Criada"
        System.out.println("CONTA CRIADA COM SUCESSO!!");
    
    sc.close();
    }
}