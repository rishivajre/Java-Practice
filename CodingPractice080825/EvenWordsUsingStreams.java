import java.util.Arrays;
import java.util.regex.Pattern;

public class EvenWordsUsingStreams {
    public static void main(String[] args) {
        String input = "That fox is thin as stick";
        
        Pattern pattern = Pattern.compile("\\s+");

        Arrays.stream(pattern.split(input))
                .map(word -> word.replaceAll("[^a-zA-Z]", ""))
                .filter(word -> word.length()%2 ==0)
                .forEach(System.out::println);
    }
}
