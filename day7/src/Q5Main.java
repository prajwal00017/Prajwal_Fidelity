public class Q5Main {
    public static void main(String[] args) {
        Q5LinkedList linkedList = new Q5LinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("Original Linked List:");
        linkedList.display();

        linkedList.reverse();

        System.out.println("Reversed Linked List:");
        linkedList.display();
    }
}