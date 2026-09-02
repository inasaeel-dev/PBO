public class BikeDemo {
   public static void main(String[] args) {
        Bike mountainBike1 = new Bike(); //instansiasi object pertama
        Bike mountainBike2 = new Bike(); 
        RoadBike roadBike1 = new RoadBike();

        mountainBike1.setBrand("Trek"); //mencetak nama brand sepeda
        mountainBike1.speedAcceleration(10);
        mountainBike1.gearChanges(2);
        mountainBike1.printInfo(); //memanggil fungsi untuk mencetak

        mountainBike2.setBrand("Giant"); //mencetak nama brand sepeda
        mountainBike2.speedAcceleration(20);
        mountainBike2.gearChanges(3);
        mountainBike2.printInfo();

        roadBike1.setBrand("Specialized");
        roadBike1.setTireWidth(25);
        roadBike1.speedAcceleration(15);
        roadBike1.gearChanges(4);
        roadBike1.printInfo();
   }
}