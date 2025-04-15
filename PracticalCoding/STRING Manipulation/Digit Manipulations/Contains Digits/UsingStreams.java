public class UsingStreams {
    //Check of contains only digits via Stream
    public static boolean containsOnlyDigits(String str) {
        if (str == null || str.isEmpty()) return false;
        
        return str.chars().allMatch(Character::isDigit); 
    }
        // str.chars() : Converts string into IntStream of character codes
   //  :: means in Java — it’s called the method reference operator and is a cool part of Java 8 functional programming 🌟
/* :: Operator _Meaning-
:: is used to refer to a method by its name, without calling it.
🎯 It’s a shortcut to say “use this method here”
    without needing to write a full lambda like (x) -> someMethod(x).

Syntax:
    ClassName::methodName     // Static method
    objectRef::methodName     // Instance method
    ClassName::instanceMethod // Applied to objects in a stream

Usage: 
    Character::isLetterOrDigit
    Character::isUpperCase
    Character::isLowerCase
 */
    public static void main(String[] args) {
        String str = "000";
        System.out.println(containsOnlyDigits(str));
    }
}


/*
 🧠 ASCII Mindmap of Both 🧩
sql
Copy
Edit
Check If String Has Only Digits
|
+--> Null/Empty Check
|
+--> Approach 2: Regex (matches("\\d+"))
|     |
|     +--> Efficient for short checks
|     +--> Less readable for non-regex users
|
+--> Approach 3: Stream API (chars().allMatch(...))
      |
      +--> Modern Java (Functional style)
      +--> Easy to combine with other stream ops

🔥 Comparison Table

Feature	Regex       (Approach 2)	                        Stream (Approach 3)
Readability	        ❌ Less readable for regex newbies	✅ Clean, modern syntax
Performance (short)	✅ Fast	                            ✅ Fast
Performance (large)	✅ Optimized (regex engine)	        ⚠️ Slower (stream overhead)
Use in validation libs	✅ Common	                    ❌ Less used
Java version	    Works in all versions	                Java 8+ required
Testability	        ✅ Simple assertions	                ✅ Functional test friendly

🎓 Pro Tips
        1. Regex is good for static checks and data validation.
        2. Stream is good when working in pipeline-style logic or modern Java patterns.
 */