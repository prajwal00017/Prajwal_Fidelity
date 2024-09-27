import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AgeCalculator person = new AgeCalculator();

        System.out.print("Enter first name: ");
        person.setFirstName(scanner.nextLine());

        System.out.print("Enter the last name: ");
        person.setLastName(scanner.nextLine());

        System.out.print("Enter date of birth in yyyy/mm/dd format: ");
        String dobInput = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate dob = LocalDate.parse(dobInput, formatter);
        person.setDob(dob);

        person.displayDetails();

        scanner.close();
    }
}
