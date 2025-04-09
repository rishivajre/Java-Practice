public class TailRecursion {       // Tail Recursion 

    public static void printFibonacci3(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fib3(i, 0, 1) + " ");
        }
    }
    private static int fib3(int n, int a, int b) {
        if (n == 0) return a;
        return fib3(n - 1, b, a + b);
    }

    public static void main(String[] args) {
        printFibonacci3(10);
    }
    
} 