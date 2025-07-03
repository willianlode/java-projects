import java.util.Scanner;

public class Conta{
    private double saldo;
    private double chequeEspecial;
    private double saldoCheque;

    public Conta(double saldo){
        this.saldo=saldo;
        if(saldo<=500){
            this.chequeEspecial=50.00;
        }else{
            this.chequeEspecial=0.5*saldo;
        }
        this.saldoCheque=this.chequeEspecial;
        System.out.println("Conta criada com sucesso!");
        consultaSaldo();
        consultaCheque();
    }
    Moeda moeda=new Moeda();
    public void consultaSaldo(){
        System.out.println("O seu saldo é " + moeda.formataMoeda(saldo));
    }
    public void consultaCheque(){
        System.out.println("Você tem um cheque especial de " + moeda.formataMoeda(chequeEspecial));
    }
    public void verificaCheque(){
        System.out.println("Você possui " + moeda.formataMoeda(saldoCheque) + " disponíveis de um total de " + moeda.formataMoeda(chequeEspecial) + " de cheque especial.");
    }
    public void pagaBoleto(double valorBoleto){
        if(valorBoleto<=saldo){
           saldo=saldo-valorBoleto; 
           System.out.println("Pagamento realizado! Saldo disponível: " + moeda.formataMoeda(saldo));
        }else{
            System.out.println("Saldo insuficiente! Valor boleto:");
            System.out.println(""+moeda.formataMoeda(valorBoleto));
            consultaSaldo();
            System.out.println("Faltam "+ moeda.formataMoeda(valorBoleto-saldo));
            verificaCheque();
            System.out.println("Deseja usar o cheque especial? *taxa de 20% aplicável");
            System.out.println("[y/n]?");
            Scanner scanner=new Scanner(System.in);
            String resposta=scanner.next();
            if(resposta.toLowerCase().equals("y")){
                saldoCheque=chequeEspecial-(valorBoleto-saldo);
                saldo=0;
                System.out.println("Pagamento realizado! Saldo disponível: " + moeda.formataMoeda(saldo));
                System.out.println("Cheque especial disponível: " + moeda.formataMoeda(saldoCheque));
                System.out.println("Taxa a ser cobrada: " + moeda.formataMoeda(0.2*(chequeEspecial-saldoCheque)));
            }else if(resposta.toLowerCase().equals("n")){
                System.out.println("Pagamento não realizado.");
            }else{
                System.out.println("Pagamento não realizado.");
                System.out.println("Opção inválida...");
            }
            scanner.close();
        }  
    }
    public void sacaDinheiro(double valorSaque){
        if(valorSaque<=saldo){
            this.saldo=saldo-valorSaque;
            System.out.println("Pagamento realizado! Saldo disponível: " + moeda.formataMoeda(saldo));
        }else{
            System.out.println("Saldo insuficiente! Valor saque:");
            System.out.println(""+moeda.formataMoeda(valorSaque));
            consultaSaldo();
            System.out.println("Faltam "+ moeda.formataMoeda(valorSaque-this.saldo));
            verificaCheque();
            System.out.println("Deseja usar o cheque especial? *taxa de 20% aplicável");
            System.out.println("[y/n]?");
            Scanner scanner=new Scanner(System.in);
            String resposta=scanner.next();
            if(resposta.toLowerCase().equals("y")){
                saldoCheque=chequeEspecial-(valorSaque-saldo);
                saldo=0;
                System.out.println("Saque realizado! Saldo disponível: " + moeda.formataMoeda(saldo));
                System.out.println("Cheque especial disponível: " + moeda.formataMoeda(saldoCheque));
                System.out.println("Taxa a ser cobrada: " + moeda.formataMoeda(0.2*(chequeEspecial-saldoCheque)));
            }else if(resposta.toLowerCase().equals("n")){
                System.out.println("Pagamento não realizado.");
            }else{
                System.out.println("Pagamento não realizado.");
                System.out.println("Opção inválida...");
            }
            scanner.close();
        }
    }
    public void depositaDinheiro(double valorDeposito){
        if(saldoCheque<chequeEspecial){
            saldo=saldo+valorDeposito-(chequeEspecial-saldoCheque)*1.2;
        } else{
            saldo=saldo+valorDeposito;
        }
        System.out.println(""+ moeda.formataMoeda(valorDeposito) +" Depositado com sucesso! Seu saldo é " + moeda.formataMoeda(this.saldo));
    }
}
