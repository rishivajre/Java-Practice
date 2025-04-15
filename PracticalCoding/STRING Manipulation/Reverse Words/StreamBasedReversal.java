import java.util.Arrays;

public class StreamBasedReversal {
    public static String reverseWords(String str) {
        if (str ==null) return null;

        return Arrays.stream(str.trim().split("\\s+"))
                .reduce("", (a, b) -> b+ " " + a);
                //.trim();
    }

    public static void main(String[] args) {
        String str = "Right is Wrong";
        System.out.println(reverseWords(str));
    }
}
