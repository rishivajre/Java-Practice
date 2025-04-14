import java.util.ArrayList;
import java.util.List;

public class LoopFind { // Approach 1: Nested Loops (Simple)
    public static List<String> allSubStrings(String str) {

        List<String> result = new ArrayList<>();
        if(str == null) return result;

        for (int i =0; i<str.length(); i++) {
            for (int j=i+1; j<=str.length(); j++) {
                result.add(str.substring(i, j));
            }
        }
        return result;  
    }

    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(allSubStrings(str));
    }
    
}
// continuous characters, not combinations

/**
 * Purpose to do?
 * 
 * Input: "abc"
 * Output: ["a", "ab", "abc", "b", "bc", "c"]
 */

 /*
 🔁 Dry Run with "abc"
Step 1: Initialize
Input: "abc"

result = []

Loop Iteration Table:
i	j	str.substring(i, j)	Result List
0	1	"a"	["a"]
0	2	"ab"	["a", "ab"]
0	3	"abc"	["a", "ab", "abc"]
1	2	"b"	["a", "ab", "abc", "b"]
1	3	"bc"	["a", "ab", "abc", "b", "bc"]
2	3	"c"	["a", "ab", "abc", "b", "bc", "c"]

✅ Final Output:
["a", "ab", "abc", "b", "bc", "c"]

📊 Time & Space Complexity
Metric	Value
Time Complexity	O(n^2)
Space Complexity	O(n^2) (because of storing substrings)

🌈 ASCII Mind Map


     +----------------------------+
     |     All Substrings Logic   |
     +----------------------------+
               |
         +-----+------+
         | Null Check |
         +------------+
               |
        +--------------+
        | Outer Loop i |
        +--------------+
               |
         +---------------+
         | Inner Loop j  |
         +---------------+
               |
        +-----------------------+
        | str.substring(i, j)   |
        +-----------------------+
               |
         +-----------------+
         | Add to Result[] |
         +-----------------+

🧠 Fun Facts:
✨ substring(i, j) method is extremely optimized in Java — it does not create a new character array each time in modern JDKs (it reuses original string’s char array).

✨ Total substrings = n*(n+1)/2, where n = length of string.

💡 Pro Tips:
Want unique substrings only? Use Set<String> instead of List<String>.

Want sorted substrings? Add a sorting step: Collections.sort(result);

Want only substrings of length ≥ k? Add condition if (j - i >= k) before adding. */