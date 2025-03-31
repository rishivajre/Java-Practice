import java.util.*;

public class checkVowelsHashSet {
    // Optimized Approach: Using HashSet for Fast Lookups

    public static boolean containsVowel(String str){
        Set<Character> vowels = new HashSet<>();
        for (char v : "aeiou".toCharArray()){
            vowels.add(v); // Add each vowel to the HashSet
        }

        for (char ch : str.toLowerCase().toCharArray()){
            if (vowels.contains(ch)){
                return true; // If the character is a vowel, return true
            }
        } return false; // If no vowels are found, return false
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
