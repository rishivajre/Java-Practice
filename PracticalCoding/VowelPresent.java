public class VowelPresent {
    // Approach 1: Using loop and character checking
    public static boolean hasVowel(String str) {
        str = str.toLowerCase();
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return true; // Vowel found
            }
        }   
        return false; // No vowel found
    }

    // Approach 2: Using regex
    public static boolean hasVowelRegex(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }
    public static void main(String[] args) {
        // Test cases for hasVowel method
        System.out.println(hasVowel("Hello")); // true
        System.out.println(hasVowel("Hll")); // false   
        System.out.println(hasVowel("")); // false
        System.out.println(hasVowel("AEIOU")); // true
        System.out.println(hasVowel("123")); // false
        System.out.println("------------");
        // Test cases for hasVowelRegex method
        VowelPresent vp = new VowelPresent();
        System.out.println(vp.hasVowelRegex("Hello")); // true
        System.out.println(hasVowel("HHLL")); // false
        System.out.println(hasVowelRegex(""));
    }
}
