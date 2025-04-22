public class UsingIndexOf {
    // Using IndexOf() mtd find if Sub String Exists
    public static boolean hasSubstring(String str, String sub) {
        if (str == null || sub == null) return false;
        return str.indexOf(sub) != -1;
    }
}
