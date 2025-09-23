public class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountType() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }

}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(double interestRate, int accountNumber, double balance) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
        System.out.println("Intrest Rate : " + interestRate);
    }

}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(double withdrawalLimit, int accountNumber, double balance) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
        System.out.println("Withdrawl Limit : " + withdrawalLimit);
    }

}

class FixedDepositAccount extends BankAccount {
    int term;

    FixedDepositAccount(int term, int accountNumber, double balance) {
        super(accountNumber, balance);
        this.term = term;

    }

    void displayAccountType() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
        System.out.println("Term of year : " + term);
    }

}

class main3 {
    public static void main(String[] args) {
        SavingsAccount SA = new SavingsAccount(500.0, 12345, 50000);
        CheckingAccount CA = new CheckingAccount(50000, 12345, 50000);
        FixedDepositAccount FDA = new FixedDepositAccount(4, 12345, 50000);
        SA.displayAccountType();
        System.out.println("-------------------------");
        CA.displayAccountType();
        System.out.println("-------------------------");
        FDA.displayAccountType();
    }
}