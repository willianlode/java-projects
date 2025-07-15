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
    public void pesquisarPorAutor(String autor){
        List <Livro> listaResultado=new ArrayList<>();
        for(Livro livro:listaLivros){
            if(livro.getAutor().equals(autor)){
                listaResultado.add(livro);
            }
        }
        for(Livro livro:listaResultado){
            System.out.println(livro);
        }
    }
     
    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> listaResultado = new ArrayList<>();
        for (Livro livro : listaLivros) {
            if (livro.getAnoDePublicacao()<=anoFinal && livro.getAnoDePublicacao()>=anoInicial) {
                listaResultado.add(livro);
            }
        }
        for (Livro livro : listaResultado) {
            System.out.println(livro);
        }
    }
    public void pesquisarPorTitulo(String titulo){
        int i=0;
        Livro livroResultado = null;
        for(Livro livro:listaLivros){
            if(livro.getTitulo().equals(titulo)){
                livroResultado=new Livro(livro.getTitulo(), livro.getTitulo(), livro.getAnoDePublicacao());
                break;
            }
        }
        System.out.println(livroResultado);
    }

}
