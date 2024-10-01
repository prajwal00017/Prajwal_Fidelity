public class Q1Main {
    public static void main(String[] args) {
        // Sample Input
        int n = 5;  // Size of linked list
        int[] dataValues = {141, 302, 164, 530, 474};  // Linked list data values

        // Create a linked list and insert nodes
        Q1LinkedList linkedList = new Q1LinkedList();

        for (int value : dataValues) {
            linkedList.insertAtTail(value);
        }

        // Display the final linked list
        linkedList.display();
    }
}