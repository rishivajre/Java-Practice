public class SwayStringsbySubString {
    public static void main(String[] args) {
        /*
         * we need to use the substring method of the String class in Java.
         * Substring method returns part of the string.
         * 
         * We have the start index and end index in the substring method where
         * start index is inclusive and end index is exclusive.
         */

        String s1 = "Rishi";
        String s2 = "Vajre";

        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        System.out.println("s2: " + s2);
        System.out.println("s1: " + s1);
    }
}
