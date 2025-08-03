import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.*;

public class CharFreqHashMap {
    public static void main(String[] args) {
        String input = "TNT_BOMB";
        char[] inputArray = input.toCharArray();

        HashMap<Character, Integer> freqMap = new HashMap<>(); //OR
        // Map<Character, Integer> freqMap = new LinkedHashMap<>(); // Maintains insertion order of characters.

        for (char character : inputArray) {
            freqMap.put(character, freqMap.getOrDefault(character, 0) + 1);
        }

        for (char c : freqMap.keySet()) {
            System.out.println(c + " " + freqMap.get(c));
        }
    }
}
        // HashMap to store frequency of each character
        // Key   = Character
        // Value = Frequency of occurrence

        // getOrDefault checks if character exists in map:
        // If yes → return its frequency; else → return 0

