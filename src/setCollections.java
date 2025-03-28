import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class setCollections {
    public static void main(String[] args) {
        // Set is an interface that extends Collection. It is an unordered collection of elements 
        //& does not allow duplicate elements/values.

        // Set implementations: 1.HashSet 2.LinkedHashSet 3.TreeSet
// HashSet: It is an unordered collection. It is better to use when we do not care about the order of elements.
// LinkedHashSet: It maintains the insertion order, but it is slower than HashSet, as it maintains a doubly linked list.
// TreeSet: It maintains a sorted order of elements. It is slower than HashSet and LinkedHashSet because it maintains a balanced tree structure.

        // HashSet example
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple"); // Duplicate element, will not be added
        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet example
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Dog");
        linkedHashSet.add("Elephant");
        linkedHashSet.add("Frog");
        linkedHashSet.add("Dog"); // Duplicate element, will not be added
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet example
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Giraffe");
        treeSet.add("Hippo");
        treeSet.add("Iguana");
        treeSet.add("Giraffe"); // Duplicate element, will not be added
        System.out.println("TreeSet: " + treeSet);

        /* Explanation:
HashSet: An unordered collection that does not allow duplicate elements.
LinkedHashSet: Maintains the insertion order and does not allow duplicate elements.
TreeSet: Maintains a sorted order of elements and does not allow duplicate elements.*/
    
        /* Tricky Interview Questions Related to Set:
What is the difference between HashSet, LinkedHashSet, and TreeSet?

HashSet is an unordered collection and does not maintain any order.
LinkedHashSet maintains the insertion order.
TreeSet maintains a sorted order of elements.

How does HashSet ensure uniqueness of elements?

HashSet uses a HashMap internally to store elements. It uses the hashCode and equals methods to ensure that no duplicate elements are added.

What is the time complexity of common operations in HashSet, LinkedHashSet, and TreeSet?

HashSet: add, remove, contains - O(1) on average
LinkedHashSet: add, remove, contains - O(1) on average
TreeSet: add, remove, contains - O(log n)

Can you store null values in a Set?

HashSet and LinkedHashSet allow one null value.
TreeSet does not allow null values because it uses natural ordering or a comparator, which cannot compare null.

How do you remove duplicates from a List using a Set?

You can use a Set to remove duplicates from a List:
*/
List<String> listWithDuplicates = new ArrayList<>(Arrays.asList("A", "B", "A", "C"));
Set<String> set = new HashSet<>(listWithDuplicates);
listWithDuplicates.clear();
listWithDuplicates.addAll(set);
System.out.println("List without duplicates: " + listWithDuplicates);

/* What happens if you try to add a duplicate element to a Set?

The Set will ignore the duplicate element and will not add it.

How does TreeSet maintain the order of elements?

TreeSet uses a TreeMap internally, which is a Red-Black tree. It maintains the order of elements based on their natural ordering or a provided comparator.

Can you synchronize a Set?

Yes, you can synchronize a Set using Collections.synchronizedSet:
*/
Set<String> synchronizedSet = Collections.synchronizedSet(new HashSet<>(Arrays.asList("A", "B", "C")));
synchronized (synchronizedSet) {
    for (String s : synchronizedSet) {
        System.out.println(s);
    }
}

/* These questions and examples test a candidate's understanding of the Set collection in Java, including its various implementations, behaviors, and best practices.*/

}
}