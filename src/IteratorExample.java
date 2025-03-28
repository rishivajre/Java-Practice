import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        // Using Iterator with ArrayList
        List<String> arrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        Iterator<String> arrayListIterator = arrayList.iterator();
        System.out.println("ArrayList elements:");
        while (arrayListIterator.hasNext()) {
            System.out.println(arrayListIterator.next());
        }

        // Using Iterator with HashSet
        Set<String> hashSet = new HashSet<>(Arrays.asList("Dog", "Elephant", "Frog"));
        Iterator<String> hashSetIterator = hashSet.iterator();
        System.out.println("\nHashSet elements:");
        while (hashSetIterator.hasNext()) {
            System.out.println(hashSetIterator.next());
        }

        // Using Iterator with TreeSet
        Set<String> treeSet = new TreeSet<>(Arrays.asList("Giraffe", "Hippo", "Iguana"));
        Iterator<String> treeSetIterator = treeSet.iterator();
        System.out.println("\nTreeSet elements:");
        while (treeSetIterator.hasNext()) {
            System.out.println(treeSetIterator.next());
        }

        // Using Iterator with LinkedList
        List<String> linkedList = new LinkedList<>(Arrays.asList("Jaguar", "Kangaroo", "Lion"));
        Iterator<String> linkedListIterator = linkedList.iterator();
        System.out.println("\nLinkedList elements:");
        while (linkedListIterator.hasNext()) {
            System.out.println(linkedListIterator.next());
        }

        // Using Iterator with Vector
        List<String> vector = new Vector<>(Arrays.asList("Monkey", "Nightingale", "Owl"));
        Iterator<String> vectorIterator = vector.iterator();
        System.out.println("\nVector elements:");
        while (vectorIterator.hasNext()) {
            System.out.println(vectorIterator.next());
        }
    }
}

/*Explanation:
ArrayList: Demonstrates using an Iterator to traverse an ArrayList.
HashSet: Demonstrates using an Iterator to traverse a HashSet.
TreeSet: Demonstrates using an Iterator to traverse a TreeSet.
LinkedList: Demonstrates using an Iterator to traverse a LinkedList.
Vector: Demonstrates using an Iterator to traverse a Vector.
Tricky Interview Questions Related to Iterator:
What is the difference between Iterator and ListIterator?

Iterator can be used to traverse elements in a forward direction only, while ListIterator can traverse elements in both forward and backward directions. ListIterator is only available for List implementations.
Can you remove elements from a collection while iterating using an Iterator?

Yes, you can remove elements from a collection while iterating using an Iterator by calling the remove method of the Iterator. However, you should not modify the collection directly (e.g., by calling remove on the collection) while iterating, as this will cause a ConcurrentModificationException.
What is the difference between Iterator and Enumeration?

Iterator is part of the Java Collections Framework and provides methods to traverse and remove elements from a collection. Enumeration is a legacy interface that only provides methods to traverse elements. Iterator is preferred over Enumeration for modern Java applications.
What happens if you call next on an Iterator when there are no more elements?

If you call next on an Iterator when there are no more elements, it will throw a NoSuchElementException.
How do you synchronize an Iterator?

You can synchronize an Iterator by synchronizing the block of code that uses the Iterator:

List<String> list = Collections.synchronizedList(new ArrayList<>(Arrays.asList("A", "B", "C")));
synchronized (list) {
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }
}



Can you use an Iterator with a Map?

You cannot directly use an Iterator with a Map, but you can obtain an Iterator for the Map's key set, value collection, or entry set:
Map<String, String> map = new HashMap<>();
map.put("key1", "value1");
map.put("key2", "value2");

Iterator<String> keyIterator = map.keySet().iterator();
while (keyIterator.hasNext()) {
    System.out.println(keyIterator.next());
}

Iterator<String> valueIterator = map.values().iterator();
while (valueIterator.hasNext()) {
    System.out.println(valueIterator.next());
}

Iterator<Map.Entry<String, String>> entryIterator = map.entrySet().iterator();
while (entryIterator.hasNext()) {
    Map.Entry<String, String> entry = entryIterator.next();
    System.out.println(entry.getKey() + ": " + entry.getValue());
}

These questions and examples test a candidate's understanding of the Iterator interface in Java, including its usage, behaviors, and best practices.

Similar code found with 1 license type - View matches */