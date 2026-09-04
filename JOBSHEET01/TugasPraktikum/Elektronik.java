package JOBSHEET01.TugasPraktikum;

public class Elektronik {
  String merk;
  int tahun;

  public void on(){
    System.out.println("Elektronik dinyalakan");
  }

  public void off(){
    System.out.println("Elektronik dimatikan");
  }

  public void printInfo(){
    System.out.println("Merk : " + merk);
    System.out.println("Tahun : " + tahun);
  }
}
