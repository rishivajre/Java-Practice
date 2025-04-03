public class Fibbonacci {
    // Approach 1: Simple Recursion
    public static void printFibbonacci(int n) {
        for (int i=0; i<n; i++) {
            System.out.print(fib1(i) + " ");
        }
    }
    private static int fib1(int n) {
        if (n <= 1) return n;
        return fib1(n - 1) + fib1(n - 2);
    }

    public static void main(String[] args) {
        printFibbonacci(10);
    }
}
