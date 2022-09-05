public class Mensagem {
    public static void main(String[] args) {
        System.out.println("Escrever mensagem N vezes na tela de forma recursiva");
        escrever("Oi!!!", 5);
    }

    public static void escrever(String msg, int n)
    {
        if(n>=1) {
            System.out.println(msg);
            escrever(msg, n-1);
        }
    }
}
