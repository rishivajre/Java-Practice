import java.util.HashMap;
import java.util.*;

public class CounrNumCharsHashMap {
    public static void main(String[] args) {
        String input = "Rishikesh";
        HashMap<Character,Integer> hashMap = new HashMap<>();
        char[] inputArray = input.toCharArray();
        for (char c : inputArray) {
            hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
        }

        for (char c: hashMap.keySet()) {
            System.out.println(hashMap.get(c) + " => " + c);
        }
    }
}
