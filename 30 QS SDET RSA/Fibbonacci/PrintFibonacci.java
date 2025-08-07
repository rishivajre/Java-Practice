import java.util.Scanner;

public class PrintFibonacci {
    /*
     * As we know Fibonacci series is a series of numbers in which each number is
     * the sum of the two preceding numbers.
     * 
     * For writing a Java Program, first we declare an array and assign the values 0
     * and 1 to the indexes 0 and 1 of the defined array.
     * Then we write the logic to get the values of all the indexes of the total
     * Fibonacci series length.
     * The Fibonacci sequence is defined by the formula F(n) = F(n-1) + F(n-2), where F(n) represents 
        the nth term in the sequence. The sequence starts with 0 and 1, so F(0) = 0 and F(1) = 1. 
     * Each subsequent number is the sum of the two preceding numbers. 
     */

    public static void main(String[] args) {
        int fibLength;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num upto which u want Fib series");
        fibLength = sc.nextInt();

        int num[] = new int[fibLength];
        num[0] = 0;
        num[1] = 1;

        for (int i=2; i<=fibLength-1; i++){
            num[i] = num[i-1] + num[i-2]; // F(n) = F(n-1) + F(n-2)
        }

        for (int i : num) {
            System.out.print(i + " ");
        }
    }
}
