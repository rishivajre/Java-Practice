import java.util.HashSet;

public class UsingHashSet {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog.";

        if (checkPanagram(input)) {
            System.out.println("IS PANAGRAM");
        } else {
            System.out.println("Not a Panagram!!");
        }
    }

    public static boolean checkPanagram(String input) {
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
