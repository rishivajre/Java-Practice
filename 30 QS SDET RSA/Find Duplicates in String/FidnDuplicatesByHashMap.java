import java.util.HashMap;
// Find the duplicates in a Given string and count their occurrence
public class FidnDuplicatesByHashMap {
    static void duplicateChars(String inputString) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : inputString.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1); // one-liner counting
        }

        // Print duplicates directly
        charCount.forEach((ch, count) -> {
            if (count > 1) {
                System.out.println(ch + " --> " + count);
            }
        });
    }

    public static void main(String[] args) {
        duplicateChars("rahulshettyacademy");
    }
}
