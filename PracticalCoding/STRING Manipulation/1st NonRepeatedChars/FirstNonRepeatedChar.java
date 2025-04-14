import java.util.*;

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
        String str = "aabbccddeff";
        System.out.println(firstNonRepeatedCharacter(str));
    }
}

/** 
 * 📚 ASCII Mindmap:
firstNonRepeated1()
├── Null/Empty check
├── Build freq map
│   └── LinkedHashMap<Character, Integer>
├── Traverse map
│   └── Find entry with value == 1
└── Return first such character or null
 */