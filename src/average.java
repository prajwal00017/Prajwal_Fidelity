import java.util.Scanner;

public class average {
    public static double calculateAvg(int[] numbers) {
        int sum = 0;
        for (int num:numbers) sum += num;
        return (double) sum / numbers.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int[] numbers = new int[sc.nextInt()];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < numbers.length; i++) numbers[i] = sc.nextInt();
        System.out.println("The average is: "+calculateAvg(numbers));
    }
}
