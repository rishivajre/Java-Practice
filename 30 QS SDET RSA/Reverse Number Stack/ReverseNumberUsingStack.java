import java.util.Stack;

public class ReverseNumberUsingStack {
    public static long reverseNum(int num) {
        Stack<Integer> stack = new Stack<>();
        String s = Integer.toString(Math.abs(num));

        // Push MSF first so pop returns LSF first
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i) - '0');
        }

        long reverse = 0;
        while (!stack.isEmpty()) {
            reverse = reverse * 10 + stack.pop();  // now this builds the reverse
        }

        return num < 0 ? -reverse : reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverseNum(789));   // 987
        System.out.println(reverseNum(1200));  // 21
        System.out.println(reverseNum(-456));  // -654
    }
}
