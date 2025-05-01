public class Palindrom {    
    // Approach 1: Two-pointer technique.
    public static boolean isPalindrome1(String str) {
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) return false;
        }
        return true;
    }

    public static void main (String[] args) {
        if (isPalindrome1("TENET")){
            System.out.println("is a Palindrom");
        }
        else{
            System.out.println("Not a palindrom");
        }
    }
    
}
