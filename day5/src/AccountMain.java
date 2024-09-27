import java.util.Scanner;

class AccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account id: ");
        int id = scanner.nextInt();

        System.out.print("Enter account type: ");
        String accountType = scanner.next();

        System.out.print("Enter account balance: ");
        double balance = scanner.nextDouble();

        AccountDetails account = new AccountDetails(id, accountType, balance);

        System.out.println(account.GetDetails());

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();

        if (account.Withdraw(withdrawAmount)) {
            System.out.println("New Balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient Balance");
        }

        scanner.close();
    }
}