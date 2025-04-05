public class FactorialRecursion {
    // Print factorial of a number n.
    public static void printFactorial(int n, int fact) {
        if(n==0) {
            System.out.println("Factorial of the given number is: " + fact);
            return;
        }

        fact *= n;
        printFactorial(n-1, fact);
    }

    public static void main(String[] args) {
        printFactorial(5, 01);
    }
}
