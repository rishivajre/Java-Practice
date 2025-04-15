public class ReverseWords {
    public static String splitAndReverseString(String str) {
        if(str == null || str.isEmpty()) return null;
        StringBuilder sb = new StringBuilder();
        String[] words = str.trim().split("\\s+");

        for (int i=words.length-1; i>=0; i--) {
            sb.append(words[i]);
            if (i>0) sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Right is Wrong";
        System.out.println(splitAndReverseString(str));
    }
}
 