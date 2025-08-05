import java.util.LinkedHashMap;
import java.util.Map;

public class CharFreqLinkedHashMap {
    public static void main(String[] args) {

        String input = "Paper";
        // Convert the input to lowercase and then to a character array
        char[] inputArray = input.toLowerCase().toCharArray();

        // LinkedHashMap maintains insertion order
        // This helps in preserving the order of characters as they appear in the string
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        // Traverse each character and update its count in the map
        for (char character : inputArray) {
            freqMap.put(character, freqMap.getOrDefault(character, 0) + 1);
        }

        // Print the characters and their frequency in insertion order
        for (char c : freqMap.keySet()) {
            System.out.println(c + " => " + freqMap.get(c));
        }
    }
}
