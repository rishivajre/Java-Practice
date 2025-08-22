import java.util.Arrays;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UsingStreamMapList {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "Banana", "Orange", "banana", "apple");

        Map<String, Long> wordFrequency = words.stream()
                .collect(Collectors.groupingBy(
                        word -> word.toLowerCase(), Collectors.counting()));

        System.out.println("Word Frequency: " + wordFrequency);

    }
}
