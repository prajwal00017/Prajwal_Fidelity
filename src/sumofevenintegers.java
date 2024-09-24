public class sumofevenintegers {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int sum = 0;
        for(int number: numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        System.out.println("Sum of even integers in the array:"+sum);
    }
}
