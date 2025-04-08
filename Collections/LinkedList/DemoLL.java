class Node {
    int data; // Node ka data (jo value store karna hai)
    Node next; // Next node ka reference (pointer)

    Node (int data) { 
        this.data = data; // Data set in constructor
        this.next = null; // Shuru me next null hai (end of list)
    }
}

public class DemoLL {
    Node head; // list ka pehla node (starting point)

    // Naya node end me add karne ka method
    public void append (int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;        //Temporary pointer head se shuru karo
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode; // Last node ke next me naya node jodo
    }

    // List display karne ke liye method
    public void display() {
        Node current = head;    // head se shuru karo
        while (current != null) {
            System.out.print(current.data + " -> "); // Data print karo with ->
            current = current.next;     // Agle node pe jao
        }
        System.out.println("null");     // ENd me null dikhao
    }

    public static void main(String[] args) {
        DemoLL list = new DemoLL();     // New linked list banao
        list.append(10); 
        list.append(88);
        list.append(99);
        list.display();     //List print karo
    }


}
