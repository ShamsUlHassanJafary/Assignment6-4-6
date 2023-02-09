package question3;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedListNode head = null;
        head = LinkedListImp.insertNodeAtHead(head, 3);
        head = LinkedListImp.insertNodeAtHead(head, 2);
        head = LinkedListImp.insertNodeAtHead(head, 1);

        // Print the linked list
        SinglyLinkedListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
