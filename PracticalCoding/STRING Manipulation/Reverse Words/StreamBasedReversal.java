import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors; 

public class StreamBasedReversal {  //// Approach 3: Stream-Based (Modern)
    public static String reverseWords(String str) {
        if (str ==null) return null;

        return Arrays.stream(str.trim().split("\\s+")) // \\s means any whitespace & + means one or more
                .reduce("", (a, b) -> b+ " " + a)
                .trim(); // to clean any spaces ... trim the trailing space at the end
    }

    public static void main(String[] args) {
        String str = "Right is Wrong";
        System.out.println(reverseWords(str));

        String str2 = "Fitness is Strength";

        String reversed = Arrays.stream(str2.trim().split("\\s+"))
                            .collect(Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> {
                                    Collections.reverse(list);
                                    return String.join(" ", list);
                                }
                                ));

        System.out.println(reversed); // Using .collect() with Collectors.joining()
    }
}


/*
 🧠 ASCII Flow

Input:      "  Java   is  powerful  "
Trim:        "Java   is  powerful"
Split:      ["Java", "is", "powerful"]
Stream:     Java → is → powerful
Reduce:     "powerful is Java"

🧠 Why it works:
reduce() accumulates values left to right

We're using b + " " + a to flip order

Final result is reversed word-wise

🔥 Pro Tips:
Concept	                                 Explanation
reduce()	                            Powerful terminal operation for combining stream values
\\s+ in split	                        Avoids multiple space issues (normalizes spacing)
a, b -> b + " " + a	                    Clever trick to reverse word order
.trim()	                                Fixes trailing space in final output


Stream.of("Java", "is", "great")
          |
          V
.reduce("", (a, b) -> b + " " + a)

Step 1: a="",     b="Java"   → "Java"
Step 2: a="Java", b="is"     → "is Java"
Step 3: a="is Java", b="great" → "great is Java"
 */

 /**
🆚       Reduce vs Collect — ⚔️ Side-by-side Table

    Feature	                reduce()	                            collect()

💬 Meaning	            Combine into a single value	            Gather elements into a container (like list/set)
📦 Output	            Single value (String, Integer, etc.)	Any structure (List, Set, Map, etc.)
🔄 In-place reversing?	Possible (with logic)	                Easier using Collections.reverse()
🧠 Declarative?	        Yes, functional & elegant	            Slightly more verbose
🧪 Custom logic?	    Needs more manual handling	            Flexible with intermediate containers
🛠️ Built-in tools	     Limited	                             Many tools via Collectors
👶 Easy to read?	    Good for simple tasks	                Better for complex data transformations


🧠 Pro Tips to Remember
🔸 Use .reduce() when:
You want to reduce the stream to a single value.

Example: reversing words, summing, multiplying, etc.

🔸 Use .collect() when:
You want to gather stream elements into a collection.

You need post-processing, like reversing a list or grouping by values.

🎨 ASCII Mindmap

Stream API
├── reduce() → Single value
│   └── Accumulator: (a, b) -> b + " " + a
│
└── collect()
    └── Collectors
        ├── toList()
        ├── joining(" ")
        └── collectingAndThen(list → reverse)

  */