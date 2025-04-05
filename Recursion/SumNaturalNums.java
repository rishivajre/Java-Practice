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

    public static void printSumNatural(int m, int sum) {
        // Base case: when m reaches 0, print the sum
        if (m == 0) {
            System.out.println("printSumNatural is: "+sum);
            return;
        }
    
        // Add m to the sum and recursively call with m-1
        sum += m;
        printSumNatural(m - 1, sum);
    }

    public static void main(String[] args) {
        // Example usage
        int n = 5; // Change this value to test with different numbers
        int sum = sumNatural(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

        // Example usage of printSumNatural
        int m = 5; // Change this value to test with different numbers
        printSumNatural(5, 0);
    }
}
