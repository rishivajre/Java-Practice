import java.util.LinkedHashSet;

public class UsingLinkedHashSet {
    // ✅ Goal: Print unique characters from a string in the order they appear (remove duplicates)
    // Example: Input = "aabbccddab" → Output = "abcd"

    public static void main(String[] args) {
        String input = "aabbcdaabeeeegggfffioasdghadsih";
        // ✅ Using LinkedHashSet to maintain insertion order while ensuring uniqueness
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();        
        StringBuilder sb = new StringBuilder();// ✅ StringBuilder for efficient string concatenation

        // ✅ Traverse characters directly from the string
        for (char c : input.toCharArray()) {
            // Add to set if not already present, and build result string
            if (charSet.add(c)) {
                sb.append(c);  // Only append if char was added (i.e., it's unique)
            }
        }
        System.out.println("Unique Chars (as Set): " + charSet);   // Shows [a, b, c, d...]
        System.out.println("Unique Chars (as String): " + sb);     // Shows abcd...
    }
}
