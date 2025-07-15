public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicacao;
    Livro(String titulo, String autor, int ano){
        this.titulo=titulo;
        this.autor=autor;
        this.anoDePublicacao=ano;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }
    @Override
    public String toString() {
        return titulo + ", " + autor + " [ " + anoDePublicacao + " ]";
    }
    
}
