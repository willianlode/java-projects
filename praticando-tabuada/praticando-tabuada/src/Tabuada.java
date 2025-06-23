import java.util.Random;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        System.out.println("\nBem-vindo ao jogo da tabuada! Digite q para sair");
        Random random= new Random();
        String resultString="";
        Scanner scanner = new Scanner(System.in);
        int result=0;
        boolean isRight;
        boolean isText;
        int y;
        int x;
        boolean play=true;
        while(play){
            y=random.nextInt(15);
            x=random.nextInt(15);
            System.out.printf("Quanto é %d x %d? \n", x, y);
            
            do{
                resultString=scanner.next();
                if(resultString.equals("q") || resultString.equals("Q")){
                    System.out.println("Volte sempre!");
                    play=false;
                    break;
                }
                 try {
                    result=Integer.parseInt(resultString);
                    isText=false;
                } catch (Exception e) {
                    isText=true;
                    System.out.println("Digite um número válido...");
                    System.out.printf("Quanto é %d x %d? \n", x, y);
                } 
            }while(isText);
            if(play){
                isRight=result==x*y;
                System.out.printf(isRight? "Correto\n":"Errado, a resposta é %d\n",x*y);
            }
            
        }
        scanner.close();
        
    }

}
