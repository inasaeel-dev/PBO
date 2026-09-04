package JOBSHEET01.TugasPraktikum;

public class Handphone extends Elektronik{
  int kamera;
  String warnaHP;

  public void menelepon() {
      System.out.println("HP digunakan untuk menelepon");
  }

  public void mengirimPesan() {
        System.out.println("HP digunakan untuk mengirim pesan");
  }

  public void cetakHP() {
        System.out.println("Kamera: " + kamera + " MP");
        System.out.println("Warna: " + warnaHP);
  }
}
