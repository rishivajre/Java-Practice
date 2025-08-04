import java.util.Stack;

public class Stack101 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(); // "new" keyword --> Heap memory (arrays, objects, arraylist, linkedlist, set, hashMap, Stack)
        stack.push("Apple");
        System.out.println(stack);
        // push, pop, peek methods examples
        stack.push("Banana");
        System.out.println(stack);
        stack.push("Cherry");
        System.out.println(stack);
        String topElement = stack.peek(); // Get the top element without removing it
        System.out.println("Top Element: " + topElement);
        String removedElement = stack.pop();
        System.out.println("Removed Element: " + removedElement);
        System.out.println("Stack after pop: " + stack);

        // Example of checking if the stack is empty
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }

        // Example of checking the size of the stack
        System.out.println("Stack size: " + stack.size());
        // Example of iterating through the stack
        System.out.println("Iterating through stack:"); 
        for (String item : stack) {
            System.out.println(item);
        }
        // Example of searching the stack
        int position = stack.search("Banana"); // Returns 1-based index from the top
        if (position != -1) {
            System.out.println("Banana found at position: " + position);
        } else {
            System.out.println("Banana not found in the stack");
        }
    }
}
