import java.util.LinkedHashSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UsingStreamsLinkedHashSet {
    public static void main(String[] args) {
        String input = "aabbdudosjoi";

        //Use a Stream to process Characters & Collect them in a "LinkedHashSet"
        String uniqueChars = input.chars()
                            .mapToObj(c -> (char)c)
                            .collect(Collectors.toCollection(LinkedHashSet::new))
                            .stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining());

        System.out.println(uniqueChars);
    }
}
