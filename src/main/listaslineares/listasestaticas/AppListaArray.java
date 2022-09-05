package listasestaticas;

import java.util.List;

public class AppListaArray {
    public static void main(String[] args) {
        System.out.println("Demonstracao do ListArray");

        ListArray minhaLista = new ListArray(3);
        minhaLista.add(200);
        minhaLista.add(500);
        minhaLista.add(900);
        minhaLista.add(56);

        minhaLista.add(0, 666);

        System.out.println(minhaLista);
        System.out.println(minhaLista.size());

        System.out.println(minhaLista.get(3));






        /*
        ListArray lista = new ListArray();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.add(8);
        lista.add(10);
        lista.add(12);

        //lista.add(0, 1);

        System.out.println(lista);

        System.out.println("Elemento armazenado na "
                + "primeira posicao da lista: " + lista.get(0));

        /*
        System.out.println("Posição do 8: " + lista.indexOf(8));

        // Tentando remover o número 6
        boolean ok = lista.remove(6);
        System.out.println();
        if (ok)
            System.out.println("OK! Consegui remover!");
        else
            System.out.println("Elemento não existe");
        System.out.println(lista);

        // Invertendo a lista
        System.out.println();
        lista.reverse();
        System.out.println(lista);

        // Inserindo em ordem crescente
        System.out.println();
        System.out.println("Testando inserção em ordem crescente");
        ListArray lista2 = new ListArray();
        for (int i = 1; i < 20; i += 4)
            lista2.addIncreasingOrder(i);
        System.out.println();
        System.out.println(lista2);
        lista2.addIncreasingOrder(11);
        lista2.addIncreasingOrder(30);
        System.out.println(lista2);

        // Inserindo em ordem decrescente
        System.out.println();
        System.out.println("Testando inserção em ordem decrescente");
        ListArray lista3 = new ListArray();
        for (int i = 1; i < 20; i += 4)
            lista3.addDecreasingOrder(i);
        System.out.println();
        System.out.println(lista3);
        lista3.addDecreasingOrder(11);
        lista3.addDecreasingOrder(30);
        System.out.println(lista3);
        */
    }

}
