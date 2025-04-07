import java.util.*;

class Node {
    int data; // Data store kane ke liye 
    Node next; // Next node ka reference store karne ke liye

    Node(int data) { // Constructor to initialize the node with data
        this.data = data; // Data ko set karne ke liye
        this.next = null; // Initially, next is set to null & then it will be set to the next node
    }
    
}

public class LinkedListDemo {
    Node head; // Head node ka reference

    // Add node at the end (append) : Last insertion
    public void append(int data) { // Method to add a new node at the end of the list
        Node newNode = new Node(data); // New node create karte hain
        if (head == null) { // Agar list khali hai
            head = newNode; // Head ko new node se start karo
            return;            
        }
        Node current = head; // Current node ko head se start karo
        while (current.next != null) { // Jab tak current node ka next null nahi hai
            current = current.next; // Current ko next node par le jao
        }
        current.next = newNode; // Current node ka next new node se set karo
    }

    // Display list
    public void display() {
        Node current = head; // current node ko head se start karo
        while (current != null) { // Jab tak current node null nahi hai
            System.out.println(current.data + " ➡️ " ); // Print current node ka data
            current = current.next; // Current ko next node par le jao
        }
        System.out.println("null"); // Last mein null print karo
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(19);
        list.append(15);
        list.display(); // 
    }
}
