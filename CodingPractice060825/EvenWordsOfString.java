public class EvenWordsOfString {
    public static void main(String[] args) {
        String input = "The man is carrying a baby who is two years old as of now!!";

        String[] removeSpace = input.split("\s");

        for (String words : removeSpace) {
            int length = words.length();
            if (length % 2 == 0) {
                System.out.print(words + " ");
            }
        }
    }
}
