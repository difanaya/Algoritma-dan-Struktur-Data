package minggu5;

public class MainNilaiMahasiswa10 {
    public static void main(String[] args) {
        String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
        int[] uts = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] uas = {82, 88, 87, 79, 95, 85, 83, 84};

        NilaiMahasiswa10 nm = new NilaiMahasiswa10(nama, uts, uas);

        int maxUTS = nm.maxUTS(0, uts.length - 1);
        String MhsMax = nm.MahasiswaMax();
        int minUTS = nm.minUTS(0, uts.length - 1);
        String MhsMin = nm.MahasiswaMin();

        double avgUAS = nm.averageUAS();

        System.out.println("Mahasiswa dengan Nilai UTS Tertinggi (DC): " + MhsMax + " (" + maxUTS + ") ");
        System.out.println("Mahasiswa dengan Nilai UTS Terendah (DC): " + MhsMin +" (" + minUTS + ") ");
        System.out.println("Rata-rata Nilai UAS (BF): " + avgUAS);
    }
}

