package JOBSHEET01.TugasPraktikum;

public class ElektronikDemo {
  public static void main(String[] args) {
    Elektronik e = new Elektronik();
    e.merk = "Sony";
    e.tahun = 2023;

    Laptop l = new Laptop();
    l.merk = "Asus";
    l.tahun = 2024;
    l.ram = 8;
    l.prosesor = "Intel i5";

    Handphone h = new Handphone();
    h.merk = "Samsung";
    h.tahun = 2024;
    h.kamera = 50;
    h.warnaHP = "Hitam";

    e.printInfo();
    e.on();

    l.printInfo();
    l.mengetik();
    l.mengisiBaterai();

    h.printInfo();
    h.menelepon();
    h.mengirimPesan();
  }
}
