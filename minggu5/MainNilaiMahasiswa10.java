package minggu5;

public class MainNilaiMahasiswa10 {
    public static void main(String[] args) {
        int[] uts = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] uas = {82, 88, 87, 79, 95, 85, 83, 84};

        NilaiMahasiswa10 nm = new NilaiMahasiswa10(uts, uas);

        int maxUTS = nm.maxUTS(0, uts.length - 1);
        int minUTS = nm.minUTS(0, uts.length - 1);

        double avgUAS = nm.averageUAS();

        System.out.println("Nilai UTS Tertinggi (DC): " + maxUTS);
        System.out.println("Nilai UTS Terendah (DC): " + minUTS);
        System.out.println("Rata-rata Nilai UAS (BF): " + avgUAS);
    }
}

