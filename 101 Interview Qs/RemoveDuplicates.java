import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String input = "aabbcc";
        Set<Character> setMap = new LinkedHashSet<>();
        char[] inputArray = input.toCharArray();

        for (char c : inputArray) {
            setMap.add(c);
        }

        // Print the unique characters as a single string
        for (char c : setMap) {
            System.out.print(c);
        }
        System.out.println();
        setMap.forEach(c -> System.out.print(c + " "));
        System.out.println();
        setMap.forEach(System.out::print);
    }
}