public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ListaTarefas lista=new ListaTarefas();
        lista.adicionarTarifa("Tarefa 1");
        lista.adicionarTarifa("Tarefa 13");
        lista.adicionarTarifa("Tarefa 15");
        lista.obterDescricoesTarefas();
    }
}
