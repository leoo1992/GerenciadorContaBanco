import java.util.Scanner;

// desafio de codigo da DIO
//desafio disponivel em : https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe

public class ContaNoTerminal {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("    Bem vinvo ao BANCO X    ");
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero da sua conta: ");
        int numeroConta = ler.nextInt();
        System.out.println("Digite o numero da sua agencia: ");
        String agencia = ler.next();
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = ler.next();
        System.out.println("Digite o saldo da conta: ");
        double saldo = ler.nextDouble();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
