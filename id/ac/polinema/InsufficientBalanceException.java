package id.ac.polinema;

public class InsufficientBalanceException extends Exception {
  // kelas ini diturunkan dari kelas Exception
  public InsufficientBalanceException(String massage){ // membuat constructor yg menerima parameter massage berupa teks
    super(massage); // mengirimkan teks ke kelas induk
  }
}
