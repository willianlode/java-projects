import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao banco DIO! Precisaremos alguns dados para confirmar a abertura de sua conta.");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Por favor, digite o número da agência:");
        String numeroAgencia=scanner.next();
        System.out.println("Agora, digite o número da conta:");
        int numeroConta=scanner.nextInt();
        System.out.println("Por favor, nos informe seu nome completo");
        scanner.nextLine();
        String nomeCliente=scanner.nextLine();
        System.out.println("Por último, digite seu saldo, por favor!");
        float saldoCliente=scanner.nextFloat();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, numeroAgencia, numeroConta, saldoCliente);
        scanner.close();   
    }
}
