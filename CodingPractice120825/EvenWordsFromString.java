public class EvenWordsFromString {
    public static void main(String[] args) {
        String input = " There is nowhere to go in this world of Sasuke CHuchiha";

        String[] words = input.trim().split("\\s+");

        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.print(word + " ");
            }
        }
    }
}
