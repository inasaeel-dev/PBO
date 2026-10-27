package id.ac.polinema;

public class SavingsAccount extends Account implements InterestBearing {
    private double interestRate;

    public SavingsAccount(String accountNumber, Customer owner, double balance, double interestRate) {
        super(accountNumber, owner, balance);
        this.interestRate = interestRate;
    }
    @Override
    public double monthlyFee() {
        return 0.0; // savings Account tidak ada biaya bulanan
    }
    public void applyInterest(){
      double interest = getBalance() * interestRate;
      deposit(interest);
    }
}