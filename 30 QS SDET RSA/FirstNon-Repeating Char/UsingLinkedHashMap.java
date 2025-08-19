import java.util.LinkedHashMap;
import java.util.Map;

public class UsingLinkedHashMap {
    public static void main(String[] args) {
        System.out.println(FirstNonRepeatingChar("aabbcck"));
    }

    public static char FirstNonRepeatingChar(String input) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : input.toLowerCase().toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for (var entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '_';
    }
}
