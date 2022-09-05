package listaslineares.listasencadeadas.simples;

public class TesteBugs2 {

    public static void main(String[] args) {
        ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada();

        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        lista.adicionar(40);
        lista.adicionar(50);
        lista.adicionar(60);

        System.out.println(lista);

        //removendo primeiro elemento
        lista.remover(10);
        System.out.println(lista);

        //removendo elemento no meio
        lista.remover(40);
        System.out.println(lista);

        //removendo o ultimo elemento
        lista.remover(60);
        System.out.println(lista);

        //removendo elemento que nao esta na lista
        lista.remover(50);
        System.out.println(lista);


    }
}
