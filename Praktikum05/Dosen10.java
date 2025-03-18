package Praktikum05;
class Dosen10 {
    String kode;
    String nama;
    boolean jenisKelamin; // true = laki-laki, false = perempuan
    int usia;

    // Konstruktor
    public Dosen10(String kd, String name, boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    // Menampilkan data dosen
    public void tampil() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + usia);
        System.out.println("-----------------------");
    }
}