package Jobsheet10.id.ac.polinema;

public class Main {
  public static void main(String[] args) {
        Customer customer = new Customer("Rian", "0812-0000-0003");
        
        Account acc1 = new SavingsAccount("A001", customer, 500000, 0.01);
        Account acc2 = new CheckingAccount("A002", customer, 250000, 15000);
        SavingsAccount savings = new SavingsAccount("A003", customer, 100000, 0.02);

        try {
            savings.withdraw(70000); // mencoba menarik uang 70.000, karena saldo 100.000 proses ini berhasil tanpa melempar error
        } catch (InsufficientBalanceException e){
            System.out.println("Withdrawal failed: " + e.getMessage()); // menampilkan pesan ini jika penarikan gagal.
        }
        try {
            savings.withdraw(30000); // mencoba menarik uang 30.000
            System.out.println("Withdrawal succeded new balance: " + savings.getBalance());
        } catch (InsufficientBalanceException e){ // 
            System.out.println("Withdrawal failed: " + e.getMessage());
        }
        Bank bank = new Bank(10);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(savings);
        bank.processMonthEnd();
        bank.printAuditLog();

        try {
            Account found = bank.findAccount("A007");
        } catch (AccountNotFoundException e){
            System.out.println("Search failed: " + e.getMessage());
        }
    }
}