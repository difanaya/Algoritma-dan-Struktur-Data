package minggu14;
//Menyimpan riwayat transaksi
public class QueueTransaksi {
    TransaksiPengisian[] transaksiArray; //array untuk menyimpan objek transaksi.
    int front, rear, size, capacity; 

    QueueTransaksi(int capacity) { //Konstruktor untuk menginisialisasi antrian berdasarkan kapasitas yang ditentukan.
        this.capacity = capacity; 
        transaksiArray = new TransaksiPengisian[capacity]; 
        front = size = 0;
        rear = -1; 
    }

    void enqueue(TransaksiPengisian transaksi) { //Menambahkan Transaksi ke Antrian
        if (size == capacity) { 
            System.out.println("Riwayat transaksi penuh!");
            return;
        }
        rear = (rear + 1) % capacity; 
        transaksiArray[rear] = transaksi; //Simpan transaksi
        size++; //Update jumlah data
    }

    void tampilkanRiwayat() { 
        if (size == 0) {
            System.out.println("Belum ada transaksi.");
            return;
        }

        System.out.println("-- Riwayat Transaksi --"); 
        System.out.println("Daftar Transaksi:");

        for (int i = 0; i < size; i++) { //Looping melalui semua transaksi: indeks i dari 0 sampai size - 1.
            int idx = (front + i) % capacity; 
            transaksiArray[idx].tampilkanRingkas();
        }
    }
}