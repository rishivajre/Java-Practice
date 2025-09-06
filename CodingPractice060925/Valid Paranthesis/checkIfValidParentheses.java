import java.util.Stack;

public class checkIfValidParentheses {
    public static void main(String[] args) {
        String input = "()()sdfkh)";
        if (checkValidParentheses(input)) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Invalid Parentheses");
        }
    }

    public static boolean checkValidParentheses(String input) {
        Stack<Character> stack = new Stack<>();
        char[] inputArray = input.toLowerCase().toCharArray();

        for (char c : inputArray) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char popTopChar = stack.pop();
                    if (popTopChar != '(') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
