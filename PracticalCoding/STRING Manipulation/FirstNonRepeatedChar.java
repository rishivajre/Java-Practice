import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static Character firstNonRepeatedCharacter(String str) {
        if (str == null || str.isEmpty()) return null;
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }
        return null;
    }

    public static void main(String[] args) {
        String str = "aabbcdeff";
        System.out.println(firstNonRepeatedCharacter(str));
    }
}
