package question3;

public class LinkedListImp {

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
}
