import java.util.*;

public class CloneNClear {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        // Adding elements to the ArrayList

        List<String> cloneList = (ArrayList<String>) list.clone(); // 🤖 Cloning the ArrayList 🤖 
        // why?: to create a new object with the same elements & properties as the original list
        // ... this is a shallow copy, meaning that the elements are copied by reference, not by value.
        // Useful when you want to create a backup of the original list or when you want to manipulate the clone without affecting the original.

        cloneList.add("Papaya"); // Adding an element to the cloned list 
        System.out.println("Original List: " + list); // Output: Original List: [Apple, Banana, Cherry, Date]
        System.out.println("Cloned List: " + cloneList); // Output: Cloned List: [Apple, Banana, Cherry, Date, Papaya]

        cloneList.clear(); // 🗑️ Clearing the cloned list 🚮
        System.out.println("After clearing the cloned list:"); // Output: After clearing the cloned list:
        System.out.println("Original List: " + list); // Output: Original List: [Apple, Banana, Cherry, Date]   
        System.out.println("Cloned List: " + cloneList); // Output: Cloned List: []
    }
}
