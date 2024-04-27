import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Por favor digite o numero da agencia:");
        String agencia = scan.nextLine();
        conta.setAgencia(agencia);

        System.out.println("Digite o numero da Conta:");
        int numero = scan.nextInt();
        conta.setNumero(numero);

        scan.nextLine();

        System.out.println("Digite seu nome:");
        String nome = scan.nextLine();
        conta.setNomeCliente(nome);

        System.out.println("Digite seu saldo:");
        double saldo = scan.nextDouble();
        conta.setSaldo(saldo);

        System.out.printf("\"Olá %s, obrigado por criar uma conta em " + "nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque\".", nome, agencia, numero, saldo);

        scan.close();
    }
}
