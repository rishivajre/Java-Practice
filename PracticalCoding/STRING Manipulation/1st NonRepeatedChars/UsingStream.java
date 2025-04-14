import java.util.*;

public class UsingStream { // 3: Stream with Grouping (Modern)
    public static Character fCharacter(String str) {
        if (str == null || str.isEmpty()) return null;
        return str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(
                    ch -> ch, LinkedHashMap::new, Collectors.counting()))
                    .entrySet().stream()
                    .filter(e -> e.getValue() == 1)
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .orElse(null);
    }

    public static void main(String[] args) {
        String str = "ssfftte";
        System.out.println(fCharacter(str));
    }
    
}
