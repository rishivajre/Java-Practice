import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyCharsInString {
    public static void main(String[] args) {
        String input = "Pappu";
        char[] inputArray = input.toLowerCase().toCharArray();

        Map<Character, Integer> freqMap = new LinkedHashMap<>();
        for (char c : inputArray) {
            freqMap.put(c, freqMap.getOrDefault(c, 0)+1);
        }
        for (char c : freqMap.keySet()) {
            System.out.println(c + " => " + freqMap.get(c));
        }
    }
}
