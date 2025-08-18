import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String input = "SuperMan";

        System.out.println(input + " => " + ReverseUsingStack(input));
    }

    public static String ReverseUsingStack(String input) {
        char[] reversedString = new char[input.length()];
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<input.length(); i++) {
            stack.push(input.charAt(i));
        }

        int i = 0;
        while (!stack.isEmpty()) {
            reversedString[i++] = stack.pop();
        }

        return new String(reversedString);
    }
}
