import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número de sua agência: ");
        String agenciaCliente = sc.nextLine();

        System.out.println("Por favor, digite o número de sua conta: ");
        int contaCliente = Integer.parseInt(sc.nextLine());

        System.out.println("Digite seu saldo: ");
        double saldoCliente = Double.parseDouble(sc.nextLine());

        sc.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque. ", nomeCliente, agenciaCliente, contaCliente, saldoCliente );

    }
}
