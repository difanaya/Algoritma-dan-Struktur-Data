package minggu13.tugas2;
import java.util.Scanner;

public class MainFilm10 {
    public static void masc10(String[] args) {
        DoubleLinkedListsFilm10 daftarFilm = new DoubleLinkedListsFilm10();
        Scanner sc10 = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("==============================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("==============================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("==============================");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = sc10.nextInt();
            sc10.nextLine(); 

            try {
                switch (pilihan) {
                    case 1:
                        daftarFilm.tambahAwal();
                        break;
                    case 2:
                        daftarFilm.tambahAkhir();
                        break;
                    case 3:
                        daftarFilm.tambahIndex();
                        break;
                    case 4:
                        daftarFilm.hapusFilmPertama();
                        break;
                    case 5:
                        daftarFilm.hapusFilmTerakhir();
                        break;
                    case 6:
                        daftarFilm.hapusFilmIndex();
                        break;
                    case 7:
                        daftarFilm.cetakDaftarFilm();
                        break;
                    case 8:
                        daftarFilm.cariFilmById();
                        break;
                    case 9:
                        daftarFilm.urutkanRatingDSC();
                        break;
                    case 10:
                        System.out.println("Terima kasih, program selesai.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }
            System.out.println();
        } while (pilihan != 10);

        sc10.close();
    }
}