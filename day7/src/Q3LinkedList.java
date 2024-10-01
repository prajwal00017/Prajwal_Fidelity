class Q3LinkedList {
    private Q3Node head;

    public Q3LinkedList() {
        head = null;
    }

    public void insertAtPosition(int position, int data) {
        Q3Node newNode = new Q3Node(data);

        if (position < 1) {
            System.out.println("Invalid position!");
            return;
        }

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Q3Node current = head;

        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position exceeds the length of the list. Inserting at end.");
        }

        newNode.next = current.next;
        if (current != null) {
            current.next = newNode;
        } else {
            head = newNode;
        }
    }

    public void display() {
        Q3Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}