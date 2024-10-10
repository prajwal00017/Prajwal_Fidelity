
import java.util.Scanner;

class Account {
    // Data members
    int accno;
    String name;
    double balance;

    Account(int accno, String name, double balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accno);
        System.out.println("Account Holder: " + name);
        System.out.println("Current Balance: $" + balance);
        System.out.println();
    }
}

public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account account = new Account(391201, "Prajwal Singh", 30000.00);

        account.displayAccountDetails();

        boolean exit = false;
        while (!exit) {
            System.out.println("Choose an operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            if (!exit) {
                account.displayAccountDetails();
            }
        }

        scanner.close();
    }
}
