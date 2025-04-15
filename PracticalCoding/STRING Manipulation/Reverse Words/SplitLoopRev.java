public class SplitLoopRev { //// Approach 1: Split and Reverse (Simple)
    public static String splitAndReverseString(String str) {
        if(str == null || str.isEmpty()) return null;
        StringBuilder sb = new StringBuilder();
        String[] words = str.trim().split("\\s+");

        for (int i=words.length-1; i>=0; i--) {
            sb.append(words[i]);
            if (i>0) sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Right is Wrong";
        System.out.println(splitAndReverseString(str));
    }
}
 
/**
 *        +-------------------------+
          | splitAndReverseString() |
          +-------------------------+
                     |
     +---------------+---------------+
     |                               |
 Null check                    Trim + Split
     |                               |
     |                      +--------+--------+
     |                      |   ["Right", "is", "Wrong"]
     |                      |
 Reverse loop  <------------+
     |
     V
Build new string in reverse
     |
     V
 Return final string

🔄 Dry Run:
Let's dry-run with input:
" Right is Wrong "

java
Copy
Edit
After trim: "Right   is Wrong"
After split: ["Right", "is", "Wrong"]
🔁 Loop in reverse:

Iteration	i	words[i]	sb
1	2	Wrong	"Wrong"
2	1	is	"Wrong is"
3	0	Right	"Wrong is Right"
✅ Final Output: "Wrong is Right"

✅ Pros
Simple and readable

Handles multiple spaces easily

Good for interview prep

❌ Cons
Uses split() → creates a new array → extra memory

Not as efficient as in-place reversal for large strings

 */