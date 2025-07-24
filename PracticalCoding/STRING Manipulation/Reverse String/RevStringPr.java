public class RevStringPr {    // reverse a given string using a for loop

    public static String reverseString(String str){
        if (str=null) return null;

        char[] chars = str.toCharArray();
        int left = 0;int right = chars.length-1;

        while (left<right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        return new String(chars);
    }


    public static void main (String[] args) {
        String in = "ihsiR";
        String out = "";
        int count = 0;

        for (int i=in.length()-1; i>=0; i--) {
            out = out + in.charAt(i);
            count++;
            System.out.println(out + count);
        }
        System.out.println(out);
    }
}
