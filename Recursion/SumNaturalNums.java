public class SumNaturalNums {
    // Function to calculate the sum of first n natural numbers using recursion
    public static int sumNatural(int n) {
        // Base case: if n is 0, return 0
        if (n == 0) {
            return 0;
        }
        // Recursive case: sum of n and the sum of first (n-1) natural numbers
        return n + sumNatural(n - 1);
    }

    public static void main(String[] args) {
        // Example usage
        int n = 5; // Change this value to test with different numbers
        int sum = sumNatural(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
