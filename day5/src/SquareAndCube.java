import java.util.Scanner;

public class SquareAndCube{

    static double FindSquare(double number) {
        return number * number;
    }

    static double FindCube(double number) {
        return number * number * number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double inputNumber = scanner.nextDouble();

        double square = FindSquare(inputNumber);
        double cube = FindCube(inputNumber);

        System.out.printf("The square of %.2f is %.2f%n", inputNumber, square);
        System.out.printf("The cube of %.2f is %.2f%n", inputNumber, cube);

        scanner.close();
    }
}