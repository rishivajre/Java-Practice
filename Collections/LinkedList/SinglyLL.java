/** Q1: Implement a Singly Linked List with append, insertAtStart, and display.
Problem: Ek Singly Linked List banao jisme nodes end mein add ho (append), 
start mein add ho (insertAtStart), aur list print ho (display). */

class Node {
    int data;       // Node ka data/value
    Node next;      // Agle node ka pointer

    Node(int data) {
        this.data = data;   // Data set karo
        this.next = null;   // Next null rakho at the start
    }
}


public class SinglyLL {
    Node head;  // List ka pehla node

    //Append: End mein node add karo
    public void append(int data) {
        Node newNode = new Node(data);  // Naya node banao
        if (head == null) {     // agar list khali hai to
            head = newNode;     // Head ko naya node banao
            return;             
        }
        Node current = head;     // Head se shuru karo
        while (current.next != null) {  // Jab tak end nahi milta
            current = current.next;     // tab tak aage badhte raho
        }
        current.next = newNode; // Last node me naya node jod do [final step of insering at the end]
    }

    // InsertAtStart: Shuru mein node add karo
    public void insertAtStart(int data) {
        Node newNode = new Node(data);  // Naya node banao
        newNode.next = head;    // Naya node ka next purana head ko point karega
        head = newNode;     // head ko naya node banao
    }

    // Display: List print karo
    public void display() {
        Node current = head;         // Head se shuru karo
        while (current != null) {      // Jab tak node hai and null nahi hota
            System.out.print(current.data + " -> "); // Data print karo
            current = current.next;  // Agle node par jao
        }
        System.out.println("null"); // End me null dikhao
    }

    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();
        list.append(98);
        list.append(88);
        list.append(33);
        list.insertAtStart(001);
        list.display();
    }


}


/** 
 * Step-by-Step Dry Run:

Start: head = null (list khali hai).
append(5):
newNode = [5 | null]
head == null, so head = [5 | null].
append(10):
newNode = [10 | null]
current = head = [5 | null]
current.next == null, so current.next = [10 | null]
List: [5 | *] -> [10 | null].
insertAtStart(2):
newNode = [2 | null]
newNode.next = head (head = [5 | *] -> [10 | null])
head = newNode
List: [2 | *] -> [5 | *] -> [10 | null].
Key Details:

append: Last tak jao, naya node jodo—O(n) time.
insertAtStart: Head ko replace karo—O(1) time.
Edge case: Khali list mein append aur insertAtStart same kaam karte hain!
 */