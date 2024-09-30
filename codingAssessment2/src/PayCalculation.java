import java.util.Scanner;

public class PayCalculation {

    public static double GetGrossPay(int hoursWorked) {
        double standardRate = 80.0;
        double grossPay;

        if (hoursWorked <= 56) {
            grossPay = standardRate * hoursWorked;
        } else {
            double overtimeHours = hoursWorked - 56;
            grossPay = (standardRate * 56) + (overtimeHours * standardRate * 1.5);
        }

        return grossPay;
    }

    public static double CalculateTax(double grossPay) {
        return grossPay * 0.02;
    }

    public static double CalculateNetPay(int hoursWorked) {
        double grossPay = GetGrossPay(hoursWorked);
        double tax = CalculateTax(grossPay);
        return grossPay - tax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of hours worked:");
        int hoursWorked = scanner.nextInt();

        double netPay = CalculateNetPay(hoursWorked);

        System.out.printf("The calculated Net Pay is $%.2f%n", netPay);

        scanner.close();
    }
}