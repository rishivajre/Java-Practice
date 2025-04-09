public class FibonacciRec {         //Simple Recursion

    //print Fib
    public static void printFib(int n) {
        for (int i=0; i<n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
    //Calculate Fib
    private static int fib(int n) {
        if (n<=1) {
        return n; // for 0, 1
        }
        return fib(n-1) + fib (n-2);
    }

    public static void main (String[] args) {
        printFib(10);
    }
}
