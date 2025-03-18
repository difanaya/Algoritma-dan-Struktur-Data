package Praktikum05;
import java.util.Scanner;

public class MainDosen10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataDosen10 daftarDosen = new DataDosen10();
        int pilihan;

        do {
            System.out.println("\nMENU:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting Usia ASC (Bubble Sort)");
            System.out.println("4. Sorting Usia DSC (Selection Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    if (daftarDosen.idx < 10) {
                        System.out.print("Kode: ");
                        String kode = scanner.nextLine();
                        System.out.print("Nama: ");
                        String nama = scanner.nextLine();
                        System.out.print("Jenis Kelamin (L/P): ");
                        char jk = scanner.next().charAt(0);
                        boolean jenisKelamin = (jk == 'L' || jk == 'l');
                        System.out.print("Usia: ");
                        int usia = scanner.nextInt();

                        Dosen10 dsn = new Dosen10(kode, nama, jenisKelamin, usia);
                        daftarDosen.tambah(dsn);
                        System.out.println("Data dosen berhasil ditambahkan!");
                    } else {
                        System.out.println("Data dosen sudah penuh!");
                    }
                    break;
                case 2:
                    System.out.println("\nData Dosen:");
                    daftarDosen.tampil();
                    break;
                case 3:
                    daftarDosen.SortingASC();
                    break;
                case 4:
                    daftarDosen.SortingDSC();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}