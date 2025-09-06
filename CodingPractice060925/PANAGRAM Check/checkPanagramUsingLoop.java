public class checkPanagramUsingLoop {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog.";

        boolean result = checkPanagram(input);

        if (result) {
            System.out.println("Is PANAGRAM");
        } else {
            System.out.println("Not a PANAGRAM!!");
        }
    }

    public static boolean checkPanagram(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        char[] inputArray = input.toLowerCase().toCharArray();
        if (inputArray.length < 26) {
            return false;
        }

        for (char i = 'a'; i <= 'z'; i++) {
            if (input.indexOf(i) == -1) {
                return false;
            }
        }

        return true;
    }
}
