import java.util.Arrays;
import java.util.regex.Pattern;

public class EvenWordsUsingStream {
    public static void main(String[] args) {
        String input = "This is what you get when you watch Pokemon...";

        Pattern pattern = Pattern.compile("\\s+"); // pre compile split pattern for more efficiency

        Arrays.stream(input.split("\\s+")) // split by one or more spaces
                .map(word -> word.replaceAll("[^a-zA-Z]", "")) // Clean each word of special chars
                .filter(word -> word.length() % 2 == 0)
                .forEach(System.out::println);
    }
}
