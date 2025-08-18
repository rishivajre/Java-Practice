import java.security.KeyStore.Entry;
import java.util.*;

public class FrequencyOfSpecialChars {
    public static void main(String[] args) {
        String input = "@W#$$%UHFKDoopds..";

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey()+ " => " + entry.getValue());
        }
    }
}
