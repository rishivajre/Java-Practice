public class aabbLoop {  // aabbbcc -> a2b3c2 : Using Loop with StringBuilder (Simple)
    public static String compressString(String str) {
        if (str == null || str.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char current = str.charAt(0);

        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == current) {
                count++;
            }else{
                sb.append(current).append(count);
                current = str.charAt(i);
                count = 1;
            }
        }
        sb.append(current).append(count);
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aabbbcc";
        System.out.println(compressString(str));
    }
}
