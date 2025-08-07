import java.util.HashSet;

public class PanagramUsingHashSet {
    public static void main(String[] args) {
        String input = "The quick brown fox @@@### jumps over the 333 lazy dog.";
        if (CheckPanagram(input)) {
            System.out.println("It is Panagram");
        } else {
            System.out.println("Not Panagram");
        }
    }

    public static boolean CheckPanagram(String input) {
        HashSet<Character> charSet = new HashSet<>();
        char[] inputArray = input.toLowerCase().toCharArray();

        for (char c : inputArray) {
            if (Character.isLetter(c)) {
                charSet.add(c);
            }
        }
        if (charSet.size() < 26) {
            return false;
        }
        return true;
    }
}
