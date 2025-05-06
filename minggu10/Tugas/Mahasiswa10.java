package minggu10.Tugas;

public class Mahasiswa10 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public Mahasiswa10(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }   

    public void tampil() {
        System.out.println("NIM - NAMA - PRODI - KELAS");
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
