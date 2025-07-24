import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class VowelPresentPr {

    // Using loop
    public static boolean hasVowel(String str) {
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'e' || ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u') {
                return true;
            }
        }
        return false;
    }

    // Using HashSet
    public static boolean hasVowelcharSet(String str) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        return str.toLowerCase().chars()
                .anyMatch(ch -> vowels.contains((char) ch));
    }

    //using Regex
        public static boolean hasVowelRegex(String str) {
            return str.toLowerCase().matches(".*[aieou].*");
        }

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(hasVowel(str));
    }
}
