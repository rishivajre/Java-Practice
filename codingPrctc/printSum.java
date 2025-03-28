import java.util.Scanner;

public class printSum {
 // Write a function to print the sum of all odd numbers from 1 to n
    public static void printSum(int n){
        int sum = 0;

        System.out.print("Odd number: ");
        for (int i=1; i<=n; i++){
            if(i % 2 != 0){
                System.out.print(i + " "); // Print the odd number
                sum = sum + i;
            }
        }
        System.out.println();
        System.out.println("Sum of odd numbers: " + sum);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        //sc.close();
        printSum(n);
    }   
}