import java.util.Arrays;
import java.util.regex.Pattern;

public class EvenWordsOfStringArrayStreams {
    // Using array of streams
    public static void main(String[] args) {
        String input = "Here is a word for you, Enjoy thy life";

        Pattern pattern = Pattern.compile("\\s+"); // Pre-compile the split pattern for efficiency

        Arrays.stream(pattern.split(input)) // Split by one or more spaces
                .map(word -> word.replaceAll("[^a-zA-Z]", "")) // clean each word of speacial Chars ⭐⭐⭐
                .filter(word -> word.length() % 2 ==0) // filter for even words
                .forEach(System.out::println);
    }
}
