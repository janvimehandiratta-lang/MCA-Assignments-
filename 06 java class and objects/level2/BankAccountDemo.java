import java.util.Scanner;

// User-defined BankAccount class
class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Method to display current balance
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input account details
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter initial balance: ");
        double bal = sc.nextDouble();

        // Create BankAccount object
        BankAccount account = new BankAccount(name, accNo, bal);

        // Demonstrate functionality
        account.displayBalance();

        System.out.print("\nEnter amount to deposit: ");
        double depositAmt = sc.nextDouble();
        account.deposit(depositAmt);
        account.displayBalance();

        System.out.print("\nEnter amount to withdraw: ");
        double withdrawAmt = sc.nextDouble();
        account.withdraw(withdrawAmt);
        account.displayBalance();
    }
}
