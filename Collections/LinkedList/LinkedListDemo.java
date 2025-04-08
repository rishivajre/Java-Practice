

class Node {
    int data; // Value jo node mein store hogi, Data store kane ke liye 
    Node next; // Next node ka reference, Next node ka reference store karne ke liye

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
            System.out.print(current.data + " -> " ); // Print current node ka data
            current = current.next; // Current ko next node par le jao
        }
        System.out.println("null"); // Last mein null print karo
    }
    
    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo();
        list.append(5);
        list.append(19);
        list.append(15);
        list.display(); // to display list
    }
}




/** 🤔 Why Do We Initialize Node and Data Manually in Linked List?
Your confusion is valid: "ArrayList mein toh hum add() bolte hain aur kaam ho jata hai, yahan Node aur data kyun banane padte hain?" Let’s break it down logically.

Linked List: A Raw, Custom Structure
What’s Happening?: Linked List ek "do-it-yourself" data structure hai. Tum khud nodes banate ho aur unko link karte ho using pointers (next). Java ke pre-built classes (ArrayList, HashMap, Set) ke andar yeh kaam already implemented hai—tumhe bas methods call karne hote hain.
Why Manual?: Kyunki yahan hum low-level control le rahe hain. Har node ek independent object hai jo memory mein alag-alag jagah banta hai, aur humein khud batana padta hai: "Yeh node ka data kya hai? Iska next kahan point karega?"
Compare with ArrayList, HashMap, Set
ArrayList:
Internally ek dynamic array hai (continuous memory).
add(5) bolne se woh array ke end mein 5 daal deta hai, resizing khud handle karta hai.
Tumhe nodes ya pointers ke baare mein sochna nahi padta—sab hidden hai.
HashMap:
Key-value pairs ko hash table mein store karta hai.
put("key", 5) se woh internally hashing karta hai aur memory allocate karta hai—tumhe structure nahi banani padti.
Set:
Duplicate values hata deta hai using internal logic (e.g., HashSet uses HashMap).
Tum bas add(5) bolte ho, baaki kaam Java karta hai.
Linked List:
Tum khud bolte ho: "Ek node banao, isme 5 rakho, aur next ko null rakho." Phir doosra node banao aur pehle wale se link karo.
Yeh raw hai—no pre-built magic! Isliye Node class aur data manually define karna padta hai.
Key Difference: Pre-built classes mein logic encapsulated hai—Linked List mein tum architect ho, har step tum define karte ho! 🛠️ */