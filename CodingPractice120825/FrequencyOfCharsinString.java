import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharsinString {
    public static void main(String[] args) {
        String input = "Papper";

        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        for (char c : input.toLowerCase().toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (char c : freqMap.keySet()) {
            System.out.println(c + " => " + freqMap.get(c));
        }
    }
}
