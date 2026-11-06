package Jobsheet11.id.ac.polinema;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    private String accountNumber;
    private Customer owner;
    private double balance;
    private List<Transaction> history = new ArrayList<>();

    public Account(String accountNumber, Customer owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }
    public void withdraw(double amount) throws InsufficientBalanceException { //membuat fungsi bernama withdraw yang menerima jml amount
        if(!canWithdraw(amount)){ // cek kondisi jika jml penarikan tidak bisa dilakukan lalu dilempar ke throw new
            throw new InsufficientBalanceException( // kl gabisa ditarik baris ini bakal melempar error
                accountNumber + ": insufficient balance for a withdrawal of " + amount);
        }
        balance -= amount; // baris ini dijalankan ketika penarikan lolos syarat. fungsinya mengurangkan saldo lama dgn nominal yg ditarik
        history.add(new Transaction(TransactionType.WITHDRAW, amount));
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
    public List<Transaction> getHistory(){
        return history;
    }
    public boolean deposit(double amount){
      if(amount <= 0){
        return false;
      }
      balance += amount;
      history.add(new Transaction(TransactionType.DEPOSIT, amount));
      return true;
    }

}