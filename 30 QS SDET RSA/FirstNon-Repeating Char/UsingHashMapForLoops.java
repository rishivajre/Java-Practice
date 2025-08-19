import java.util.HashMap;

public class UsingHashMapForLoops {
    public static char FirstNonRepeatingChar(String input) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (int i =0; i<input.length(); i++) {
            char c = input.charAt(i);

            if(charCount.containsKey(c)){
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        for (int i=0; i<input.length(); i++) {
            char c = input.charAt(i);

            if (charCount.get(c) == 1) return c;
        }

        return '_';
    }

    public static void main(String[] args) {
        System.out.println(FirstNonRepeatingChar("a"));
    }
}
