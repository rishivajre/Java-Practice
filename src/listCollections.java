import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class listCollections {
    public static void main(String[] args) {
// List is an interface that extends Collection. It is an ordered collection of elements and allows duplicate elements..
// List implementations: ArrayList, LinkedList, Vector
// Array have fixed size, whereas List can grow dynamically.
// ArrayList: It is a resizable array. It is better to use when we have more search operations.
// you can access, insert and search elements in ArrayList in constant time.


        // ArrayList example
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);

        // LinkedList example
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Frog");
        System.out.println("LinkedList: " + linkedList);

        // Vector example
        List<String> vector = new Vector<>();
        vector.add("Giraffe");
        vector.add("Hippo");
        vector.add("Iguana");
        System.out.println("Vector: " + vector);

        // ArrayList with Integer example
        List<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(1);
        intArrayList.add(2);
        intArrayList.add(3);
        System.out.println("Integer ArrayList: " + intArrayList);

        // LinkedList with Integer example
        List<Integer> intLinkedList = new LinkedList<>();
        intLinkedList.add(4);
        intLinkedList.add(5);
        intLinkedList.add(6);
        System.out.println("Integer LinkedList: " + intLinkedList);

        // Vector with Integer example
        List<Integer> intVector = new Vector<>();
        intVector.add(7);
        intVector.add(8);
        intVector.add(9);
        System.out.println("Integer Vector: " + intVector);
    }
}
/* Here are some tricky questions related to the List collection in Java that might be asked in SDET (Software Development Engineer in Test) interviews:

Questions:
What is the difference between ArrayList and LinkedList?

ArrayList is backed by a dynamic array, while LinkedList is backed by a doubly linked list. ArrayList provides fast random access but slow insertions and deletions (except at the end), whereas LinkedList provides fast insertions and deletions but slow random access.
How does ArrayList grow dynamically?

When the internal array of an ArrayList becomes full, a new array is created with a larger capacity (typically 1.5 times the old capacity), and the old elements are copied to the new array.
What is the difference between ArrayList and Vector?

Both ArrayList and Vector are backed by dynamic arrays, but Vector is synchronized, making it thread-safe, whereas ArrayList is not synchronized. Vector also grows by doubling its size, while ArrayList grows by 50%.

How do you convert an ArrayList to an array?
You can use the toArray method of ArrayList to convert it to an array. For example:
List<String> list = new ArrayList<>();
list.add("A");
list.add("B");
String[] array = list.toArray(new String[0]);


How do you remove duplicates from a List?

You can use a Set to remove duplicates from a List:
List<String> list = new ArrayList<>(Arrays.asList("A", "B", "A", "C"));
Set<String> set = new HashSet<>(list);
list.clear();
list.addAll(set);

What is the difference between List and Set?

List allows duplicate elements and maintains the insertion order, while Set does not allow duplicate elements and does not guarantee any specific order.
How do you synchronize an ArrayList?

You can use Collections.synchronizedList to synchronize an ArrayList:
List<String> list = new ArrayList<>();
List<String> synchronizedList = Collections.synchronizedList(list);

What is the time complexity of common operations in ArrayList and LinkedList?

ArrayList: get - O(1), add - O(1) (amortized), remove - O(n)
LinkedList: get - O(n), add - O(1), remove - O(1)

How do you iterate over a List?

You can iterate over a List using a for loop, an enhanced for loop, an iterator, or a stream:
List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
// For loop
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
// Enhanced for loop
for (String s : list) {
    System.out.println(s);
}
// Iterator
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
// Stream
list.stream().forEach(System.out::println);

What happens if you modify a List while iterating over it?

If you modify a List while iterating over it using a for loop or an enhanced for loop, you may encounter a ConcurrentModificationException. To avoid this, use an Iterator and its remove method.
Example Code:
import java.util.*;

public class ListCollections {
    public static void main(String[] args) {
        // LinkedList example
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Frog");
        System.out.println("LinkedList: " + linkedList);

        // Vector example
        List<String> vector = new Vector<>();
        vector.add("Giraffe");
        vector.add("Hippo");
        vector.add("Iguana");
        System.out.println("Vector: " + vector);

        // ArrayList with Integer example
        List<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(1);
        intArrayList.add(2);
        intArrayList.add(3);
        System.out.println("Integer ArrayList: " + intArrayList);

        // Removing duplicates from a List
        List<String> listWithDuplicates = new ArrayList<>(Arrays.asList("A", "B", "A", "C"));
        Set<String> set = new HashSet<>(listWithDuplicates);
        listWithDuplicates.clear();
        listWithDuplicates.addAll(set);
        System.out.println("List without duplicates: " + listWithDuplicates);

        // Synchronizing an ArrayList
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>(Arrays.asList("A", "B", "C")));
        synchronized (synchronizedList) {
            for (String s : synchronizedList) {
                System.out.println(s);
            }
        }
    }
}
    
These questions and examples test a candidate's understanding of the List collection in Java, including its various implementations, behaviors, and best practices. */