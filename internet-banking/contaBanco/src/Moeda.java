import java.math.BigDecimal;
import java.text.NumberFormat;

public abstract class Moeda {

    public static String formataMoeda(double valor){
        NumberFormat formata=NumberFormat.getCurrencyInstance();
        BigDecimal bigDecimal=new BigDecimal(valor);
        String valorConvertido=formata.format(bigDecimal);
        return valorConvertido;
    }
}
