import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        String agencia, nomeCliente; int numeroConta; double saldoConta;
        Scanner sc = new Scanner(System.in);

        // Solicitando e recebendo os dados

        System.out.println("Informe  Nome do Cliente:\n");
        nomeCliente = sc.nextLine();
        System.out.println("Informe Agência:\n");
        agencia = sc.nextLine();
        System.out.println("Informe Número da Conta:\n");
        numeroConta = sc.nextInt();
        System.out.println("Informe Saldo da Conta:\n");
        saldoConta = sc.nextDouble();


        // resuldado

        System.out.println("------ Banco Dio ------\n");
        System.out.println("------ Dados Cadastrados ------\n");
        System.out.println("Nome: "+nomeCliente+"\n");
        System.out.println("Agência: "+agencia+"\n");
        System.out.println("N° da Conta: "+numeroConta+"\n");
        System.out.printf("Saldo: "+saldoConta+"\n");









    }
}