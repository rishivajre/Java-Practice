public class StringIsPANAGRAMUsingForLoop {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dod.";

        boolean result = checkPanagram(input);
        if (result) {
            System.out.println("This is Panagram");
        } else {
            System.out.println("NOT PANA!!");
        }
    }

    public static boolean checkPanagram(String input) {
        char[] inputArray = input.toLowerCase().toCharArray();

        if (inputArray.length < 26) {
            return false;
        }

        for (char i = 'a'; i<='z'; i++) {
            if (input.indexOf(i) == -1) {
                return false;
            }
        }
        return true;
    }
}
