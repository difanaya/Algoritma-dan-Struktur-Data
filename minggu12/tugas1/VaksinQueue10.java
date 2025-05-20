package minggu12.tugas1;

class VaksinQueue10 {
    Node head, tail;
    int size = 0;

    public void enqueue(int nomor, String nama) {
        Node baru = new Node(nomor, nama);
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
        size++;
    }

    public void dequeue() {
        if (head == null) {
            System.out.println("Tidak ada data dalam antrian.");
            return;
        }
        System.out.println(head.nama + " telah selesai divaksinasi.");
        head = head.next;
        if (head != null) head.prev = null;
        else tail = null;
        size--;
    }

    public void printQueue() {
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("Daftar Pengantre Vaksin");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.printf("|%-5s|%-15s|\n", "No.", "Nama");
        System.out.println("------------------------------");

        Node temp = head;
        while (temp != null) {
            System.out.printf("|%-5d|%-15s|\n", temp.nomor, temp.nama);
            temp = temp.next;
        }
        System.out.println("------------------------------");
        System.out.println("Sisa Antrian: " + size);
    }
}

