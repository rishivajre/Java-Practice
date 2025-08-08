public class LengthOfLastWordUsingSBLoop {
    public static void main(String[] args) {
        String input = "Brown fox is munching...";
        input = input.trim();

        int count = 0;
        char[] inputArray = input.toCharArray();
        StringBuilder lastWord = new StringBuilder();

        for (int i = inputArray.length-1; i>=0; i--) {
            if (Character.isAlphabetic(inputArray[i])) {
                count++;
                lastWord.insert(0, inputArray[i]);
            } else {
                if (count > 0) {
                    System.out.println("Last word in String is: " + lastWord);
                    System.out.println("word count is: " + count);
                    break;
                }
            }
        }
    }
}
