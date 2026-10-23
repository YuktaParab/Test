import java.util.Scanner;

public class BankSystem {
    
    // Error 1: Non-static variable referenced from a static context
    String bankName = "Global Trust Bank";
    static double interestRate = 0.05;

    public static void main(String[] args) {
        System.out.println("Welcome to " + bankName); // Error 1 fix needed here or make bankName static
        
        Scanner scanner = new Scanner(System.in);
        
        // Error 2: Type mismatch - assigning String to int
        int accountNumber = "ACC10492";
        
        // Error 3: Illegal array initialization syntax (mixing size and initializer)
        int[] transactionHistory = new int[5]{ 100, -50, 200, -20, 500 };

        Account myAccount = new Account("Alice", 5000.00);
        
        // Error 4: Missing semicolon
        System.out.println("Account created for " + myAccount.getName())
        
        double finalAmount = calculateInterest(myAccount.getBalance());
        System.out.println("Projected balance: " + finalAmount);
        
        myAccount.withdraw("250.00"); // Error 5: Passing String to a method expecting double
    }

    // Error 6: Missing return statement in a non-void method
    public static double calculateInterest(double principal) {
        double total = principal * interestRate;
        // Forgot to return total
    }
}

class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // Error 7: Unhandled checked exception or invalid throws declaration syntax
    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            // Error 8: Typo in variable or unhandled exception type
            throw new InsufficientFundsException("Not enough money!"); 
        }
        balance -= amount;
    }
}
