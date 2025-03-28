import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example 1: Reading a string input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        // Example 2: Reading an integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        // Example 3: Reading a double input
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        System.out.println("Your height is " + height + " meters.");

        // Example 4: Reading multiple inputs
        System.out.print("Enter your first name and last name: ");
        String firstName = scanner.next();
        String lastName = scanner.next();
        System.out.println("Your full name is " + firstName + " " + lastName + ".");

        scanner.close();
    }
}
