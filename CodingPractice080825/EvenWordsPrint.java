public class EvenWordsPrint {
    public static void main(String[] args) {
        String input = "quick brown fox is eating mangoes";

        String[] removeSpace = input.split("\s");
        for (String word : removeSpace) {
            int length = word.length();
            if (length % 2 ==0) {
                System.out.println(word);
            }
        }
    }
}
