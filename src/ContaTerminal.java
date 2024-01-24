import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        String nomeCliente;
        int numero;
        String agencia;
        float saldo;

       // TODO: Conhecer e importar a classe scanner
        Scanner sc = new Scanner(System.in);

        //TODO: Exibir as mensagens ao usuario
        // TODO: obter os valores utilizando o scanner
        System.out.println("Informe o nome do cliente: ");
        nomeCliente = sc.nextLine();
        System.out.println("Informe o número da conta: ");
        numero = sc.nextInt();
        System.out.println("Informe a agencia da conta: ");
        agencia = sc.next();
        System.out.println("Informe o saldo da conta: ");
        saldo = sc.nextFloat();

        // TODO: exibir a mensagem formatada

        System.out.println("Olá " + nomeCliente.toUpperCase() +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                " conta " + numero +
                " e seu saldo " + saldo +
                " já está disponível para saque.");

    }
}