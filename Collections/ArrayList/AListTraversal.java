import java.util.*;

public class AListTraversal {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        //1. For-each loop traversal
        for (String fruit : list) {
            System.out.print(fruit + " "); // Output: Apple, Banana, Cherry
        }
        System.out.println("\n"); // For better readability

        //2. Traditional for loop traversal
        for (int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " "); // Output: Apple, Banana, Cherry
        } System.out.println("\n");

        //3. Using Iterator
        Collections.reverse(list); // Reversing the list for demonstration
        Iterator<String> it = list.iterator(); // Creating a new ArrayList to avoid ConcurrentModificationException
        while (it.hasNext()) {
            System.out.print(it.next() + " "); // Output: Apple, Banana, Cherry
        }
    }
}
