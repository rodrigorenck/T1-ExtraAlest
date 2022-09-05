public class ColecaoOrdenada {
    public static void main(String[] args) {
        int[] colecao = {0, 1, 2, 3, 5, 7, 8, 10};
        int valor = 4;
        System.out.println("Pesquisando o valor " + valor);
        System.out.println(pesquisarColecaoOrdenada(valor, colecao));

    }

    public static boolean pesquisarColecaoOrdenada(int valor, int[] colecao)
    {
        //Igual a colecao Desordenada
        for(int i=0; i<colecao.length; i++)
        {
            if(colecao[i]==valor) {
                System.out.println("Achou na tentativa " + (i+1));
                return true;
            }
            if(colecao[i]>valor){
                System.out.println("Valor nao esta na lista, pois ja achei um maior que ele. Nao preciso mais procurar.");
                return false;
            }
            System.out.println("Tentativa " + (i+1) + " nao achou.");
        }
        return false;
    }
}
