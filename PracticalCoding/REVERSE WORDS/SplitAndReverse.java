public class SplitAndReverse {

    public static String reverseString(String sentence) {
        if (sentence == null) return null;

        String[] words = sentence.trim().split("\\s+");
        StringBuffer s = new StringBuffer();
        //StringBuilder s = new StringBuilder();
        for(int i=words.length-1; i>=0; i--) {
            s.append(words[i]);
            if (i>0) s.append(" ");
        }
        return s.toString();
    }
    public static void main(String[] args) {
        String sentence = "Right is Wrong";
        System.out.println(reverseString(sentence));
    }
}
