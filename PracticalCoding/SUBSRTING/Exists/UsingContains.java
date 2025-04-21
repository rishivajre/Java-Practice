public class UsingContains {
    // Using contains() method
    public static boolean hasSubstring(String str, String sub) {
        if (str == null || sub == null) return false;
        return str.toLowerCase().contains(sub);
    }

    public static void main(String[] args) {
        String str = "Java Script";
        String sub = "java";

        System.out.println(hasSubstring(str, sub));
    }
}
