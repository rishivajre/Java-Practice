import java.util.*;

public class StringBuilderRS {
    // Using Stringbuilder reverse a string
    public static String reverseString(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String str = "ihsiR";
        System.out.println(reverseString(str));
    }
}
