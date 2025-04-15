public class TwoStepReversal { // Approach 2: Two-Step Reversal (Efficient)
    public static String reverseWords(String str) {
        if (str == null || str.isEmpty()) return null;
        
        char[] chars = str.trim().toCharArray(); // converts the string into a character array so we can manipulate it directly (mutable).
        reverse(chars, 0, chars.length-1); // Calling helper method to reverse the entire array.
        
        int start = 0;
        for (int i=0; i<chars.length; i++) {
            if (chars[i] == ' ') {
                reverse(chars, start, i-1);
                start = i+1;
            }
        }
        /*We now:

Traverse character array

Whenever we hit a space ' ', we reverse the current word segment from start to i-1

Then move start = i+1 to begin the next word

✅ Last word is reversed manually after loop, as it won’t be followed by a space. */
        reverse(chars, start, chars.length-1);
        return new String(chars);
    }

    private static void reverse(char[] chars, int start, int end) {
        while(start<end) {
            char temp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = temp;
        }
    }

    public static void main(String[] args) {
        String str = "Right is Wrong";
        System.out.println(reverseWords(str));
    }
    
}
