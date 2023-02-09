package question5;

import question5.LinkedListImp;
import question5.SinglyLinkedListNode;

public class Main {

    public static void main(String[] args) {
        question5.SinglyLinkedListNode head = null;
        head = LinkedListImp.insertNodeAtTail(head, 1);
        head = LinkedListImp.insertNodeAtTail(head, 2);
        head = LinkedListImp.insertNodeAtTail(head, 3);
        head = LinkedListImp.insertNodeAtTail(head, 4);

        head = LinkedListImp.deleteNode(head, 2);

        // Print the linked list
        SinglyLinkedListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

}
