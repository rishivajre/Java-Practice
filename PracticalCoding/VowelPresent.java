import java.util.*;

public class VowelPresent {
    // Approach 1: Using loop and character checking
    public static boolean hasVowel(String str) {
        str = str.toLowerCase();
        for (int i=0; i<str.length(); i++) {
            char ch  = str.charAt(i);
            if (ch=='a' || ch=='e' ||ch=='i' || ch=='o' || ch=='u' ) {
                return true; // Vowel found
            }
        }
        return false; // No vowels found
    }

    // Approach 2: Using regex
    public static boolean hasVowelRegex(String str) {
        return str.toLowerCase().matches(".*[aeiou].*"); // Regex to check for vowels
    }

    // Approach 3: Using Set Intersection
    public static boolean hasVowelSet(String str) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        // return str.toLowerCase().chars()
        //         .mapToObj(c -> (char) c)
        //         .anyMatch(vowels::contains); ||OR||
        return str.toLowerCase().chars()
                .anyMatch(ch -> vowels.contains((char)ch));
    }
    public static void main(String[] args) {
        // Test cases for hasVowel method
        System.out.println(hasVowel("Hello")); // true
        System.out.println(hasVowel("Hll")); // false   
        System.out.println(hasVowel("")); // false
        System.out.println(hasVowel("AEIOU")); // true
        System.out.println(hasVowel("123")); // false
        System.out.println("------------------");

        // Test cases for hasVowelRegex method
        VowelPresent vp = new VowelPresent();
        //System.out.println(vp.hasVowelRegex("Hello")); // true
        System.out.println(hasVowel("HHLL")); // false
        System.out.println(hasVowelRegex(""));
        System.out.println(hasVowelRegex("AEIOU")); // true
        System.out.println(hasVowelRegex("123")); // false

        System.out.println("------------------");
        // Test cases for hasVowelSet method
        System.out.println(hasVowelSet("Hello")); // true
        System.out.println(hasVowelSet("Hll")); // false
        System.out.println(hasVowelSet("")); // false
        System.out.println(hasVowelSet("AEIOU")); // true
        System.out.println(hasVowelSet("123")); // false
        
    }
}
