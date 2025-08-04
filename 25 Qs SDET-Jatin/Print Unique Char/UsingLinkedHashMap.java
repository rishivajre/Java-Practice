import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.*;

public class UsingLinkedHashMap {
    // Print Unique Chars from String : aabbccddab --> a b c d
    public static void main(String[] args) {
        String input = "aabbcdaabeeeegggfffioasdghadsih";
        char[] inputArray = input.toCharArray();
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();

        for (char c : inputArray) {
            charSet.add(c);
        } 
        System.out.println(charSet);// Print as hash set

        //0R//
        // Print as String using StringBuilder
        StringBuilder sb = new StringBuilder();
        for (char d : charSet) {
            sb.append(d);
        }
        System.out.println(sb.toString());
    }
}
