public class UsingLoop {
    public static void main(String[] args) {
        String str = " Help the cow who is stuck on the roof";
        str = str.trim();
    
        int count = 0;
        char[] inputArray = str.toCharArray();
        StringBuilder lastWord = new StringBuilder();

        for (int i = inputArray.length - 1; i >= 0; i--) {
            if (inputArray[i] != ' ') {
                count++;
                lastWord = lastWord.insert(0, inputArray[i]);
            } else {
                if (count > 0) {
                    System.out.println("The last word in the String is: " + lastWord);
                    System.out.println("The length of the last word is: " + count);
                    break;
                }
            }
        }

    }
}
