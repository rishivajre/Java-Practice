import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) { this.val = val; }
}
    // Find LList Mid via Counting & Traversing
public class viaCounting {
    public ListNode findMiddle(ListNode head) {
        if (head == null ) return null;
        int count =0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        current = head;
        for (int i=0; i<count/2; i++) {
            current = current.next;
        }
        return current;
    }
    // utility to create Linked List from an Array
    private ListNode createList(int[] values) {
        if (values.length == 0) return null;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    //Utility to print LinkedList
    private void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        viaCounting solution = new viaCounting();
        // Test01: Odd length list
        int[] values1 = {1,2,3,4,5};

        ListNode list1 = solution.createList(values1);
        System.out.println("Test01: Odd-Length list");
        System.out.print("Input: ");
        solution.printList(list1);
        
        ListNode middle1 = solution.findMiddle(list1);
        System.out.println("Mid: " + (middle1 != null ? middle1.val: "null"));
    }
    
}
