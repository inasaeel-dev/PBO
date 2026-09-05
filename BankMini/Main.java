package BankMini;

public class Main {
  public static void main(String[] args) {
    Account acc = new Account("Nadia", 50000);
    acc.withdraw(150000);
    acc.printInfo();
    System.out.println("Formatted : " + acc.formatBalance());

    acc.withdraw(1000000);
    acc.printInfo();
  }
}