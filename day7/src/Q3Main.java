public class Q3Main {
    public static void main(String[] args) {
        Q3LinkedList linkedList = new Q3LinkedList();

        linkedList.insertAtPosition(1, 13);
        linkedList.insertAtPosition(2, 7);
        linkedList.insertAtPosition(3, 16);

        System.out.println("Final Linked List:");
        linkedList.display();
    }
}