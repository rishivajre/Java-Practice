import java.util.Scanner;

public class AgeValidation {
    public static boolean isElligible(int age){
        if (age>18){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if (isElligible(age)){
            System.out.println("You are Elligible to vote");
        }
        else{
            System.out.println("You are not Elligible to vote");
        }
        scanner.close();
    }
}
