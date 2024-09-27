import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter the operator (+, -, *, /): ");
        String operator = scanner.nextLine();

        System.out.print("Enter the first operand: ");
        int operand1 = scanner.nextInt();

        System.out.print("Enter the second operand: ");
        int operand2 = scanner.nextInt();

        double[] remainder = new double[1];

        switch (operator) {
            case "+":
                System.out.println("Result of " + operand1 + " and " + operand2 + " is " + calculator.Addition(operand1, operand2));
                break;
            case "-":
                System.out.println("Result of " + operand1 + " and " + operand2 + " is " + calculator.Subtraction(operand1, operand2));
                break;
            case "*":
                System.out.println("Result of " + operand1 + " and " + operand2 + " is " + calculator.Multiplication(operand1, operand2));
                break;
            case "/":
                try {
                    double quotient = calculator.Division(operand1, operand2, remainder);
                    System.out.println("Quotient: " + quotient + ", Remainder: " + remainder[0]);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid operator.");
                break;
        }

        scanner.close();
    }
}