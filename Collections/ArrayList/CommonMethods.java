import java.util.*;

public class CommonMethods {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        // add(index, element) - Inserts the specified element at the specified position in this list.
        fruits.add(1, "Cherry"); // Inserts "Cherry" at index 1
        // get(index) - Returns the element at the specified position in this list.
        System.out.println("2nd fruit: " + fruits.get(1)); // Output: 2nd fruit: Cherry

        // set(index, element) - Replaces the element at the specified position in this list with the specified element.
        fruits.set(1, "Grapes"); // Replaces "Cherry" with "Grapes"

        // remove(index) - Removes the element at the specified position in this list.
        fruits.remove(2); // Removes the element at index 2 (Grapes)

        //size() - Returns the number of elements in this list.
        System.out.println("Total fruits: " + fruits.size()); // Output: Total fruits: 3;
    
        // contains(element) - Returns true if this list contains the specified element.
        System.out.println("Contains Apple: " + fruits.contains("Apple")); // Output: Contains Apple: true

        // isEmpty() - Returns true if this list contains no elements.
        System.out.println("Empty? " + fruits.isEmpty()); // Output: Empty? false

        //lopping through the ArrayList
        for (String fruit : fruits) {
            System.out.println(fruit); // Output: Apple, Banana, Grapes
        }
    }
}
