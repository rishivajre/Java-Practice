import java.util.LinkedHashSet;

public class PrintUniqueCharsinString {
    public static void main(String[] args) {
        String input = "asdfazxcvshgoahsohasdjofn";
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : input.toLowerCase().toCharArray()) {
            if (charSet.add(c)) {
                sb.append(c);
            }
        }

        System.out.println("Unique chars: " + charSet);
        System.out.println("Unique chars: " + sb);
    }
}
