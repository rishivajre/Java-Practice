import java.util.HashMap;
import java.util.Map;

public class CountFreqOfSpChars {
    public static void main(String[] args) {
        String input = "@ sdfsldfj&^&*%&*";

        HashMap<Character, Integer> spCharMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            // check if not a Letter, Digit or White Space
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                spCharMap.put(c, spCharMap.getOrDefault(c, 0)+1);
            }
        } System.out.println("Frequency of special characters:");
        System.out.println("Direct Printing\n"+spCharMap.toString()); // OR
        for (Map.Entry<Character,Integer> entry : spCharMap.entrySet()) {
            System.out.println(entry.getKey() 
            + " => " + entry.getValue());
        }
    }
}
