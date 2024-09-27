import java.util.Scanner;

public class AccountDetails {
    private int id;
    private String accountType;
    private double balance;

    public AccountDetails() {
        this.id = 0;
        this.accountType = "";
        this.balance = 0.0;
    }

    public AccountDetails(int id, String accountType, double balance) {
        this.id = id;
        this.accountType = accountType;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean Withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public String GetDetails() {
        return "Account Id: " + id + "\n" +
                "Account Type: " + accountType + "\n" +
                "Balance: " + balance;
    }
}

