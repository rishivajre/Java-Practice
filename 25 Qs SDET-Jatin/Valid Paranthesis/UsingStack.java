import java.util.Stack;

public class UsingStack {
    // ✅ Problem: Check if the Parentheses are Balanced (Valid Parentheses)

    public static void main(String[] args) {
        String input = "(poi)p)";  // Input string with parentheses

        // Call the validation method and print result
        if (CheckParantheses(input)) {
            System.out.println("Valid Parantheses");
        } else {
            System.out.println("Invalid Parantheses");
        }
    }

    // ✅ Method to check balanced parentheses using Stack (LIFO)
    public static boolean CheckParantheses(String input) {

        Stack<Character> stack = new Stack<>(); // Stack to store opening brackets
        char[] inputArray = input.toCharArray(); // Convert input to char array

        for (char c : inputArray) {
            if (c == '(') {
                stack.push(c); // Push opening bracket to stack
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket → invalid
                } else {
                    char popTopChar = stack.pop(); // Pop the last opened bracket
                    if (popTopChar != '(') {
                        return false; // (Optional for this case) Non-matching pair
                    }
                }
            }
            // Ignore non-parenthesis characters
        }

        // Return true only if all opened brackets are closed
        return stack.isEmpty(); // Stack should be empty if valid
    }
}
