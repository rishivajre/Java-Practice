import java.util.HashMap;
import java.util.Map;

public class FrequencyOfSpecialChars {
    public static void main(String[] args) {
        String input = "&^%DS*&FDSKJ";
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0)+1);
            }
        } 
        System.out.println(frequencyMap.toString()); // OR

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
