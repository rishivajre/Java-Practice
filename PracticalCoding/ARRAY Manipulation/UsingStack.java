import java.util.Arrays;
import java.util.Stack;

public class UsingStack {   // reverse the array Using Stack
    public void reverseArray (int[] arr) {
        if (arr == null) return;

        Stack<Integer> stack = new Stack<>();
        for (int num : arr) stack.push(num);
        for (int i=0; i<arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        UsingStack reverse  = new UsingStack();
        reverse.reverseArray(arr); // call the method
        System.out.println("Reversed: " + Arrays.toString(arr));
    }
}
