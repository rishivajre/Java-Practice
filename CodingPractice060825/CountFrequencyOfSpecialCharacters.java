import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfSpecialCharacters {
    public static void main(String[] args) {
        String input = " sdfja4h3t34080*TU$E(E)$()";

        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)){
                freqMap.put(c, freqMap.getOrDefault(c,0)+1);
            }
        } System.out.println(freqMap.toString()); // or

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
