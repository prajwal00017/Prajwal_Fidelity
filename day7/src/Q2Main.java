public class Q2Main {
    public static void main(String[] args) {
        int n = 5;
        int[] dataValues = {383, 484, 392, 975, 321};

        Q2LinkedList linkedList = new Q2LinkedList();

        for (int value : dataValues) {
            linkedList.insertAtHead(value);
            linkedList.display();
        }

        System.out.println("Final Linked List:");
        linkedList.display();
    }
}