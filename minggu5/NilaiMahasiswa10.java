package minggu5;

public class NilaiMahasiswa10 {
    int[] uts;
    int[] uas;

    public NilaiMahasiswa10(int[] uts, int[] uas) {
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

    public int minUTS(int left, int right) {
        if (left == right) {
            return uts[left]; 
        }
        int mid = (left + right) / 2;
        int leftMin = minUTS(left, mid);
        int rightMin = minUTS(mid + 1, right);
        return Math.min(leftMin, rightMin);
    }

    public double averageUAS() {
        int total = 0;
        for (int i = 0; i < uas.length; i++) {
            total += uas[i];
        }
        return (double) total / uas.length;
    }
}
