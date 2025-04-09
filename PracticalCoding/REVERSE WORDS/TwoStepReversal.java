public class TwoStepReversal {
    public static String reverseWords (String sentence) {
        if (sentence == null) return null;
        char[] chars = sentence.trim().toCharArray();
// Step 1: Reverse entire string method
        reverse(chars, 0, chars.length-1);
// Step 2: Reverse each word
        int start = 0;
        for (int i=0; i<chars.length; i++) {
            if (chars[i] == ' ') {
                reverse(chars, start, i-1);
                start = i+1;
            }
        }
        reverse(chars, start, chars.length - 1);
    return new String(chars);
    }

    // Reverse entire string method
    private static void reverse (char[] chars, int start, int end) {
        while (start<end) {
            char temp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = temp;
        }
    }

    public static void main(String[] args) {
        String sentence = " Right is Wrong";
        System.out.println(reverseWords(sentence));
    }
}
