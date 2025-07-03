import java.text.NumberFormat;
import java.util.Locale;

public class Moeda {
    private String language=Locale.getDefault().getLanguage();
    private String country=Locale.getDefault().getCountry();
    public Moeda(){
    }
    public Moeda(String language, String country){
        this.language=language;
        this.country=country;
    }
    public String formataMoeda(double valor){
        NumberFormat formata=NumberFormat.getCurrencyInstance(Locale.of(language, country));
        return formata.format(valor);
    }
    public void setLocal(String lang,String countr){
        language=lang.toLowerCase();
        country=countr.toUpperCase();
    }
    public String getLocal(){
        return country;
    }
    public String getLanguage(){
        return language;
    }
}
