package id.ac.polinema;

public class InsufficientBalanceException extends Exception {
  public InsufficientBalanceException(String massage){
    super(massage);
  }
}
