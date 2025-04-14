public class UsingRegex {
    // Check using Regex
    public static boolean containsOnlyDigits(String str) {
        if (str == null || str.isEmpty()) return false;
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        String str = "888";
        System.out.println(containsOnlyDigits(str));
    }
}
