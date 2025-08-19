import java.util.LinkedHashSet;
import java.util.TreeSet;

public class UniqueCharsFromString {
    public static void main(String[] args) {
        String input = "sopifauerjjkjkjkjk";

        TreeSet<Character> charSet = new TreeSet<>();

        StringBuilder sb = new StringBuilder();

        for (char c : input.toLowerCase().toCharArray()) {
            if (charSet.add(c)) {
                sb.append(c);
            }
        }

        System.out.println("Unique: " + charSet);
        System.out.println("as String: " + sb.toString());
    }
}
