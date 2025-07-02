import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class Conta {
    private double saldo;
    private double chequeEspecial;
    private double saldoCheque;

    public String formataMoeda(double valor){
        NumberFormat formata=NumberFormat.getCurrencyInstance();
        BigDecimal bigDecimal=new BigDecimal(valor);
        String valorConvertido=formata.format(bigDecimal);
        return valorConvertido;
    }

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
        System.out.println("O seu saldo é " + formataMoeda(saldo));
    }
    public void consultaCheque(){
        System.out.println("Você tem um cheque especial de " + formataMoeda(chequeEspecial));
    }
    public void verificaCheque(){
        System.out.println("Você possui " + formataMoeda(saldoCheque) + " disponíveis de um total de " + formataMoeda(chequeEspecial) + " de cheque especial.");
    }
    public void pagaBoleto(double valorBoleto){
        if(valorBoleto<=saldo){
           saldo=saldo-valorBoleto; 
           System.out.println("Pagamento realizado! Saldo disponível: " + formataMoeda(saldo));
        }else{
            System.out.println("Saldo insuficiente! Valor boleto:");
            System.out.println(""+formataMoeda(valorBoleto));
            consultaSaldo();
            System.out.println("Faltam "+ formataMoeda(valorBoleto-saldo));
            verificaCheque();
            System.out.println("Deseja usar o cheque especial? *taxa de 20% aplicável");
            System.out.println("[y/n]?");
            Scanner scanner=new Scanner(System.in);
            String resposta=scanner.next();
            if(resposta.toLowerCase().equals("y")){
                saldoCheque=chequeEspecial-(valorBoleto-saldo);
                saldo=0;
                System.out.println("Pagamento realizado! Saldo disponível: " + formataMoeda(saldo));
                System.out.println("Cheque especial disponível: " + formataMoeda(saldoCheque));
                System.out.println("Taxa a ser cobrada: " + formataMoeda(0.2*(chequeEspecial-saldoCheque)));
            }else if(resposta.toLowerCase().equals("n")){
                System.out.println("Pagamento não realizado.");
            }
            scanner.close();
        }  
    }
    public void sacaDinheiro(double valorSaque){
        if(valorSaque<=saldo){
            this.saldo=saldo-valorSaque;
            System.out.println("Pagamento realizado! Saldo disponível: " + formataMoeda(saldo));
        }else{
            System.out.println("Saldo insuficiente! Valor saque:");
            System.out.println(""+formataMoeda(valorSaque));
            consultaSaldo();
            System.out.println("Faltam "+ formataMoeda(valorSaque-this.saldo));
            verificaCheque();
            System.out.println("Deseja usar o cheque especial? *taxa de 20% aplicável");
            System.out.println("[y/n]?");
            Scanner scanner=new Scanner(System.in);
            String resposta=scanner.next();
            if(resposta.toLowerCase().equals("y")){
                saldoCheque=chequeEspecial-(valorSaque-saldo);
                saldo=0;
                System.out.println("Saque realizado! Saldo disponível: " + formataMoeda(saldo));
                System.out.println("Cheque especial disponível: " + formataMoeda(saldoCheque));
                System.out.println("Taxa a ser cobrada: " + formataMoeda(0.2*(chequeEspecial-saldoCheque)));
            }else if(resposta.toLowerCase().equals("n")){
                System.out.println("Pagamento não realizado.");
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
        System.out.println(""+ formataMoeda(valorDeposito) +" Depositado com sucesso! Seu saldo é " + formataMoeda(this.saldo));
    }
}
