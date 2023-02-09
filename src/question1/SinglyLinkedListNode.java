package question1;

public class SinglyLinkedListNode {
    int data;
    static  int numberOfInstances = 0;
    SinglyLinkedListNode next;

    SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
        numberOfInstances++;
    }
}
