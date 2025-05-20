package minggu12.tugas1;
import java.util.Scanner;
public class VaksinasiMain10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VaksinQueue10 antrian = new VaksinQueue10();
        int pilihan;

        do {
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantre Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine(); 
            switch (pilihan) {
                case 1:
                    System.out.println("---------------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("---------------------------------");
                    System.out.print("Nomor Antrian: ");
                    int nomor = input.nextInt();
                    input.nextLine();
                    System.out.print("Nama Penerima: ");
                    String nama = input.nextLine();
                    antrian.enqueue(nomor, nama);
                    break;

                case 2:
                    antrian.dequeue();
                    antrian.printQueue();
                    break;

                case 3:
                    antrian.printQueue();
                    break;

                case 4:
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 4);
    }
}