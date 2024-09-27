import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeCalculator{
    private String firstName;
    private String lastName;
    private LocalDate dob; // Date of birth

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAdult() {
        return getAge() >= 18 ? "Adult" : "Child";
    }

    public int getAge() {
        return (int) ChronoUnit.YEARS.between(dob, LocalDate.now());
    }

    public void displayDetails() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + getAge());
        System.out.println(getAdult());
    }
}

