import java.util.ArrayList;
import java.util.List;

public class SBuilder {
    public static List<String> fsubstrings(String str) {
        List<String> result = new ArrayList<>();
        if (str == null) return result;
        StringBuffer sb = new StringBuffer();

        for (int i=0; i<str.length(); i++) {
            sb.setLength(0);
            for (int j=i; j<str.length(); j++) {
                sb.append(str.charAt(j));
                result.add(sb.toString());
            }
        }
        return result;
    }

    public static void main(String [] args) {
        String str = "abc";
        System.out.println(fsubstrings(str));
    }
}


/**
 * Q: Generate all substrings (continuous sequences) of a given string using an efficient technique with StringBuilder.

🔍 Input: "abc"
📤 Output: ["a", "ab", "abc", "b", "bc", "c"]

🔁 Dry Run: Input "abc": 
i	j	sb (building string)	Result List
0	0	    "a"	                   ["a"]
0	1	    "ab"	               ["a", "ab"]
0	2	    "abc"	               ["a", "ab", "abc"]
1	1	    "b"	                   ["a", "ab", "abc", "b"]
1	2	    "bc"                   ["a", "ab", "abc", "b", "bc"]
2	2	    "c"	                   ["a", "ab", "abc", "b", "bc", "c"]

✅ Output:  ["a", "ab", "abc", "b", "bc", "c"]

⚙️ ASCII Mindmap 🧠

+-----------------------------------------------------+
|               allSubstrings2 (Builder)              |
+-----------------------------------------------------+
        |
        |--> Null Check (if str == null)
        |
        |--> Outer loop i (start index of substrings)
               |
               |--> Reset StringBuilder sb.setLength(0)
               |
               |--> Inner loop j (append chars from i to end)
                       |
                       |--> sb.append(str.charAt(j))
                       |
                       |--> result.add(sb.toString())

⚡ Time & Space Complexity

Metric	                Value

Time Complexity	        O(n^2)
Space Complexity	    O(n^2) (for result list)

🎯 Why Is This Efficient?
1. Java’s substring(i, j) creates new strings every time.

2. But StringBuilder minimizes memory churn by reusing the same buffer.

3. Especially useful for huge strings. 🔥 

🤓 Pro Tips
Use this when:

Working with long strings 🔁

Need better memory usage 📉

Generating substrings for algorithmic problems 🔍
 */