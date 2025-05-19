package minggu11;

public class MahasiswaTugas10 {
    String nim;
    String nama;
    String jurusan;
    String keperluan;

    public MahasiswaTugas10(String nim, String nama, String jurusan, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.keperluan = keperluan;
    }

    public void tampilInformasi() {
        System.out.printf("NIM: \n", nim);
        System.out.printf("Nama: \n", nama);
        System.out.printf("Jurusan: \n", jurusan);
        System.out.printf("Keperluan: \n", keperluan);
    }
}

