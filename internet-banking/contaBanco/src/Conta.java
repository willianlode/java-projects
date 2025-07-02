import java.util.Scanner;

public class Conta {
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
    public void consultaSaldo(){
        System.out.println("O seu saldo é " + saldo);
    }
    public void consultaCheque(){
        System.out.println("Você tem um cheque especial de " + chequeEspecial);
    }
    public void verificaCheque(){
        System.out.println("Você possui R$ " + this.saldoCheque + " disponíveis de um total de R$ " + this.chequeEspecial + " de cheque especial.");
    }
    public void pagaBoleto(double valorBoleto){
        if(valorBoleto<=this.saldo){
           this.saldo=this.saldo-valorBoleto; 
           System.out.println("Pagamento realizado! Saldo disponível: " + this.saldo);
        }else{
            System.out.println("Saldo insuficiente! Valor boleto:");
            System.out.println("R$ "+valorBoleto);
            consultaSaldo();
            System.out.println("Faltam R$ "+ (valorBoleto-this.saldo));
            verificaCheque();
            System.out.println("Deseja usar o cheque especial? *taxa de 20% aplicável");
            System.out.println("[y/n]?");
            Scanner scanner=new Scanner(System.in);
            String resposta=scanner.next();
            if(resposta.toLowerCase().equals("y")){
                this.saldoCheque=this.chequeEspecial-(valorBoleto-this.saldo);
                this.saldo=0;
                System.out.println("Pagamento realizado! Saldo disponível: " + this.saldo);
                System.out.println("Cheque especial disponível: " + this.saldoCheque);
                System.out.println("Taxa a ser cobrada: " + 0.2*(this.chequeEspecial-this.saldoCheque));
            }else if(resposta.toLowerCase().equals("n")){
                System.out.println("Pagamento não realizado.");
            }
            scanner.close();
        }  
    }
    public void sacaDinheiro(double valorSaque){
        if(valorSaque<=saldo){
            this.saldo=saldo-valorSaque;
            System.out.println("Pagamento realizado! Saldo disponível: " + this.saldo);
        }else{
            System.out.println("Saldo insuficiente! Valor saque:");
            System.out.println("R$ "+valorSaque);
            consultaSaldo();
            System.out.println("Faltam R$ "+ (valorSaque-this.saldo));
            verificaCheque();
            System.out.println("Deseja usar o cheque especial? *taxa de 20% aplicável");
            System.out.println("[y/n]?");
            Scanner scanner=new Scanner(System.in);
            String resposta=scanner.next();
            if(resposta.toLowerCase().equals("y")){
                this.saldoCheque=this.chequeEspecial-(valorSaque-this.saldo);
                this.saldo=0;
                System.out.println("Saque realizado! Saldo disponível: " + this.saldo);
                System.out.println("Cheque especial disponível: " + this.saldoCheque);
                System.out.println("Taxa a ser cobrada: " + 0.2*(this.chequeEspecial-this.saldoCheque));
            }else if(resposta.toLowerCase().equals("n")){
                System.out.println("Pagamento não realizado.");
            }
            scanner.close();
        }
    }
}
