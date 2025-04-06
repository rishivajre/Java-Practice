import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(10);
        num.add(2);
        num.add(8);
        num.add(1);
        num.add(3);
        num.add(4);

        Collections.sort(num); // Sorts the ArrayList in ascending order
        System.out.println("Sorted ArrayList: " + num); // Output: Sorted ArrayList: [1, 2, 3, 4, 5, 8, 10]
        System.out.println("--------------------");

        List<String> str = new ArrayList<>();
        str.add("Mango");
        str.add("Apple");   
        str.add("Banana");
        str.add("Grapes");
        str.add("Orange");

        Collections.reverse(str); // Reverses the order of the elements in the list
        System.out.println("Reversed list: " + str); // Output: Reversed list: [Orange, Grapes, Banana, Apple, Mango]

        
    }
}
