import bank;

public class bankStatement {
    public static void main(String[] args) {
        //Account a = new Account();
        bank.Account a = new bank.Account(); // Create an instance of the Account class
        // Set account details
        a.accountHolderName = "Rishi";
        a.accountNumber = "1234567890";
        a.balance = 1000.0;
        a.accountType = "Savings";
        System.out.println("Account Holder Name: " + a.accountHolderName);
        System.out.println("Account Number: " + a.accountNumber);
        System.out.println("Account Type: " + a.accountType);
        System.out.println("Account Balance: " + a.balance);
    }
}
