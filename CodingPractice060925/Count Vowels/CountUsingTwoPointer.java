public class CountUsingTwoPointer {
    public static void main(String[] args) {
        String input = "String of Vowels";
        char[] inputArray = input.toLowerCase().toCharArray();
        String vowels = "aeiou";

        int count = 0;
        for (char c : inputArray) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
