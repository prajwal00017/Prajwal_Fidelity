class Q2LinkedList {
    private Q2Node head;

    public Q2LinkedList() {
        head = null;
    }

    public void insertAtHead(int data) {
        Q2Node newNode = new Q2Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Q2Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}