// Interface Loanable
interface Loanable {
    void applyForLoan();

    double calculateLoanEligibility();
}

// Abstract class BankAccount
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters for encapsulation
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Abstract method
    public abstract double calculateInterest();
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount implements Loanable {
    SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.05; // 5% interest
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan application submitted for Savings Account holder: " + getHolderName());
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2; // Eligibility based on balance
    }
}

// Subclass CurrentAccount
class CurrentAccount extends BankAccount implements Loanable {
    CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02; // 2% interest
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan application submitted for Current Account holder: " + getHolderName());
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 1.5; // Eligibility based on balance
    }
}

// Main class for demonstration
class BankingSystem {
    public static void main(String[] args) {
        // Create a list of accounts
        BankAccount[] accounts = new BankAccount[2];
        accounts[0] = new SavingsAccount("SAV123", "janvi", 1000.0);
        accounts[1] = new CurrentAccount("CUR456", "priyanshu", 2000.0);

        // Demonstrate polymorphism
        for (BankAccount acc : accounts) {
            System.out.println("Account Number: " + acc.getAccountNumber());
            System.out.println("Holder Name: " + acc.getHolderName());
            System.out.println("Initial Balance: $" + acc.getBalance());

            // Perform operations
            acc.deposit(500);
            acc.withdraw(200);

            double interest = acc.calculateInterest();
            System.out.println("Calculated Interest: $" + interest);

            if (acc instanceof Loanable) {
                Loanable loanAcc = (Loanable) acc;
                loanAcc.applyForLoan();
                double eligibility = loanAcc.calculateLoanEligibility();
                System.out.println("Loan Eligibility: $" + eligibility);
            }
            System.out.println("------------------------------------------");
        }
    }
}
