public class ManualLoop {
    public static boolean hasSubString(String str, String sub) {
        if (str == null || sub == null || sub.length() > str.length()) return false;
        
        for (int i=0; i<str.length() - sub.length(); i++) {
            int j =0;
            while (j<sub.length() && str.charAt(i+j) == sub.charAt(j)) {
                j++;
            }
            if (j == sub.length()) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "Java Script";
        String sub = "Java";

        System.out.println(hasSubString(str, sub));
    }
    // Output: false, as "java" is not found in "Java Script"
}
