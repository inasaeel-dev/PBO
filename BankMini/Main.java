package BankMini;

public class Main {
  public static void main(String[] args) {

    Account acc = new Account();
    acc.ownerName = "Nadia";
    acc.balance = 500000;
    System.out.println(acc.ownerName + " - balance : " + acc.balance);
    
    }
  }






    // Account[] accounts = new Account[3];

    // accounts[0] = new Account("Nadia", 500000);
    // accounts[0].withdraw(150000);

    // accounts[1] = new Account("Budi", 1000000);

    // accounts[2] = new Account("Sari", 750000);
    // accounts[2].withdraw(250000);

    // for (Account acc : accounts){
    //   acc.printInfo();



    // Account acc = new Account("Nadia", 500000);
    // acc.ownerName = "Nadia";
    // acc.withdraw(150000);
    // acc.printInfo();
    // System.out.println("Formatted : " + acc.formatBalance());

    // acc.withdraw(1000000);
    // acc.printInfo();

    // Account original = new Account("Nadia", 500000);
    // Account copy = original;
    // copy.deposit(100000);

    // System.out.println("Via original : " + original.balance);
    // System.out.println("Via copy : " + copy.balance);

    // Account empty = null;
    // empty.printInfo();