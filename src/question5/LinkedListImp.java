package question5;

public class LinkedListImp {
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            SinglyLinkedListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return head;
    }

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if (head == null) {
            return null;
        }

        if (position == 0) {
            return head.next;
        }

        SinglyLinkedListNode current = head;
        int index = 0;

        while (index < position - 1 && current.next != null) {
            current = current.next;
            index++;
        }

        if (index != position - 1) {
            return head;
        }

        current.next = current.next.next;

        return head;
    }

}
