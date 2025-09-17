// Base class
class BankAccount {
    // Public variable
    public int accountNumber;

    // Protected variable
    protected String accountHolder;

    // Private variable
    private double balance;

    // Constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public getter for balance
    public double getBalance() {
        return balance;
    }

    // Public setter for balance (deposit/withdraw)
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("------------------------------");
    }
}

// Subclass
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Demonstrating access
    public void displaySavingsDetails() {
        System.out.println("Savings Account Number (public): " + accountNumber);
        System.out.println("Account Holder (protected): " + accountHolder);
        System.out.println("Balance (via getter): " + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("------------------------------");
    }
}
