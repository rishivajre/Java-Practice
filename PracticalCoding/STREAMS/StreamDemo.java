import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String [] args) {
        List<String> list = Arrays.asList("abb","fff", "ooo");
        List<String> names = List.of("Amit", "Rahul", "KL", "Virat");
        names.stream()
                .filter(x ->x.toLowerCase().endsWith("l"))
                .forEach(System.out::print);

        //Creating stream from List & printing with forEach & lamda
        Stream<String> stream1 = names.stream();
        stream1.forEach(name -> System.out.println(name));
        names.stream().forEach(System.out::print);

        // From array (int[]) and boxing to Stream<Integer>
        int[] arr = {1,2,3};
        System.out.println("");
        Arrays.stream(arr).boxed().forEach(System.out::print);
        System.out.println("\n----------");
        Arrays.stream(arr).boxed().forEach(x -> System.out.print(x));
        System.out.println("\n----------");

        // From Instream directly (without boxing)
        IntStream.range(1, 9).forEach(System.out::print);
        System.out.println("\n----------");

        // From Stream.of() (values)
        Stream.of("red", "blue", "green").forEach(m -> System.out.print(m));
        System.out.println("\n----------");

        //From array of Strings
        String[] kit = {"ball", "bat", "Net"};
        Arrays.stream(kit).forEach(System.out::println);

        // Using collect to List then printing
        List<String> upperNames = names.stream().map(String::toUpperCase)
                                        .collect(Collectors.toList());
        System.out.println(upperNames);
        System.out.println("\n----------");

        // Using reduce to combine
        String joined = names.stream()
                                .reduce("", (a, b) -> a + b + " ");
        System.out.println(joined.trim());
        
    }
}
