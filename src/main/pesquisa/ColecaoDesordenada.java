public class ColecaoDesordenada {
    public static void main(String[] args) {
        int[] colecao = {5, 7, 8, 10, 2, 0, 1, 3};

        System.out.println(pesquisar(3, colecao));

    }

    public static boolean pesquisar(int valor, int[] colecao)
    {
        //Pior caso: elemento não existe ou está no final.
        for(int i=0; i<colecao.length; i++)
        {
            if(colecao[i]==valor) {
                System.out.println("Achou na tentativa " + (i+1));
                return true;
            }
            System.out.println("Tentativa " + (i+1) + " nao achou.");
        }
        return false;
    }
}
