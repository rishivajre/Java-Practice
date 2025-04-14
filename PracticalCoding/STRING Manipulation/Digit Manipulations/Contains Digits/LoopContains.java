public class LoopContains { // Check if a String Contains Only Digits
    // // Approach 1: Using Loop (Simple)
    public static boolean containsOnlyDigits(String str) {
        if (str == null || str.isEmpty()) return false;
        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "999";
        System.out.println(containsOnlyDigits(str));
    }
    
}
