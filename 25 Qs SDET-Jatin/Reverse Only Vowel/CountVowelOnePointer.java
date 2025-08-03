public class CountVowelOnePointer {
    public static void main(String[] args) {
        String input = "String of Characters";
        char inputArray[] = input.toLowerCase().toCharArray();
        String vowels = "aeiou";

        int count = 0;
        for (char c : inputArray) { // Check if the character is found anywhere in the 'vowels' string.
            if (vowels.indexOf(c) != -1) { // indexOf() returns -1 if the character is not found.
                count++;
            }
        }
        System.out.println(count);
    }
}
