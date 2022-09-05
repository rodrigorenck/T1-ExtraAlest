public class Fatorial {
    public static void main(String[] args) {
        System.out.println("Fatorial recursivo");
        System.out.println(fatorialRecursivo(5));
    }

    public static long fatorialRecursivo(int n)
    {
        if(n==0) return 1;
        else return n * fatorialRecursivo(n -1);
    }
}
