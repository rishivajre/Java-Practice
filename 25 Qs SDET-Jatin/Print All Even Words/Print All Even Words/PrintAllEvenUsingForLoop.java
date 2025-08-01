public class PrintAllEvenUsingForLoop { 
    // Print all Even Words from a String
    public static void main(String[] args) {
        String input = " The Fox is Jumping from the wall";

        // Regex to split by 1 or more whitespace characters
        String[] words = input.split("\\s+");

        for (String word : words) {
            // Remove non-alphanumeric characters
            String cleanWord = word.replaceAll("[^a-zA-Z]", "");
            if (cleanWord.length() % 2 == 0 && cleanWord.length() > 0) {
                System.out.println(cleanWord);
            }
        }
    }
}

/* OLD CODE ========>>
 public class PrintAllEvenUsingForLoop { // Print all Even Words from a String
    public static void main(String[] args) {
        String input = "The Fox is Jumping from the wall";

        String[] rmvSpace = input.split(" ");
        
        for (String words : rmvSpace) {
            int length = words.length();
            if (length % 2 ==0) {
                System.out.println(words);
            }
        }
    }
} */