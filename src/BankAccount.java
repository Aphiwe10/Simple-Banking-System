// This class handles the logic for depositing, withdrawing, and checking the balance.

public class BankAccount {
  private double balance;
  private String accountNumber;

  public BankAccount(String accountNumber) {
    this.accountNumber = accountNumber;
    this.balance = 0.0;
  }

  // Deposit method
  public void deposit(double amount) {
    if (amount <= 0) {
      System.out.println("Deposit amount must be positive.");
    } else {
      balance += amount;
      System.out.println("Successfully deposited $" + amount);
    }
  }

  // Withdraw method
  public void withdraw(double amount) {
    if (amount <= 0) {
      System.out.println("Withdrawal amount must be positive.");
    } else if (amount > balance) {
      System.out.println("Insufficient balance! You cannot withdraw more than the available balance.");
    } else {
      balance -= amount;
      System.out.println("Successfully withdrew $" + amount);
    }
  }

  // Check balance method
  public double getBalance() {
    return balance;
  }

  public String getAccountNumber() {
    return accountNumber;
  }
}
