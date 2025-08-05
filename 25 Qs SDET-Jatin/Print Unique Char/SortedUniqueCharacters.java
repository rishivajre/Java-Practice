import java.util.Set;
import java.util.TreeSet;

public class SortedUniqueCharacters {
    // ✅ Print unique characters from the input string in alphabetical order
    public static void main(String[] args) {
        String input = "aabbcdaabeeeegggfffioasdghadsih";

        Set<Character> charSet = new TreeSet<>();
        StringBuilder sb = new StringBuilder();

        // ✅ Single loop: add to set & builder only if first occurrence
        for (char c : input.toCharArray()) {
            if (charSet.add(c)) {  // add() returns true if c was not already in the set
                sb.append(c);      // Append to StringBuilder only for the first time
            }
        }

        // ✅ Print sorted characters
        System.out.println("Unique Sorted Chars (Set): " + charSet);
        System.out.println("Unique Sorted Chars (String): " + sb.toString());
    }
}
