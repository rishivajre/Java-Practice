import java.util.Scanner;

public class UsingLoop {
    public static boolean checkVowel(String str) {
        //convert string to lowercase for case-sensitive check
        str = str.toLowerCase();

        //iterate through each character
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            // Check if character is a Vowel
            if (ch == 'a' || ch == 'e' ||ch == 'i'||ch == 'o' ||ch == 'u') {
                return true;
            }
        }
        //No vowel found
        return false;
    }

    public static void main (String[] args) {
        //Test 
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] testCases = line.split("\\s+"); //Split into words using space (\\s+)
        //String[] testCases = {"hello", "sky", "Tesla"};
        for (String test : testCases){
            System.out.println("Input: " +test+" -> Vowel Present: " + checkVowel(test));
        }

        sc.close();
    }-+
    
}
