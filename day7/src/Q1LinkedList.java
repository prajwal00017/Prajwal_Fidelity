class Q1LinkedList {
    Q1Node head;

    // Method to insert a new node at the tail
    public void insertAtTail(int data) {
        Q1Node newNode = new Q1Node(data);
        if (head == null) {  // If the list is empty
            head = newNode;
        } else {
            Q1Node current = head;
            while (current.next != null) {  // Traverse to the last node
                current = current.next;
            }
            current.next = newNode;  // Link the new node at the end
        }
    }

    // Method to display the linked list
    public void display() {
        Q1Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}