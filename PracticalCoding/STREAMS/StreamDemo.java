import java.util.*;

public class StreamDemo {
    public static void main(String [] args) {
        List<String> fruits = Arrays.asList("Orange", "Apple", "Banana", "Mango");

        // Print all fruits starting with A
        fruits.stream()
                .filter(fruit -> fruit.startsWith("A"))
                .forEach(System.out::println);
    }
}
