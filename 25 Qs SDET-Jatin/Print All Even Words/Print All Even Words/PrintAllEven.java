public class PrintAllEven {
    public static void main(String[] args) {
        String input = "The Fox is Jumping from the wall";

        String[] rmvSpace = input.split("\s");
        
        for (String words : rmvSpace) {
            int length = words.length();
            if (length % 2 ==0) {
                System.out.println(words);
            }
        }
    }
}
