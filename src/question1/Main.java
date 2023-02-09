package question1;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedListNode head = new SinglyLinkedListNode(1);
        SinglyLinkedListNode second = new SinglyLinkedListNode(2);
        SinglyLinkedListNode third = new SinglyLinkedListNode(3);
        SinglyLinkedListNode fourth = new SinglyLinkedListNode(4);
        SinglyLinkedListNode fifth = new SinglyLinkedListNode(5);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        Solution.printLinkedList(head);
    }

}
