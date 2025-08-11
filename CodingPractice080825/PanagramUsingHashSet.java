import java.util.HashSet;

public class PanagramUsingHashSet {
    public static boolean checkPanagram(String input) {
        char[] inputArray = input.toLowerCase().toCharArray();
        HashSet<Character> charSet = new HashSet<>();

        for (char c : inputArray) {
            if(Character.isLetter(c)) {
                charSet.add(c);
            }
        }

        if (charSet.size() < 26) { // deliberately given after becasue hassh set will store only unique values
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";

        boolean result = checkPanagram(input);

        if (result) {
            System.out.println("Panagram");
        } else {
            System.out.println("Not Pana!!!");
        }
    }
}
