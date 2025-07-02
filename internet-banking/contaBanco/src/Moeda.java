import java.text.NumberFormat;

public abstract class Moeda {

    public static String formataMoeda(double valor){
        NumberFormat formata=NumberFormat.getCurrencyInstance();
        return formata.format(valor);
    }
}
