package minggu10;

public class Mahasiswa10 {
    String nama;
    String nim;
    String kelas;
    double nilai;

    Mahasiswa10() {
    }

    Mahasiswa10(String nama, String nim, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
