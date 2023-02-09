package question2;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedListNode head = null;
        head = LinkedListImp.insertNodeAtTail(head, 1);
        head = LinkedListImp.insertNodeAtTail(head, 2);
        head = LinkedListImp.insertNodeAtTail(head, 3);
        head = LinkedListImp.insertNodeAtTail(head, 4);

        // Print the linked list
        SinglyLinkedListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

}
