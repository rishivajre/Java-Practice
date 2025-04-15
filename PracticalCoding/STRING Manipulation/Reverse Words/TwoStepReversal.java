public class TwoStepReversal { // Approach 2: Two-Step Reversal (Efficient)
    public static String reverseWords(String str) {
        if (str == null || str.isEmpty()) return null;
        
        char[] chars = str.trim().toCharArray(); // converts the string into a character array so we can manipulate it directly (mutable).
        reverse(chars, 0, chars.length-1); // Calling helper method to reverse the entire array.
        
        int start = 0;
        for (int i=0; i<chars.length; i++) {
            if (chars[i] == ' ') {      // if ' '(space is detected)
                reverse(chars, start, i-1); // we reached 1st word's lenght and reverse it (from start to i-1 [last index of word's length])
                start = i+1;        // now move to begining index [i+1] of the next word until we hit the space ' ' again 
            }
        }
            /*We now:

            Traverse character array
            Whenever we hit a space ' ', we reverse the current word segment from start to i-1.
            Then move start = i+1 to begin the next word.
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


/**
✅ Example Dry Run (Full)
Let’s dry run with:

str = "  Hello   World  ";
After trim() + .toCharArray()
➤ chars = ['H','e','l','l','o',' ',' ',' ','W','o','r','l','d']

After full reverse: ➤ chars = ['d','l','r','o','W',' ',' ',' ','o','l','l','e','H']

Start for loop:

Find space at i = 5, reverse 0–4 → "World" ➤ chars = ['W','o','r','l','d',' ',' ',' ','o','l','l','e','H']

Next space at i = 6, nothing to reverse (space)

Next space at i = 7, nothing to reverse

Last word starts at i = 8

After loop, reverse from 8–12 → "Hello" ➤ Final chars = ['W','o','r','l','d',' ',' ',' ','H','e','l','l','o']

New String(chars) → "World Hello"

🎨 ASCII Mindmap:

         [Input String]
               |
             trim()
               |
         toCharArray()
               |
      Reverse entire array
               |
    +----------------------+
    | Reverse each word    |
    | on spaces detection  |
    +----------------------+
               |
         [Final Output]


💡 Key Highlights
Feature	                    Description
Efficient	            No split(), low memory usage
Two-pointer logic	    Used in reverse() helper
In-place operations	    Avoids new string arrays
Robust	                Handles multiple spaces & trims input

🎯 Why it’s important for Interviews?
Efficient word reversal

Shows in-place manipulation

Strong use of two-pointer technique

Avoids String.split() (which uses regex internally — costly)

Frequently asked in Amazon, Google, etc.
 */