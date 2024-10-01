class Q5LinkedList {
    private Q5Node head;

    public Q5LinkedList() {
        head = null;
    }

    public void add(int data) {
        Q5Node newNode = new Q5Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Q5Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void reverse() {
        Q5Node prev = null;
        Q5Node current = head;
        Q5Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void display() {
        Q5Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}