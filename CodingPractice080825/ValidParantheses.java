import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        String input = "(((0d00)))";

        if (checkForValidParantheses(input)) {
            System.out.println("Valid ( )");
        } else {
            System.out.println("Invalid");
        }
    }

    public static boolean checkForValidParantheses(String input) {
        Stack<Character> stack = new Stack<>();

        char[] inputArray = input.toCharArray();

        for (char c : inputArray) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char popCharOnTop = stack.pop();
                    if (popCharOnTop != '(') {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}
