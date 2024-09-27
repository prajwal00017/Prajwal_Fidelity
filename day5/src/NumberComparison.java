import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x, y;
        boolean result;

        System.out.print("Enter the value for x: ");
        x = scanner.nextInt();

        System.out.print("Enter the value for y: ");
        y = scanner.nextInt();

        result = x < y;

        System.out.println("The result of whether x is less than y is " + result);

        scanner.close();
    }
}