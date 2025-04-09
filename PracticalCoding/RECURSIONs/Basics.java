public class Basics {
    //Print numbers from 1 to n using recursion
    public static void printNumbers(int n) {
        if (n > 10) { // Base Case: If n is greater than 10, return from the function
            return;
        }
        System.out.print(n + " "); // Print the current number
        printNumbers(n+1); // Recursive Case: Call the function with n+1
    }
    //Print numbers from n to 1 using recursion (reversed order)
    public static void printNumbersReverse(int m) {
        //Base Case:
        if (m == 0) {
            return;
        } // Base Case: If n is 0, return from the function
        System.out.print(m + " "); // Print the current number

        // Recursive Case:
        printNumbersReverse(m-1); // Recursive Case: Call the function with n-1
    }

    public static void main (String[] args) {
        int n = 1;
        int m = 10;
        printNumbersReverse(m); // Call the function to print numbers from n to 1
        System.out.println();
        printNumbers(n); // Call the function to print numbers from 1 to n

    }
}
