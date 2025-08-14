import java.util.Stack;

public class UsingStack {
    public static void main(String[] args) {
        String str1 = "SuperMan";
        // call the function
        System.out.println(str1 + " <- Reverse -> "+ ReverseStringUsingStack(str1));
      
        String str2 = "Hello World";   
        // call the function
        System.out.println(str2 + " <- Reverse -> "+ ReverseStringUsingStack(str2));
    }

    public static String ReverseStringUsingStack(String input) {
        char[] reverseString = new char[input.length()];
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<input.length(); i++) {
            stack.push(input.charAt(i)); // push the character into the stack
        }
        // pop chars from stack till gets empty
        int i=0;
        while (!stack.isEmpty()) {
            
            reverseString[i++] = stack.pop();
        }

        return new String(reverseString);
    }
}
