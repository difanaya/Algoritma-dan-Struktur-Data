package minggu14;
//Class untuk menyimpan jenis BBM dan harga per liter
public class BBM {
    String namaBBM;
    double hargaPerLiter;

    public BBM(String namaBBM, double harga) { //Konstruktor untuk mengisi nama dan harga BBM saat objek dibuat.
        this.namaBBM = namaBBM;
        this.hargaPerLiter = harga;
    }
}