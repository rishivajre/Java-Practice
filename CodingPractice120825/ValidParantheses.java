import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        String input = "(()()))";
        if (CheckValidPara(input)) {
            System.out.println("Valid Parantheses");
        } else {
            System.out.println("NOT VALID PARA!!");
        }
    }

    public static boolean CheckValidPara(String input) {
        Stack<Character> stack = new Stack<>();
        char[] inpuArray = input.toCharArray();

        for (char c : inpuArray) {
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
