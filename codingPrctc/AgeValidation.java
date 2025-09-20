import java.util.Scanner;

public class AgeValidation {
    // Corrected the method name and simplified the logic.
    // Voting eligibility is typically 18 or older.
    public static boolean isEligible(int age){
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if (isEligible(age)){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
        scanner.close();
    }
}
