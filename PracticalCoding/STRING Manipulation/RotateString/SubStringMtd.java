public class SubStringMtd { //  Approach 1: Using substring() (Simple)
    // Left Rotate a String by K Positions: Given a string, rotate it to the left by k characters.
    /*Example:
                Input → "abcdef", k = 2
                Output → "cdefab" */
    public static String rotateString(String str, int k) { 
        if (str == null || str.isEmpty()) return str;

        k = k % str.length();   // handle k > length

        return str.substring(k) + str.substring(0, k);
    }

    public static void main(String[] args) {
        String str = "abcdef";
        int k = 3;

        System.out.println(rotateString(str, k));   //output: defabc
    }
}