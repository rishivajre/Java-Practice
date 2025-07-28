public class CharArrayRS {    // Using Char[] array and 2 pointers
    public static String reverseString(String str) {        
        if (str == null) return null;
        char[] chars = str.toCharArray();
        int left = 0; int right = chars.length-1;

        while(left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        } 

        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "ihsiR";
        System.out.println(reverseString(str));
    }
}
