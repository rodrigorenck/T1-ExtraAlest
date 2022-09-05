public class Fibonacci {
    static int n1 = 0, n2 = 1, n3 =0;
    public static void main(String[] args) {
        System.out.println("Fibonacci recursivo");
        int n = 20;
        System.out.print(n1 + " " + n2);
        printFibonacci(n -2);
    }

    public static void printFibonacci(int n)
    {
        if(n>0) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacci(n - 1);
        }
    }

}
