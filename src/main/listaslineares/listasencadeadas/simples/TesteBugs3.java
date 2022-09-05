package listaslineares.listasencadeadas.simples;

public class TesteBugs3 {

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
        lista.remover(60);
        System.out.println(lista);
    }
}
