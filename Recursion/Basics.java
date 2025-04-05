public class Basics {
    public static void printNumbers(int n) {
        //Base Case:
        if (n==0) {
            return;
        } // Base Case: If n is 0, return from the function
        System.out.print(n + " "); // Print the current number

        // Recursive Case:
        printNumbers(n-1); // Recursive Case: Call the function with n-1
    }

    public static void main (String[] args) {
        int n = 9;
        printNumbers(n); // Call the function to print numbers from n to 1
    }
}
