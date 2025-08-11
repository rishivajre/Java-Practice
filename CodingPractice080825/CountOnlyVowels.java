public class CountOnlyVowels {
    public static void main(String[] args) {
        String input = "String of Characters";
        char[] inputArray = input.toLowerCase().toCharArray();
        String vowels = "aeiou";
        int count =0;

        for (char c : inputArray) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
