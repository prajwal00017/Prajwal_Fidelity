public class Q4Main {
    public static void main(String[] args) {
        Q4Node root = new Q4Node(1);
        root.right = new Q4Node(2);
        root.right.right = new Q4Node(5);
        root.right.right.left = new Q4Node(3);
        root.right.right.right = new Q4Node(6);
        root.right.right.left.right = new Q4Node(4);

        System.out.println("Preorder Traversal:");
        preOrder(root);
    }

    static void preOrder(Q4Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preOrder(root.left);

        preOrder(root.right);
    }
}