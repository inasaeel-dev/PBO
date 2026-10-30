package id.ac.polinema;

public class CheckingAccount extends Account implements Auditable{
    private double overdraftLimit;
    private static final double MONTHLY_FEE = 15000;

    public CheckingAccount(String accountNumber, Customer owner, double balance, double overdraftLimit) {
        super(accountNumber, owner, balance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public double monthlyFee() {
        return MONTHLY_FEE; // biaya bulanan untuk Checking Account adalah 15000.0
    }
    @Override 
    public String auditLog(){
      return "Audit Nomor Rekening: " + getAccountNumber() + " | Saldo: " + getBalance();
    }
}