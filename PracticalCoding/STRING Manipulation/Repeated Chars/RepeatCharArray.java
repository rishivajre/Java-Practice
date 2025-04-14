public class RepeatCharArray { // converting "abc" -> "aabbcc" : Using Character Array (Manual)
    public static String repeatChars(String str) {
        if (str  == null || str.isEmpty()) return "";
        char[] result = new char[str.length()*2];
        int index = 0;
        
        for (int i=0; i<str.length(); i++) {
            result[index++] = str.charAt(i);
            result[index++] = str.charAt(i);
        }
        return new String(result);
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(repeatChars(str));
    }
}
