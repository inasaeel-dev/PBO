package id.ac.polinema; //package atau folder

public class Bank { // deklarasi kelas publik
  private Account[] accounts; // atribut array untuk menyimpan daftar akun bank
  private int count; // untuk mencatat jumlah akun yang saat ini sudah tersimpan di dalam array

  public Bank (int capacity){ // konstruktor yang menerima parameter kapasitas maksimal array
    accounts = new Account[capacity]; // inisialisasi array dengan ukuran sebesar nilai kapasitas saat pemanggilan konstruktor
    count = 0; // nilai variabel 0 karena bank masih kosong
  }
  public boolean addAccount(Account account){ // untuk menambahkan objek akun baru, mengembalikan nilai boolean
    if (count >= accounts.length){ //pengecekan kondisi jumlah akun saat ini sudah mencapai kapasitas atau melebihi kapasitas maksimum array
      return false; // jika kapasitas penuh, method berhenti dan mengembalikan nilai/gagal menambah akun
    }
    accounts[count] = account; //
    count++;
    return true;
  }
  public Account findAccount(String accountNumber){
    for (int i = 0; i < count; i++) {
      if(accounts[i].getAccountNumber().equals(accountNumber)){
        return accounts[i];
      }
    }
    return null;
  }
  public void printAllAccounts(){
    for (int i = 0; i < count; i++) {
      accounts[i].printInfo();
    }
  }
}
