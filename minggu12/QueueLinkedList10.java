package minggu12;

public class QueueLinkedList10 {
    NodeTugas10 front;
    NodeTugas10 rear;
    int size;
    final int max = 100;

    public QueueLinkedList10() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(MahasiswaTugas10 mhs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh!, tidak bisa menambah Mahasiswa baru.");
            return;
        }

        NodeTugas10 newNode = new NodeTugas10(mhs, null);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.printf("MahasiswaTugas10 %s berhasil ditambahkan ke antrian.", mhs.nama);
    }

    public MahasiswaTugas10 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!, tidak ada Mahasiswa yang bisa dipanggil.");
            return null;
        }

        MahasiswaTugas10 mhs = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        System.out.printf("MahasiswaTugas10 %s dipanggil untuk dilayani.", mhs.nama);
        return mhs;
    }

    public MahasiswaTugas10 peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada Mahasiswa terdepan!");
            return null;
        }
        return front.data;
    }

    public MahasiswaTugas10 peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada Mahasiswa terakhir!");
            return null;
        }
        return rear.data;
    }

    public void clear() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong!");
            return;
        }

        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("\nDaftar MahasiswaTugas10 dalam Antrian:");
        System.out.println("--------------------------------");
        NodeTugas10 current = front;
        int nomor = 1;

        while (current != null) {
            System.out.println("Nomor Antrian: " + nomor);
            current.data.tampilInformasi();
            current = current.next;
            nomor++;
        }
    }

    public int size() {
        return size;
    }
}