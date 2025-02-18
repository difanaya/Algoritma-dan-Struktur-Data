import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===============================");

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul10 = sc.nextInt();
        sc.nextLine();

        String[] matkul10 = new String[jumlahMatkul10];
        int[] sks10 = new int[jumlahMatkul10];
        double[] nilaiAngka10 = new double[jumlahMatkul10];
        String[] nilaiHuruf10 = new String[jumlahMatkul10];

        for (int i = 0; i < jumlahMatkul10; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            matkul10[i] = sc.nextLine();
            System.out.print("Masukkan jumlah SKS " + matkul10[i] + ": ");
            sks10[i] = sc.nextInt();
            System.out.print("Masukkan nilai angka " + matkul10[i] + ": ");
            nilaiAngka10[i] = sc.nextDouble();
            sc.nextLine();

        }   

        System.out.println("=======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=======================");
        System.out.printf("%-40s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalbobotSks10 = 0;
        double totalSks10 = 0;

        for (int i = 0; i < jumlahMatkul10; i++) {
            nilaiHuruf10[i] = konversinilaiHuruf10(nilaiAngka10[i]);
            double bobotNilai10 = konversiNilaiSetara10(nilaiAngka10[i]);
            double bobotSks10 = bobotNilai10 * sks10[i];
            totalbobotSks10 += bobotSks10;
            totalSks10 += sks10[i];
            System.out.printf("%-40s %-15.2f %-15s %-14.2f\n", matkul10[i], nilaiAngka10[i], nilaiHuruf10[i],
                    bobotNilai10);
        }

        double ipSemester10 = totalbobotSks10 / totalSks10;

        System.out.println("=========================");
        System.out.println("IP Semester : " + String.format("%.2f", ipSemester10));
        System.out.println("=========================");
        sc.close();
    }

    public static String konversinilaiHuruf10(double nilaiAngka10) {
        if (nilaiAngka10 >= 80) {
            return "A";
        } else if (nilaiAngka10 >= 75) {
            return "B+";
        } else if (nilaiAngka10 >= 65) {
            return "B";
        } else if (nilaiAngka10 >= 60) {
            return "C+";
        } else if (nilaiAngka10 >= 50) {
            return "C";
        } else if (nilaiAngka10 >= 40) {
            return "D";
        } else {
            return "E";
        }
    }

    public static double konversiNilaiSetara10(double nilaiAngka10) {
        if (nilaiAngka10 >= 80) {
            return 4;
        } else if (nilaiAngka10 >= 75) {
            return 3.5;
        } else if (nilaiAngka10 >= 65) {
            return 3;
        } else if (nilaiAngka10 >= 60) {
            return 2.5;
        } else if (nilaiAngka10 >= 50) {
            return 2;
        } else if (nilaiAngka10 >= 40) {
            return 1;
        } else {
            return 0;
        }
    }
}