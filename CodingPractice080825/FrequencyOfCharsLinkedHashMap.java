import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharsLinkedHashMap {

    public static void main(String[] args) {
        String input = "Pappi";
        char[] inputArray = input.toLowerCase().toCharArray();

        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        for (char c : inputArray) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0)+1);
        }

        for (char c : frequencyMap.keySet()) {
            System.out.println(c + " => " + frequencyMap.get(c));
        }
    }
}