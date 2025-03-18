package minggu5;

public class NilaiMahasiswa10 {
    String[] nama;
    int[] uts;
    int[] uas;

    public NilaiMahasiswa10(String[] nama, int[] uts, int[] uas) {
        this.nama = nama;
        this.uts = uts;
        this.uas = uas;
    }

    public int maxUTS(int left, int right) {
        if (left == right) {
            return uts[left]; 
        }
        int mid = (left + right) / 2;
        int leftMax = maxUTS(left, mid);
        int rightMax = maxUTS(mid + 1, right);
        return Math.max(leftMax, rightMax);
    }

    public String MahasiswaMax() {
        int max = maxUTS(0, uts.length - 1);
        for (int i = 0; i < uts.length; i++) {
            if (uts[i] == max) {
                return nama[i];
            }
        }
        return null;
    }

    public int minUTS(int left, int right) {
        if (left == right) {
            return uts[left]; 
        }
        int mid = (left + right) / 2;
        int leftMin = minUTS(left, mid);
        int rightMin = minUTS(mid + 1, right);
        return Math.min(leftMin, rightMin);
    }

    public String MahasiswaMin() {
        int min = minUTS(0, uts.length - 1);
        for (int i = 0; i < uts.length; i++) {
            if (uts[i] == min) {
                return nama[i];
            }
        }
        return null;
    }

    public double averageUAS() {
        int total = 0;
        for (int i = 0; i < uas.length; i++) {
            total += uas[i];
        }
        return (double) total / uas.length;
    }
}
