package minggu7;
public class Dosen10 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen10(String kd, String name, boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    public void tampil() {
        System.out.printf("Kode: %s %n", kode);
        System.out.printf("Nama: %s %n", nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.printf("Usia: %d %n", usia);
        System.out.println("-----------------------------------------");
    }
}
