class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val =val;
    }
}
    
public class MiddleNode {
    public static ListNode findMiddle(ListNode head) {
        if (head == null) return null;
        int count = 0;
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

    public static void main(String[] args) {
        MiddleNode mN = new MiddleNode();
        mN.findMiddle(50);
    }
}
