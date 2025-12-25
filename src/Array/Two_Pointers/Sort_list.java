package Array.Two_Pointers;

 class Listnode {
      int val;
      Listnode next;
      Listnode() {}
      Listnode(int val) { this.val = val; }
      Listnode(int val, Listnode next) { this.val = val; this.next = next; }
  }

public class Sort_list {

    public static Listnode sortList(Listnode head) {
        if (head == null || head.next == null) return head;

        Listnode mid = getMiddle(head);
        Listnode rightHead = mid.next;
        mid.next = null; // break the list into two parts

        // sort each half
        Listnode left = sortList(head);
        Listnode right = sortList(rightHead);

        // merge two sorted halves
        return mergeTwoLists(left, right);
    }

    private static Listnode getMiddle(Listnode head) {
        Listnode slow = head;
        Listnode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow is the middle node
    }

    private static Listnode mergeTwoLists(Listnode l1, Listnode l2) {
        Listnode dummy = new Listnode(0);
        Listnode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        // Attach the remaining part (only one of them is non-null)
        if (l1 != null) tail.next = l1;
        else tail.next = l2;

        return dummy.next;
    }

    static void main(String[] args) {

    }
}
