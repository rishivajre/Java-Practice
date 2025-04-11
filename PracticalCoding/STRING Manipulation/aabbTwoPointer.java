public class aabbTwoPointer {   // aabbbcc -> a2b3c2 : Using 2 Pointer Tech(efficient)

    public static String compreString(String str) {
        if(str == null || str.isEmpty()) return "";
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int start = 0;

        for (int end=1; end<=chars.length; end++) {
            if (end == chars.length || chars[end] != chars[start]) {
                sb.append(chars[start]).append(end-start);
                start = end;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaaaaaabbbbbbcccczc";
        System.out.println(compreString(str));
    }
    
    
}
