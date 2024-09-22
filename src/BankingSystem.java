
// The main part of the program that allows users to create a new account, deposit money, withdraw money, and check their balance.
import java.util.Scanner;

public class BankingSystem {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to Simple Banking System");
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();
    System.out.print("Enter account number: ");
    String accountNumber = scanner.nextLine();

    Customer customer = new Customer(name, accountNumber);
    BankAccount account = customer.getAccount();

    while (true) {
      System.out.println("\nMenu:");
      System.out.println("1. Deposit");
      System.out.println("2. Withdraw");
      System.out.println("3. Check Balance");
      System.out.println("4. Exit");
      System.out.print("Choose an option: ");
      int choice = scanner.nextInt();

      switch (choice) {
      case 1:
        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        break;

      case 2:
        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
        break;

      case 3:
        System.out.println("Your balance is: $" + account.getBalance());
        break;

      case 4:
        System.out.println("Thank you for using Simple Banking System.");
        scanner.close();
        return;

      default:
        System.out.println("Invalid choice. Please choose a valid option.");
      }
    }
  }
}
