import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        String input = "(psdfij())";

        if (CheckParantheses(input)) {
            System.out.println("Valid Parantheses");
        } else {
            System.out.println("Parantheses are not balanced");
        }
    }

    public static boolean CheckParantheses(String input) {
        Stack<Character> stack = new Stack<>();
        char[] inputArray = input.toCharArray();

        for (char c : inputArray) {
            if (c == '(') {
                stack.push(c);
            } 
            else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char topChar = stack.pop();
                    if (topChar != '('){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
