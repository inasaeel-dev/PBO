package Jobsheet11.id.ac.polinema;

public class InsufficientBalanceException extends Exception { // diturunkan dari kelas Exception
  public InsufficientBalanceException(String massage){
    super(massage);
  }
}
