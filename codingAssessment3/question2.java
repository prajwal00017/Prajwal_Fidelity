import java.util.LinkedList;
import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 4 integer for the linked list:");
        for (int i = 0; i < 4; i++) {
            String element = scanner.nextLine();
            list.add(element);
        }

        System.out.println("Original Linked List: " + list);

        System.out.print("Enter the index of the integer to remove (0 to 3): ");
        int index = scanner.nextInt();

        if (index >= 0 && index < list.size()) {
            String removedElement = list.remove(index);
            System.out.println("Removed integer: " + removedElement);
        } else {
            System.out.println("Invalid index. Please enter a number between 0 and 3.");
        }

        System.out.println("Updated Linked List: " + list);

        scanner.close();
    }
}