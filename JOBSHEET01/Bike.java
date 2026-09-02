package JOBSHEET01;

public class Bike {
  private String brand; // atribut private untuk merk
    private int speed;
    private int gear = 1;

    private final int[] GEAR_SPEED_LIMITS = {5, 10, 25, 30, 40, 60}; //array konstanta pembatas kecepatan
    public void setBrand (String brandName){ //method setter untuk menetapkan nama merk
        brand = brandName; //menyimipan input brandName ke dalam atribut brand
    }
    public void gearChanges(int gearValue){ //method untuk mengubah posisi gigi
        if (gearValue < 1 || gearValue > 6){
            System.out.println("Invalid gear value. Gear must be between 1 and 6.");
        }
        else {
            gear = gearValue; //memperbarui atribut gear dengan nilai yg baru
        }
    }
    public int speedAcceleration (int increment){
        speed += increment;
        if (speed > GEAR_SPEED_LIMITS[gear - 1]){ //cek apakah kecepatan melebihi batas atau tidak
            speed = GEAR_SPEED_LIMITS[gear - 1]; //jika melebihi batas, kecepatan menjadi minus
        }
        return speed; //mengembalikan nilai kecepatan terbaru
    }
    public int speedDeceleration (int decrement){
        speed -= decrement; //
        if (speed < 0){
            speed = 0;
        }
        return speed;
    }
    public void printInfo(){
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed);
        System.out.println("Gear : " + gear);
    }
}
