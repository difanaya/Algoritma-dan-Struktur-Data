package minggu16.latihanuas;

//public class hi {
    // Universitas X memiliki sistem akademik yang mencatat:

    // Data mahasiswa (NIM, nama, IPK)
    // Data nilai per matakuliah
    // Proses sorting dan pencarian nilai
    // Pengarsipan surat mahasiswa
    // Antrian persetujuan KRS
    // Struktur data dinamis (Linked List, Tree)
    // Pengelolaan data koleksi (Java Collections)

    import java.util.*;

class Mahasiswa {
    String nim, nama;
    double ipk;

    Mahasiswa(String nim, String nama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    void tampil() {
        System.out.println(nim + " - " + nama + " - IPK: " + ipk);
    }
}

public class UASCase {

    static Scanner sc = new Scanner(System.in);

    // A. Brute Force dan Divide and Conquer
    static int faktorialBF(int n) {
        int hasil = 1;
        for (int i = 1; i <= n; i++) hasil *= i;
        return hasil;
    }

    static int faktorialDC(int n) {
        if (n == 1) return 1;
        return n * faktorialDC(n - 1);
    }

    // B. Sorting
    static void bubbleSort(Mahasiswa[] mhs) {
        for (int i = 0; i < mhs.length - 1; i++) {
            for (int j = 0; j < mhs.length - i - 1; j++) {
                if (mhs[j].ipk < mhs[j + 1].ipk) {
                    Mahasiswa temp = mhs[j];
                    mhs[j] = mhs[j + 1];
                    mhs[j + 1] = temp;
                }
            }
        }
    }

    static int sequentialSearch(Mahasiswa[] mhs, double ipk) {
        for (int i = 0; i < mhs.length; i++) {
            if (mhs[i].ipk == ipk) return i;
        }
        return -1;
    }

    static int binarySearch(Mahasiswa[] mhs, double ipk, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (mhs[mid].ipk == ipk) return mid;
            else if (mhs[mid].ipk < ipk) return binarySearch(mhs, ipk, left, mid - 1);
            else return binarySearch(mhs, ipk, mid + 1, right);
        }
        return -1;
    }

    // C. Stack (Surat Mahasiswa)
    static void stackDemo() {
        Stack<String> surat = new Stack<>();
        surat.push("Surat 1");
        surat.push("Surat 2");
        System.out.println("Pop: " + surat.pop());
    }

    // D. Queue (Antrian KRS)
    static void queueDemo() {
        Queue<String> krs = new LinkedList<>();
        krs.add("Mahasiswa A");
        krs.add("Mahasiswa B");
        System.out.println("Dilayani: " + krs.poll());
    }

    // E. Linked List
    static void linkedListDemo() {
        LinkedList<Mahasiswa> list = new LinkedList<>();
        list.add(new Mahasiswa("001", "Difa", 3.8));
        list.addFirst(new Mahasiswa("002", "Naya", 3.9));
        list.removeIf(m -> m.nama.equals("Difa"));
        list.forEach(Mahasiswa::tampil);
    }

    // F. TreeSet dan ArrayList
    static void collectionDemo() {
        ArrayList<String> matkul = new ArrayList<>();
        matkul.add("PBO");
        matkul.add("ASD");

        TreeSet<String> matkulSet = new TreeSet<>(matkul);

        System.out.println("ArrayList: " + matkul);
        System.out.println("TreeSet: " + matkulSet);
    }

    // Menu utama
    public static void main(String[] args) {
        Mahasiswa[] data = {
            new Mahasiswa("001", "Difa", 3.5),
            new Mahasiswa("002", "Naya", 3.9),
            new Mahasiswa("003", "Raka", 3.1)
        };

        int pilihan;
        do {
            System.out.println("\n===== MENU UTAMA =====");
            System.out.println("1. Faktorial");
            System.out.println("2. Sorting IPK");
            System.out.println("3. Cari IPK");
            System.out.println("4. Stack Surat");
            System.out.println("5. Queue KRS");
            System.out.println("6. Linked List");
            System.out.println("7. Koleksi Matkul (ArrayList & TreeSet)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Faktorial 5 (BF): " + faktorialBF(5));
                    System.out.println("Faktorial 5 (DC): " + faktorialDC(5));
                    break;
                case 2:
                    bubbleSort(data);
                    for (Mahasiswa m : data) m.tampil();
                    break;
                case 3:
                    System.out.print("Masukkan IPK yang dicari: ");
                    double cari = sc.nextDouble();
                    int idxSeq = sequentialSearch(data, cari);
                    int idxBin = binarySearch(data, cari, 0, data.length - 1);
                    System.out.println("Sequential: " + idxSeq + ", Binary: " + idxBin);
                    break;
                case 4:
                    stackDemo();
                    break;
                case 5:
                    queueDemo();
                    break;
                case 6:
                    linkedListDemo();
                    break;
                case 7:
                    collectionDemo();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}


