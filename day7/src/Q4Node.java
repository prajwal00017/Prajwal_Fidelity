class Q4Node {
    int data;
    Q4Node left;
    Q4Node right;

    Q4Node(int d) {
        data = d;
        left = null;
        right = null;
    }
    void preOrder(Q4Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preOrder(root.left);

        preOrder(root.right);
    }
}



