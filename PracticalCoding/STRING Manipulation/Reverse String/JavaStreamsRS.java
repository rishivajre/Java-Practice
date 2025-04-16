public class JavaStreamsRS {
    public static String reverseString(String str){
        if (str == null) return null;

        return str.chars().mapToObj(ch -> String.valueOf((char)ch))
        .reduce("", (a, b) -> b + a);
    }

    public static void main(String[] args) {
        String str = "ihsiR";
        System.out.println(reverseString(str));
    }
}
