import java.util.Scanner;

public class Pemilihan10 {
    public static void main(String[] args) {
        Scanner Difa = new Scanner(System.in);
        double tugas10, kuis10, uts10, uas10; 

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan nilai tugas : ");
        tugas10 = Difa.nextDouble();
        System.out.print("Masukkan nilai kuis : ");
        kuis10 = Difa.nextDouble();
        System.out.print("Masukkan nilai uts : ");
        uts10 = Difa.nextDouble();
        System.out.print("Masukkan nilai uas : ");
        uas10 = Difa.nextDouble();
        System.out.println("==============================");

        if (!isValid(tugas10) || !isValid(kuis10) || !isValid(uts10) || !isValid(uas10)) {
            System.out.println("============================");
            System.out.println("Nilai tidak valid");
            System.out.println("============================");
        } else {
            double nilaiAkhir10 = 0.2 * tugas10 + 0.2 * kuis10 + 0.3 * uts10 + 0.4 * uas10;

            String nilaiHuruf;
            if (nilaiAkhir10 >= 80) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir10 >= 73) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir10 >= 65) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir10 >= 60) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir10 >= 50) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir10 >= 39) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            String keterangan = nilaiHuruf.equals("D") || nilaiHuruf.equals("E") ? "ANDA TIDAK LULUS"
                    : "SELAMAT ANDA LULUS";

            System.out.println("============================");
            System.out.println("Nilai Akhir: " + nilaiAkhir10);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("============================");
            System.out.println("============================");
            System.out.println(keterangan);
        }
        Difa.close();
    }

    public static boolean isValid(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }
}
