import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insurance Number: ");
        String insuranceNo = scanner.nextLine();

        System.out.print("Insurance Name: ");
        String insuranceName = scanner.nextLine();

        System.out.print("Amount Covered: ");
        Double amountCovered = scanner.nextDouble();

        System.out.println("Select:");
        System.out.println("1. Life Insurance");
        System.out.println("2. Motor Insurance");

        int option = scanner.nextInt();

        if (option == 1) {
            LifeInsurance lifeInsurance = new LifeInsurance();
            lifeInsurance.setInsuranceNo(insuranceNo);
            lifeInsurance.setInsuranceName(insuranceName);
            lifeInsurance.setAmountCovered(amountCovered);

            System.out.print("Policy Term: ");
            lifeInsurance.setPolicyTerm(scanner.nextInt());

            System.out.print("Benefit Percent: ");
            lifeInsurance.setBenefitPercent(scanner.nextFloat());

            addPolicy(lifeInsurance, option);


        } else if (option == 2) {
            MotorInsurance motorInsurance = new MotorInsurance();
            motorInsurance.setInsuranceNo(insuranceNo);
            motorInsurance.setInsuranceName(insuranceName);
            motorInsurance.setAmountCovered(amountCovered);

            System.out.print("Depreciation Percent: ");
            motorInsurance.setDepPercent(scanner.nextFloat());

            addPolicy(motorInsurance, option);

        } else {
            System.out.println("Invalid option selected.");
        }

        scanner.close();
    }
    public static void addPolicy(Insurance ins, int opt) {
        double premium;

        if (opt == 1) {
            LifeInsurance lifeIns = (LifeInsurance) ins;
            premium = lifeIns.calculatePremium();

        } else {
            MotorInsurance motorIns = (MotorInsurance) ins;
            premium = motorIns.calculatePremium();
        }

        System.out.println("Calculated Premium: " + premium);
    }
}
