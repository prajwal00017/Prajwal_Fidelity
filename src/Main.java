import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static char assignedgrade(int marks) {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static String getfeedback(char grade) {
        switch (grade) {
            case 'A':
                return "Excellent!";
            case 'B':
                return " Very good!";
            case 'C':
                return "Good!";
            case 'D':
                return "Passed";
            case 'F':
                return "Failed";
            default:
                return "Invalid grade!";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's marks: ");
        int marks = sc.nextInt();

        char grade = assignedgrade(marks);
        String feedback = getfeedback(grade);

        System.out.println("Student's Grade:" + grade);
        System.out.println("Feedback:" + feedback);
    }


}