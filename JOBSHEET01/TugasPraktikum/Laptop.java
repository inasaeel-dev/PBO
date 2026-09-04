package JOBSHEET01.TugasPraktikum;

public class Laptop extends Elektronik{
  String prosesor;
  int ram;

  public void mengetik(){
    System.out.println("Laptop digunakan untuk mengerjakan tugas");
  }

  public void mengisiBaterai(){
    System.out.println("Laptop sedang mengisi baterai");
  }

  public void printInfo(){
    System.out.println("RAM : " + ram + " GB");
    System.out.println("Prosesor : " + prosesor);
  }
}
