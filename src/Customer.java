// The Customer class holds customer details and is linked to a BankAccount.

public class Customer {
  private String name;
  private BankAccount account;

  public Customer(String name, String accountNumber) {
    this.name = name;
    this.account = new BankAccount(accountNumber);
  }

  public String getName() {
    return name;
  }

  public BankAccount getAccount() {
    return account;
  }
}
