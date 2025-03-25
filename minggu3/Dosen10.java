package minggu3;
import java.util.Scanner;
public class Dosen10 {
    public String kode;
    public String nama;
    public boolean jenisKelamin;
    public int usia;

    public Dosen10(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public Dosen10() {
    }

    public void cetakInfo(int index) {
        System.out.println("Data Dosen ke-" + (index + 1));
        System.out.println("Kode           : " + kode);
        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin  : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia           : " + usia);
        System.out.println("---------------------------------");
    }

    public void cetakInfo() {
        System.out.println("Kode           : " + kode);
        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin  : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia           : " + usia);
    }
}

