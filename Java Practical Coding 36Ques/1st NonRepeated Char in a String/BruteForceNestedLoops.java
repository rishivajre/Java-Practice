import java.util.Scanner;

public class BruteForceNestedLoops {
    public static Character firstNonRepeated(String s) {
        int n = s.length();
        for (int i=0; i<n; i++) {
            int count =0;
            for (int j=0; j<n; j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    count++;
                }
            }if (count == 1) {
                return s.charAt(i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String input = sc.nextLine();
        Character result = firstNonRepeated(input);
        if (result != null) System.out.println("First non-repeated char: "+ result);
        else System.out.println("No uniques char found");
        sc.close();
    }
}
