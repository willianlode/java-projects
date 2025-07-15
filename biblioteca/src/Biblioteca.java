public class Biblioteca {
    public static void main(String[] args) throws Exception {
        CatalogoLivros myLibrary=new CatalogoLivros();
        myLibrary.adicionarLivro("Harry potter e a pedra filosofal", "JK Rowling", 1996);
        myLibrary.adicionarLivro("Harry potter e a camera secreta", "JK Rowling", 1990);
        myLibrary.adicionarLivro("Harry potter e o prisioneiro de azkaban", "JK Rowling",2005);
        myLibrary.adicionarLivro("Harry potter e o cálice de fogo", "JK Rowling", 1992);
        myLibrary.adicionarLivro("O código da Vinci", "Dan Brown",1989);
        myLibrary.adicionarLivro("Anjos e demonios", "Dan Brown",2007);
        myLibrary.adicionarLivro("Fortaleza digital", "Dan Brown",2002);
        myLibrary.adicionarLivro("Anjos e demonios", "Pedro Pascal", 2006);
        System.out.println(myLibrary.pesquisarPorAutor("Dan Brown"));
    }
}
