package Cognizant_Coding_Questions;

// Node class
class Node{
    int data;
    Node next;

    // constructor
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

// linked list class
public class ReverseLinkedList {
    Node head; // Head of the class

    // Function to print the linked list

    // Function to add a node at the end
    public void append(int data){
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Function to reverse the linked list
    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null){
            next = curr.next;   // Save next node
            curr.next = prev;   // Reverse the link
            prev = curr;        // Move prev one step forward
            curr = next;        // Move current one step forward
        }
        head = prev; // Update head to the new first node
    }
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        System.out.println("Original Linked List:");
        list.printList();  // 1 -> 2 -> 3 -> 4 -> null

        list.reverse();

        System.out.println("Reversed Linked List:");
        list.printList();  // 4 -> 3 -> 2 -> 1 -> null
    }
}
