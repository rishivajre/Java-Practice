import java.util.*;

public class FindDuplicatesMapNSet {
    public static void main(String[] args) {
        String input = "Papee";
        char[] inputArray = input.toLowerCase().toCharArray();

        HashMap<Character, Integer> fMap = new HashMap<>();

        for (char c : inputArray) {
            fMap.put(c, fMap.getOrDefault(c, 0)+1);
        }

        Set<Character> keys = fMap.keySet();
        for (char c : keys) {
            if (fMap.get(c) > 1) { // Only get the Duplicates where count is > 1
                System.out.println(c + " => " + fMap.get(c));
            }
        }
    }
}
