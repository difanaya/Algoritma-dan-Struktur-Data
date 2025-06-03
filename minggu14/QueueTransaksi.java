package minggu14;
//Menyimpan riwayat transaksi
public class QueueTransaksi {
    TransaksiPengisian[] transaksiArray; //transaksiArray: array untuk menyimpan objek transaksi.
    int front, rear, size, capacity; //front: indeks awal, rear: indeks akhir, size: jumlah elemen

    QueueTransaksi(int capacity) { //Konstruktor untuk menginisialisasi antrian berdasarkan kapasitas yang ditentukan.
        this.capacity = capacity; //capacity: kapasitas maksimum antrian.
        transaksiArray = new TransaksiPengisian[capacity]; //Membuat array dengan kapasitas tertentu.
        front = size = 0; //Belum ada data yang dimasukkan.
        rear = -1; //Belum ada elemen, jadi rear dimulai dari -1.
    }

    void enqueue(TransaksiPengisian transaksi) { //Menambahkan Transaksi ke Antrian
        if (size == capacity) { //Jika size == capacity, tampilkan pesan “Riwayat transaksi penuh!” dan keluar dari method.
            System.out.println("Riwayat transaksi penuh!");
            return;
        }
        rear = (rear + 1) % capacity; //Naikkan rear secara melingkar, Ini menghindari ArrayIndexOutOfBoundsException saat rear mencapai batas akhir array.
        transaksiArray[rear] = transaksi; //Simpan transaksi
        size++; //Update jumlah data
    }

    void tampilkanRiwayat() { //Menampilkan Semua Transaksi
        if (size == 0) { //Cek apakah kosong
            System.out.println("Belum ada transaksi.");
            return;
        }

        System.out.println("-- Riwayat Transaksi --"); //Cetak header
        System.out.println("Daftar Transaksi:");

        for (int i = 0; i < size; i++) { //Looping melalui semua transaksi: Menggunakan indeks i dari 0 sampai size - 1.
            int idx = (front + i) % capacity; //Karena kita memakai array melingkar (circular array), indeks transaksi bisa "melingkar kembali" ke depan saat mencapai akhir array. (front + i) % capacity memastikan kita selalu berada dalam rentang indeks yang sah (0 sampai capacity - 1).
            transaksiArray[idx].tampilkanRingkas();
        }
    }
}