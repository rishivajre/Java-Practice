import java.util.Arrays;

public class ReplaceVowelswithX {
    public static void main(String[] args) {
        String input = "Peacock";
        char[] inputArray = input.toLowerCase().toCharArray();
        String vowels = "aeiou";

        StringBuilder sb = new StringBuilder();

        for (char c : inputArray) {
            if(vowels.indexOf(c) != -1) {
                sb.append('X');
            } else {
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
    }
}
