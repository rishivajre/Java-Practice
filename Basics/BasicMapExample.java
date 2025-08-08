import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class BasicMapExample {
    public static void main(String[] args) {
        // A Map stores elements as key-value pairs.
        // - Keys in a Map must be unique (no duplicates are allowed).
        // - Values can be duplicate (no restriction on duplication).
        // - Only one null key is allowed (in implementations like HashMap), 
        //   but multiple null values are permitted depending on the Map type.

        // HashMap example: 
        // - Does not maintain the insertion order of elements.
        // - Allows one null key and multiple null values.
        // - Replacing a duplicate key overwrites the previous value.
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Apple");
        hashMap.put(3, "Banana");
        hashMap.put(2, "Cherry");
        hashMap.put(2, "Apricot"); // Duplicate key, "Cherry" will be replaced with "Apricot".
        System.out.println("HashMap: " + hashMap);

        // LinkedHashMap example:
        // - Maintains the insertion order of elements.
        // - Allows one null key and multiple null values.
        // - Replacing a duplicate key still maintains the insertion order.
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "Dog");
        linkedHashMap.put(4, "Elephant");
        linkedHashMap.put(3, "Frog");
        linkedHashMap.put(4, "Duck"); // Duplicate key, "Elephant" will be replaced with "Duck".
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // TreeMap example:
        // - Maintains the natural order of keys (ascending by default).
        // - Does not allow null keys (throws NullPointerException if a null key is inserted).
        // - Values can still be null.
        // - Uses the natural ordering of keys or a custom Comparator if provided.
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(2, "Giraffe");
        treeMap.put(1, "Hippo");
        treeMap.put(3, "Iguana");
        System.out.println("TreeMap: " + treeMap);
    }
}
