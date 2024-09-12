import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize bank account object
        BankAccount bankAccount = new BankAccount(1000, 0.0025);
        // Initialize decimal formatter object to group by thousands and limit to two decimal places
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        // Initialize scanner object to read user input from console
        Scanner scanner = new Scanner(System.in);

        // Print messages for menu
        System.out.println("===== Bank Account Menu =====");
        System.out.println("B. Check Balance");
        System.out.println("D. Deposit Money");
        System.out.println("W. Withdraw Money");
        System.out.println("I. Add Interest");
        System.out.println("E. Exit");
        System.out.println("=============================\n");

        // Loop indefinitely to process actions in menu
        while (true) {
            // Prompt user to select action
            System.out.print("Please select an option (B/D/W/I/E): ");

            // Read action from user input
            String action = scanner.nextLine().toUpperCase();

            // Handle actions
            switch(action) {
                // View current balance in account
                case "B": {
                    // Retrieve balance
                    double balance = bankAccount.getBalance();

                    // Format balance
                    String formattedBalance = formatter.format(balance);

                    // Display balance
                    System.out.printf("Current balance in bank account : $%s\n\n", formattedBalance);

                    break;
                }

                // Deposit money into bank account
                case "D": {
                    // Prompt user to enter deposit amount
                    System.out.print("Please enter the amount you would like to deposit: ");

                    // Read amount from user input
                    double amount = scanner.nextDouble();

                    // Consume newline character
                    scanner.nextLine();

                    // Deposit amount into account
                    bankAccount.deposit(amount);

                    // Display deposit success message
                    String formattedAmount = formatter.format(amount);
                    System.out.printf("Successfully deposited $%s into bank account!\n\n", formattedAmount);

                    break;
                }

                // Withdraw money from bank account
                case "W": {
                    // Prompt user to enter withdrawal amount
                    System.out.print("Please enter the amount you would like to withdraw: ");

                    // Read amount from user input
                    double amount = scanner.nextDouble();

                    // Consume newline character
                    scanner.nextLine();

                    // Withdraw amount from account
                    bankAccount.withdraw(amount);

                    // Display withdrawal success message
                    String formattedAmount = formatter.format(amount);
                    System.out.printf("Successfully withdrew $%s from bank account!\n\n", formattedAmount);

                    break;
                }

                // Add interest into bank account and view new balance
                case "I": {
                    // Add interest
                    bankAccount.addInterest();

                    // Retrieve new balance and interest added
                    double balance = bankAccount.getBalance();
                    double interest = bankAccount.getInterest();

                    // Format balance and interest
                    String formattedBalance = formatter.format(balance);
                    String formattedInterest = formatter.format(interest);

                    // Display new balance and interest
                    System.out.printf("Amount of interest earned is $%s. Your new balance is $%s\n\n", formattedInterest, formattedBalance);

                    break;
                }

                // Exit menu
                case "E": {
                    System.out.println("Exiting bank account menu...");
                    // Exit from the main method
                    return;
                }

                // Invalid response
                default: {
                    // Display warning message
                    System.out.println("Please enter a valid action! (B/D/W/I/E)\n");
                }
            }
        }
    }
}
