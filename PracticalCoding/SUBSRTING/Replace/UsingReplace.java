public class UsingReplace {
    // Using replace() method to replace all occurrences of a substring with another string
    public static String replaceSubstring(String str, String oldSub, String newSub) {
        if (str == null || oldSub == null || newSub == null) return str;
        return str.replace(oldSub, newSub);
    }

    public static void main(String[] args) {
        String str = "Java is a programming language.";
        String oldSub = "Java";
        String newSub = "Python";

        String result = replaceSubstring(str, oldSub, newSub);
        System.out.println(result); // Output: Python is a programming language.
    }
}
