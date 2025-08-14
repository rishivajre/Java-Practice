import java.util.HashSet;

public class PanagramwithHashSet {
    public static void main(String[] args) {
        String input = "The Quick Brown Fox Jumps Over The Lazy Dod";
        if (CheckPanagram(input)){
            System.out.println("String is a Panagram");
        } else {
            System.out.println("String is not a Panagram");
        } 
    }

    public static boolean CheckPanagram(String input ) {
        HashSet<Character> charSet = new HashSet<>();
        char[] inputArray = input.toLowerCase().toCharArray();

        for (char c : inputArray){
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
