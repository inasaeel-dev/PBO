package id.ac.polinema;

public class CheckingAccount extends Account {
    private double overdraftLimit;
    private static final double MONTHLY_FEE = 15000;

    public CheckingAccount(String accountNumber, Customer owner, double balance, double overdraftLimit) {
        super(accountNumber, owner, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    protected boolean canWithdraw(double amount) {
        // memungkinkan penarikan hingga melebihi saldo selama masih dalam batas overdraft
        return amount <= (getBalance() + overdraftLimit);
    }

    @Override
    public double monthlyFee() {
        return MONTHLY_FEE; // biaya bulanan untuk Checking Account adalah 15000.0
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Account type: Checking, overdraft limit: " + overdraftLimit);
    }
}