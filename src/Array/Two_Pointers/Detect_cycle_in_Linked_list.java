package Array.Two_Pointers;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class Detect_cycle_in_Linked_list {
    public static boolean hasCycle(ListNode head){
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;      // move by 1
            fast = fast.next.next; // move by 2

            if (slow == fast) return true; // cycle detected
        }
        return false; // no cycle
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head.next.next.next.next.next = head.next.next;

        // Test
        if (hasCycle(head)) {
            System.out.println("Cycle detected in linked list ✅");
        } else {
            System.out.println("No cycle in linked list ❌");
        }
    }
}
