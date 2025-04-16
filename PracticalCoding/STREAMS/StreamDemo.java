import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String [] args) {
        List<String> fruits = Arrays.asList("Orange", "Apple", "Banana", "Mango", "Anar");
        List<String> names = List.of("Aman", "neha", "Rahul");

        // Print all fruits starting with A
        fruits.stream()
                .filter(fruit -> fruit.startsWith("A"))
                .forEach(System.out::println);
    }
}
