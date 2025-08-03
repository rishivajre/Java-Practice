public class UsingForLoop {
    // Check if the input string is a pangram
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean result = CheckPanagram(input);

        if (result) {
            System.out.println("It is a Panagram");
        } else {
            System.out.println("Not a Panagram");
        }
    }

    public static boolean CheckPanagram (String input) {
        char[] inputArray = input.toLowerCase().toCharArray();

        if (inputArray.length < 26) {
            return false;
        }
        for (char i = 'a'; i<= 'z'; i++) {
            if (input.indexOf(i) == -1) { // OR input.indexOf(i) < 0
                return false;
            }
        }
        return true;
    }

}