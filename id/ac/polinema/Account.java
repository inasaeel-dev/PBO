package id.ac.polinema;

public abstract class Account {
    private String accountNumber;
    private Customer owner;
    private double balance;

    public Account(String accountNumber, Customer owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }
    public boolean withdraw(double amount) {
        if (canWithdraw(amount)) {
            balance -= amount;
            return true;
        }
        return false;
    }
    protected boolean canWithdraw(double amount) {
        return amount <= balance;
    }
    public void printInfo() {
        System.out.println(accountNumber + " - " + owner.getName() + " - balance: " + balance);
    }
    public abstract double monthlyFee();

    public String getAccountNumber() {
        return accountNumber;
    }
    public Customer getOwner() {
        return owner;
    }
    public double getBalance() {
        return balance;
    }
}