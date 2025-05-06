package minggu10.Tugas;

public class AntrianKRS10 {
    Mahasiswa10[] antrian;
    int front, rear, countKRS;

    public AntrianKRS10(int kapasitas) {
        antrian = new Mahasiswa10[kapasitas];
        front = 0;
        rear = 0;
        countKRS = 0;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public boolean isFull() {
        return rear == antrian.length;
    }

    public void clear() {
        front = 0;
        rear = 0;
        countKRS = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void enqueue(Mahasiswa10 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh.");
        } else {
            antrian[rear++] = mhs;
            System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
        }
    }

    public void dequeueTwo() {
        if (rear - front >= 2) {
            System.out.println("Memproses 2 mahasiswa:");
            for (int i = 0; i < 2; i++) {
                antrian[front++].tampil();
                System.out.println();
                countKRS++;
            }
        } else if (rear - front == 1) {
            System.out.println("Hanya 1 mahasiswa di antrian:");
            antrian[front++].tampil();
            countKRS++;
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar antrian:");
            for (int i = front; i < rear; i++) {
                System.out.print((i - front + 1) + ".");
                antrian[i].tampil();
                System.out.println();
            }
        }
    }

    public void printFirstTwo() {
        if (rear - front >= 2) {
            System.out.println("2 Antrian terdepan:");
            for (int i = front; i < front + 2; i++) {
                antrian[i].tampil();
                System.out.println();
            }
        } else {
            System.out.println("Antrian kurang dari 2.");
        }
    }

    public void printLast() {
        if (!isEmpty()) {
            System.out.println("Antrian paling akhir:");
            antrian[rear - 1].tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public int getTotal() {
        return rear - front;
    }

    public int getProcessed() {
        return countKRS;
    }

    public int getRemaining() {
        return 30 - countKRS;
    }
}