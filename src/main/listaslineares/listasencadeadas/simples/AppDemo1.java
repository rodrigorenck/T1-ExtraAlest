package listaslineares.listasencadeadas.simples;

public class AppDemo1 {
    public static void main(String[] args) {
        ListaSimplesmenteEncadeada ls1 = new ListaSimplesmenteEncadeada();
        ls1.adicionar(4);
        ls1.adicionar(10);
        ls1.adicionar(99);
        ls1.adicionar(1, 100);
        ls1.adicionar(0, -5); //insere na primeira posicao
        ls1.adicionar(4, 102);
        System.out.println(ls1.toString());
        System.out.println(ls1.tamanho());

        int i = ls1.retornarPosicao(100);
        System.out.println(i);
        System.out.println(ls1.retornarPosicao(-5));
        System.out.println(ls1.retornarPosicao(102));
        System.out.println(ls1.retornarPosicao(555));
        System.out.println(ls1.contem(55));

    }
}
