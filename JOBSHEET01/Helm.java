package JOBSHEET01;

public class Helm {
  String merk;
  int ukuran;

  public Helm (String merk, int ukuran){
    this.merk = merk;
    this.ukuran = ukuran;
  }
  public void pakaiHelm() {
      System.out.println("Helm " + merk + " dikunci dengan pas di kepala.");
  }

  public void lepasHelm() {
      System.out.println("Helm " + merk + " dilepas.");
  }

  public void cetakInfo() {
      System.out.println("Merk Helm: " + merk + " | Ukuran: " + ukuran);
  }
}
