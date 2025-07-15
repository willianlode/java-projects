import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List <Livro> listaLivros;
    CatalogoLivros(){
        listaLivros=new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int ano){
        listaLivros.add(new Livro(titulo,autor,ano));
    }
    public List <Livro> pesquisarPorAutor(String autor){
        List <Livro> listaResultado=new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro livro : listaLivros) {
                if (livro.getAutor().equals(autor)) {
                    listaResultado.add(livro);
                }
            }
        }
        return listaResultado;
    }
     
    public List <Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> listaResultado = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro livro : listaLivros) {
                if (livro.getAnoDePublicacao() <= anoFinal && livro.getAnoDePublicacao() >= anoInicial) {
                    listaResultado.add(livro);
                }
            }
        }
        return listaResultado;
    }
    public Livro pesquisarPorTitulo(String titulo){

        Livro livroResultado = null;
        if (!listaLivros.isEmpty()) {
            for (Livro livro : listaLivros) {
                if (livro.getTitulo().equals(titulo)) {
                    livroResultado = new Livro(livro.getTitulo(), livro.getTitulo(), livro.getAnoDePublicacao());
                    break;
                }
            }
        }
        return livroResultado;
    }

}
