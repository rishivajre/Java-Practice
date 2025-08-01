import java.util.Arrays;
import java.util.regex.Pattern;

public class UsingStream {

    public static void main(String[] args) {
        String input = " That Fox is Thin as Stick.";
        //Pre - compile the split pattern for efficiency
        Pattern pattern = Pattern.compile("\\s+");

        Arrays.stream(pattern.split(input)) //Split by one or more spaces
                .map(word -> word.replaceAll("[^a-zA-Z]", "")) // Clean each word of special chars
                .filter(word -> word.length() % 2 == 0) // Filter for even words
                .forEach(System.out::println); // Print each even word
    }
}