import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharsUsingLinkedHashMap {
    public static void main(String[] args) {
        String input = "Paper";
        char[] inputArray = input.toLowerCase().toCharArray();

        Map<Character,Integer> frequencyMap = new LinkedHashMap<>();

        for (char c : inputArray) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c,0)+1);
        }

        for (char keys : frequencyMap.keySet()) {
            System.out.println(keys+" -> "+frequencyMap.get(keys));
        }
    }
}
