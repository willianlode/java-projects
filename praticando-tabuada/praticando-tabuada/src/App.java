import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        System.out.println("\nBem-vindo ao jogo da tabuada! Digite q para sair");
        Random random= new Random();
        String resultString="";
        Scanner scanner = new Scanner(System.in);
        while(true){
            int y=random.nextInt(15);
            int x=random.nextInt(15);
            System.out.printf("Quanto é %d x %d? \n", x, y);
            resultString=scanner.next();
            if(resultString.equals("q") || resultString.equals("Q")){
                System.out.println("Volte sempre!");
                break;
            }
            try {
                int result=Integer.parseInt(resultString);
                boolean isRight=result==x*y;
                System.out.printf(isRight? "Correto\n":"Errado, a resposta é %d\n",x*y);
            } catch (Exception e) {
                System.out.println("Digite um número válido...");
                System.out.printf("Quanto é %d x %d? \n", x, y);
                resultString=scanner.next();
                int result=Integer.parseInt(resultString);
                boolean isRight=result==x*y;
                System.out.printf(isRight? "Correto\n":"Errado, a resposta é %d\n",x*y);
            }
            
            
        }
        scanner.close();
        
    }

}
