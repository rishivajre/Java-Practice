import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterElements {

    public static void main(String[] args) {
        List<String> names = List.of("Rekha", "Reshma", "Ravan", "Kevin");
        names.stream().forEach(x -> System.out.print(x + " ")); // Rekha Reshma Ravan Kevin
        System.out.println();
        
        //Filter Elements
        names.stream().filter(x -> x.contains("kh")).forEach(System.out::print); //Rekha

        List<Integer> numbers = List.of(5,10,12,68);

        numbers.stream().filter(n -> n>10)
        .collect(Collectors.toList()).forEach(p -> System.out.println("\n" + p));;



    }
}