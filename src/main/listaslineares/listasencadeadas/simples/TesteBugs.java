package listaslineares.listasencadeadas.simples;

public class TesteBugs {

    public static void main(String[] args) {
        ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada();

        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);

        System.out.println(lista);

        lista.adicionar(0, 100);

        System.out.println(lista);

        int posicao = lista.retornarPosicao(10);
        System.out.println(posicao);

        lista.remover(100);
        System.out.println(lista);

        lista.remover(20);
        System.out.println(lista);

        lista.adicionar(10000);
        lista.adicionar(150);
        System.out.println(lista);

        lista.remover(150);
        System.out.println(lista);


    }
}
