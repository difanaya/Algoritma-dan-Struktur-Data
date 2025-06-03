package minggu14;
//Menyimpan transaksi pengisian BBM kendaraan
public class TransaksiPengisian {
    Kendaraan kendaraan; //kendaraan: objek dari kelas Kendaraan (diasumsikan ada di bagian lain program).
    BBM bbm; //bbm: objek dari kelas BBM (jenis BBM yang digunakan).
    double liter; //liter: jumlah liter BBM yang digunakan.
    double totalBayar; //totalBayar: total biaya yang harus dibayar (harga per liter × liter).

    public TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = bbm.hargaPerLiter * liter; //untuk gaya penulisan yang bersih, konsisten, dan aman, sebaiknya tetap gunakan this.totalBayar.
    }

    public void tampilkanDetail() { //Method untuk menampilkan informasi lengkap tentang transaksi.
        kendaraan.tampilkanInformasi();
        System.out.println("BBM: " + bbm.namaBBM + ", Harga/Liter: " + bbm.hargaPerLiter + ", Liter: " + liter + ", Total Bayar: " + totalBayar);
    }

    public void tampilkanRingkas() { //Method untuk menampilkan versi ringkas transaksi: plat nomor dan total bayar.
    System.out.println(kendaraan.platNomor + ": Rp " + totalBayar);
    }
}