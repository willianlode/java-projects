import java.text.NumberFormat;
import java.util.Locale;

public class Moeda {
    private static String language=Locale.getDefault().getLanguage();
    private static String country=Locale.getDefault().getCountry();
    public static String formataMoeda(double valor){
        NumberFormat formata=NumberFormat.getCurrencyInstance(Locale.of(language, country));
        return formata.format(valor);
    }
    public static void setLocal(String lang,String countr){
        language=lang.toLowerCase();
        country=countr.toUpperCase();
    }
    public static String getLocal(){
        return country;
    }
    public static String getLanguage(){
        return language;
    }
}
