public class TerminalBancario {
    public static void main(String[] args) throws Exception {
        System.out.println("\nBem-vindo ao Meu Banco!");
        Conta novaConta=new Conta(550);
        novaConta.pagaBoleto(125.28);
        novaConta.sacaDinheiro(250);
        novaConta.pagaBoleto(325);
        novaConta.depositaDinheiro(275.35);
    }
}
