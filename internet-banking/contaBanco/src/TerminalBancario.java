public class TerminalBancario {
    public static void main(String[] args) throws Exception {
        System.out.println("\nBem-vindo ao Meu Banco!");
        Conta novaConta=new Conta(550);
        novaConta.pagaBoleto(125.25);
        novaConta.sacaDinheiro(250);
        novaConta.pagaBoleto(325);
    }
}
