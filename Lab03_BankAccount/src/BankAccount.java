public class BankAccount {
    // Balance in bank account
    private double balance;

    // Monthly interest rate (A decimal fraction, e.g., 0.03 for 3%)
    private final double interestRate;

    // Monthly interest earned on current balance
    private double interest;

    // Constructor
    public BankAccount(double startBalance, double intRate) {
        balance = startBalance; // Initialize initial balance
        interestRate = intRate; // Initialize monthly interest rate
        interest = 0.0; // Initialize default interest
    }

    // Retrieves the current balance of bank account
    public double getBalance() {
        return balance;
    }

    // Retrieves the monthly interest earned in bank account
    public double getInterest() {
        return interest;
    }

    // Deposits a specified amount into the bank account
    public void deposit(double amount) {
        balance += amount; // Add deposit to balance
    }

    // Withdraws a specified amount from the bank account
    public void withdraw(double amount) {
        balance -= amount; // Subtract withdrawal from balance
    }

    // Adds interest earned to balance
    public void addInterest() {
        interest = balance * interestRate; // Compute and update interest earned
        balance += interest; // Add interest earned to balance
    }
}
