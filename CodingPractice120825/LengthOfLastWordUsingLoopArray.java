public class LengthOfLastWordUsingLoopArray {
    public static void main(String[] args) {
        String input = "Dog is Missing.";
        char[] inputArray = input.toCharArray();
        int count = 0;

        StringBuilder sb = new StringBuilder();

        for (int i=inputArray.length-1; i>=0; i--) {
            if (Character.isAlphabetic(inputArray[i])) {
                count++;
                sb.insert(0, inputArray[i]);
            } else {
                if (count > 0) {
                    System.out.println(sb);
                    System.out.println(count);
                    break;
                }
            }
        }
    }
}
