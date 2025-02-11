public class Fungsi10 {
    
    static int stokBunga10[][] = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
    };

    static int hargaBunga10[] = { 75000, 50000, 60000, 10000 };

    static void pendapatanCabang() {
        System.out.println("=================================================");
        System.out.println("Pendapatan cabang RoyalGarden jika semua terjual");
        System.out.println("=================================================");
        for (int i = 0; i < stokBunga10.length; i++) {
            int totalPendapatan10 = 0;
            for (int j = 0; j < stokBunga10[i].length; j++) {
                totalPendapatan10 += stokBunga10[i][j] * hargaBunga10[j];
            }
            System.out.println("Pendapatan cabang RoyalGarden " + (i + 1) + ": Rp " + totalPendapatan10);
        }
    }

    static String NamaBunga10(int index) {
        switch (index) {
            case 0:
                return "Aglonema";
            case 1:
                return "Keladi";
            case 2:
                return "Alocasia";
            case 3:
                return "Mawar";
            default:
                return "Bunga Tidak Ada";
        }
    }
    public static void main(String[] args) {
        pendapatanCabang();
    }
}