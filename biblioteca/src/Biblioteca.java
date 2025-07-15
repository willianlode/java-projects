public class Biblioteca {
    public static void main(String[] args) throws Exception {
        CatalogoLivros myLibrary=new CatalogoLivros();
        myLibrary.adicionarLivro("Harry potter e a pedra filosofal", "JK Rowling", 1996);
        myLibrary.adicionarLivro("Harry potter e a camera secreta", "JK Rowling", 1998);
        myLibrary.adicionarLivro("Harry potter e o prisioneiro de azkaban", "JK Rowling",2004);
        myLibrary.adicionarLivro("Harry potter e o cálice de fogo", "JK Rowling", 2008);
        myLibrary.adicionarLivro("O código da Vinci", "Dan Brown",2004);
        myLibrary.adicionarLivro("Anjos e demonios", "Dan Brown",2007);
        myLibrary.adicionarLivro("Fortaleza digital", "Dan Brown",2010);
        myLibrary.adicionarLivro("Anjos e demonios", "Pedro Pascal", 2007);
        System.out.println(myLibrary.pesquisarPorAutor("Dan Brown"));
    }
}
