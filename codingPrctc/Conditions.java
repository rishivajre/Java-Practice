import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();

        if (age >= 18) {
            System.out.println(("You are eligible to vote"));
        }else{
            System.out.println("You are not eligible to vote");
        }
        sc.close();
    }
}
