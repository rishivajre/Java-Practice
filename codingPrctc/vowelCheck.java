import java.util.regex.Pattern;

public class vowelCheck {
    // Most Optimized Approach: Using Regular Expression (Pattern.matcher)
    public static boolean containsVowel (String str){
        
     return Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE).matcher(str).find();
        // Check if the string contains any vowels (case insensitive)
        // Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE) creates a pattern that matches any vowel
        // matcher(str).find() checks if the pattern is found in the string
        // This is a more optimized approach than using a loop to check each character
    }

    public static void main(String[] args){
        System.out.println(containsVowel("Hello")); // Output: true
        System.out.println(containsVowel("Hll")); // Output: false
        System.out.println(containsVowel("aeiou")); // Output: true
        System.out.println(containsVowel("AEIOU")); // Output: true
        System.out.println(containsVowel("12345")); // Output: false
        System.out.println(containsVowel("")); // Output: false
    }
}
