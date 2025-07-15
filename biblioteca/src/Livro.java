public class Livro implements Comparable <Livro> {
    private String titulo;
    private String autor;
    private int anoDePublicacao;
    Livro(String titulo, String autor, int ano){
        this.titulo=titulo;
        this.autor=autor;
        this.anoDePublicacao=ano;
    }
    @Override
    public int compareTo(Livro l) {
        return Integer.compare(anoDePublicacao, l.getAnoDePublicacao());
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
