public class BankAccountTest
{
    public static void main(String[] args)
    {
        // Test Case 1 - Check initial balance after account creation
        System.out.println("Test Case 1 - Check initial balance after account creation");
        BankAccount account1 = new BankAccount(1000, 0.0025);
        System.out.println("EXPECTED RESULT: $1,000.00");
        System.out.println("YOUR RESULT    : $" + new java.text.DecimalFormat("#,###.00").format(account1.getBalance()));
        System.out.println("PASSED = " + (account1.getBalance() == 1000) + "\n");

        // Test Case 2 - Deposit money
        System.out.println("Test Case 2 - Deposit money");
        BankAccount account2 = new BankAccount(1000, 0.0025);
        account2.deposit(500);
        System.out.println("EXPECTED RESULT: $1,500.00");
        System.out.println("YOUR RESULT    : $" + new java.text.DecimalFormat("#,###.00").format(account2.getBalance()));
        System.out.println("PASSED = " + (account2.getBalance() == 1500) + "\n");

        // Test Case 3 - Withdraw money
        System.out.println("Test Case 3 - Withdraw money");
        BankAccount account3 = new BankAccount(1000, 0.0025);
        account3.withdraw(200);
        System.out.println("EXPECTED RESULT: $800.00");
        System.out.println("YOUR RESULT    : $" + new java.text.DecimalFormat("#,###.00").format(account3.getBalance()));
        System.out.println("PASSED = " + (account3.getBalance() == 800) + "\n");

        // Test Case 4 - Add interest
        System.out.println("Test Case 4 - Add interest to account");
        BankAccount account4 = new BankAccount(1000, 0.0025);
        account4.addInterest();
        System.out.println("EXPECTED RESULT: Amount of interest earned is $2.50. New Balance is $1,002.50");
        System.out.println("YOUR RESULT    : Amount of interest earned is $" + new java.text.DecimalFormat("#,###.00").format(account4.getInterest())
                + ". New Balance is $" + new java.text.DecimalFormat("#,###.00").format(account4.getBalance()));
        System.out.println("PASSED = " + (account4.getInterest() == 2.5 && account4.getBalance() == 1002.5) + "\n");

        // Test Case 5 - Invalid menu option simulation (No functional test case for invalid input, just for completeness)
        System.out.println("Test Case 5 - Invalid menu option (Simulated)\n");
        // No code needed for this case, would be handled in the main program.

        // Test Case 6 - Exit program (Simulation)
        System.out.println("Test Case 6 - Exit the program (Simulated)");
        System.out.println("EXPECTED RESULT: Program exits after pressing 'E'. (Simulated)");
        System.out.println("YOUR RESULT    : Program would exit after pressing 'E'. (Simulated)");
        System.out.println("PASSED = true (Simulated)\n");
    }
}
