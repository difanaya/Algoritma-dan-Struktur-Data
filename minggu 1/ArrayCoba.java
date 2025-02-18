import java.util.Scanner;

public class ArrayCoba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] mataKuliah10 = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };
        double[] sks = { 2, 2, 2, 3, 2, 2, 3, 2 };

        System.out.println("===============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===============================");

        double[] nilaiAngka10 = new double[mataKuliah10.length];

        for (int i = 0; i < mataKuliah10.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah10[i] + ": ");
            nilaiAngka10[i] = sc.nextDouble();
        }

        System.out.println("=======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=======================");
        System.out.printf("%-40s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalbobotSks10 = 0;
        double totalSks10 = 0;

        for (int i = 0; i < mataKuliah10.length; i++) {
            String nilaiHuruf10 = konversinilaiHuruf10(nilaiAngka10[i]);
            double bobotNilai10 = konversiNilaiSetara(nilaiAngka10[i]);
            double bobotSks10 = bobotNilai10 * sks[i];
            totalbobotSks10 += bobotSks10;
            totalSks10 += sks[i];
            System.out.printf("%-40s %-15.2f %-15s %-14.2f\n", mataKuliah10[i], nilaiAngka10[i], nilaiHuruf10,
                    bobotNilai10);
        }

        double ipSemester10 = totalbobotSks10 / totalSks10;

        System.out.println("=========================");
        System.out.println("IP Semester : " + String.format("%.2f", ipSemester10));
        System.out.println("=========================");
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

    public static double konversiNilaiSetara(double nilaiAngka10) {
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