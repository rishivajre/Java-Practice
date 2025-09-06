import java.util.Stack;

public class reverseUsingStack {

    public static void main(String[] args) {
        String str1 = "SuperMan";
        System.out.println(reverseUsingStack(str1));
    }

    public static String reverseUsingStack(String input) {
        char[] reversedString = new char[input.length()];
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<input.length(); i++) {
            stack.push(input.charAt(i));
        }

        int i =0;
        while (!stack.isEmpty()) {
            reversedString[i++] = stack.pop();
        }

        return new String(reversedString);
    }
}