import java.util.Scanner;

public class TugasTiga10 {
    public static void main(String[] args) {
        Scanner Difa = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n10 = Difa.nextInt();
        Difa.nextLine(); 

        String[] namaMatkul10 = new String[n10];
        int[] sks10 = new int[n10];
        int[] semester10 = new int[n10];
        String[] hariKuliah10 = new String[n10];

        for (int i = 0; i < n10; i++) {
            System.out.println("Mata Kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMatkul10[i] = Difa.nextLine();
            System.out.print("SKS: ");
            sks10[i] = Difa.nextInt();
            System.out.print("Semester: ");
            semester10[i] = Difa.nextInt();
            Difa.nextLine(); 
            System.out.print("Hari Kuliah: ");
            hariKuliah10[i] = Difa.nextLine();
        }

        // Menu pilihan
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari tertentu");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester tertentu");
            System.out.println("4. Mencari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = Difa.nextInt();
            Difa.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanJadwal(namaMatkul10, sks10, semester10, hariKuliah10);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
                    String hari10 = Difa.nextLine();
                    tampilkanJadwalBerdasarkanHari(namaMatkul10, sks10, semester10, hariKuliah10, hari10);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int sem10 = Difa.nextInt();
                    tampilkanJadwalBerdasarkansemester10(namaMatkul10, sks10, semester10, hariKuliah10, sem10);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String namaDicari10 = Difa.nextLine();
                    cariMataKuliah(namaMatkul10, sks10, semester10, hariKuliah10, namaDicari10);
                    break;
                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);

        Difa.close();
    }

    public static void tampilkanJadwal(String[] namaMatkul10, int[] sks10, int[] semester10, String[] hariKuliah10) {
        System.out.println("\nJadwal Kuliah:");
        System.out.printf("%-30s %-5s %-10s %-10s\n", "Nama Mata Kuliah", "sks", "semester", "Hari");
        for (int i = 0; i < namaMatkul10.length; i++) {
            System.out.printf("%-30s %-5d %-10d %-10s\n", namaMatkul10[i], sks10[i], semester10[i], hariKuliah10[i]);
        }
    }

    public static void tampilkanJadwalBerdasarkanHari(String[] namaMatkul10, int[] sks10, int[] semester10, String[] hariKuliah10, String hari) {
        System.out.println("\nJadwal Kuliah Hari " + hari + ":");
        System.out.printf("%-30s %-5s %-10s %-10s\n", "Nama Mata Kuliah", "sks", "semester", "Hari");
        boolean found = false;
        for (int i = 0; i < hariKuliah10.length; i++) {
            if (hariKuliah10[i].equalsIgnoreCase(hari)) {
                System.out.printf("%-30s %-5d %-10d %-10s\n", namaMatkul10[i], sks10[i], semester10[i], hariKuliah10[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hari + ".");
        }
    }

    public static void tampilkanJadwalBerdasarkansemester10(String[] namaMatkul10, int[] sks10, int[] semester10, String[] hariKuliah10, int sem) {
        System.out.println("\nJadwal Kuliah semester " + sem + ":");
        System.out.printf("%-30s %-5s %-10s %-10s\n", "Nama Mata Kuliah", "sks", "semester", "Hari");
        boolean found = false;
        for (int i = 0; i < semester10.length; i++) {
            if (semester10[i] == sem) {
                System.out.printf("%-30s %-5d %-10d %-10s\n", namaMatkul10[i], sks10[i], semester10[i], hariKuliah10[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada jadwal kuliah untuk semester " + sem + ".");
        }
    }

    public static void cariMataKuliah(String[] namaMatkul10, int[] sks10, int[] semester10, String[] hariKuliah10, String namaDicari) {
        boolean found = false;
        for (int i = 0; i < namaMatkul10.length; i++) {
            if (namaMatkul10[i].equalsIgnoreCase(namaDicari)) {
                System.out.printf("Mata Kuliah Ditemukan: %s, sks: %d, semester: %d, Hari: %s\n", 
                                  namaMatkul10[i], sks10[i], semester10[i], hariKuliah10[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Mata kuliah dengan nama " + namaDicari + " tidak ditemukan.");
        }
    }
}