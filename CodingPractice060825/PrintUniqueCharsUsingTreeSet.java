import java.util.TreeSet;

public class PrintUniqueCharsUsingTreeSet {
    public static void main(String[] args) {
        String input = "dfwoeumnvxzoeawof";
        TreeSet<Character> charSet  = new TreeSet<>();

        StringBuilder sb = new StringBuilder();

        for (char c : input.toLowerCase().toCharArray()) {
            if(charSet.add(c)){
                sb.append(c);
            }
        }

        System.out.println("Unique Sorted Chars (Set): " + charSet);
        System.out.println("Unique Sorted Chars (String): " + sb.toString());

    }
}
