package minggu13.tugas2;
import java.util.Scanner;

public class DoubleLinkedListsFilm10 {
    Node head;
    int size;
    Scanner in = new Scanner(System.in);

    DoubleLinkedListsFilm10() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int idFilm, String judulFilm, double rating) {
        Node newNode = new Node(idFilm, judulFilm, rating);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    public void addLast(int idFilm, String judulFilm, double rating) {
        Node newNode = new Node(idFilm, judulFilm, rating);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        size++;
    }

    public void add(int idFilm, String judulFilm, double rating, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        if (index == 0) {
            addFirst(idFilm, judulFilm, rating);
        } else {
            Node newNode = new Node(idFilm, judulFilm, rating);
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
            size++;
        }
    }

    public Node getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head;
    }

    public Node getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    public Node get(int index) throws Exception {
        if (isEmpty() || index < 0 || index >= size) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        size--;
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        }
        if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index < 0 || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("Data film kosong.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println("ID Film: " + current.idFilm);
            System.out.println("    Judul Film: " + current.judulFilm);
            System.out.println("    Rating: " + current.rating);
            current = current.next;
        }
    }

    public void cariFilmById(int id) {
        if (isEmpty()) {
            System.out.println("Data film kosong.");
            return;
        }
        Node current = head;
        int index = 0;
        boolean found = false;
        while (current != null) {
            if (current.idFilm == id) {
                System.out.println("Data Film dengan ID " + id + " berada di node ke- " + (index + 1));
                System.out.println("IDENTITAS:");
                System.out.println("    ID Film: " + current.idFilm);
                System.out.println("    Judul Film: " + current.judulFilm);
                System.out.println("    Rating: " + current.rating);
                found = true;
                break;
            }
            current = current.next;
            index++;
        }
        if (!found) {
            System.out.println("Film dengan ID " + id + " tidak ditemukan.");
        }
    }

    public void urutkanByRatingDescending() {
        if (isEmpty() || size <= 1) {
            return;
        }

        boolean swapped;
        Node current;
        Node last = null;

        do {
            swapped = false;
            current = head;

            while (current.next != last) {
                if (current.rating < current.next.rating) {
                    int tempId = current.idFilm;
                    String tempJudul = current.judulFilm;
                    double tempRating = current.rating;

                    current.idFilm = current.next.idFilm;
                    current.judulFilm = current.next.judulFilm;
                    current.rating = current.next.rating;

                    current.next.idFilm = tempId;
                    current.next.judulFilm = tempJudul;
                    current.next.rating = tempRating;
                    swapped = true;
                }
                current = current.next;
            }
            last = current;
        } while (swapped);
    }

    public void tambahAwal() {
        System.out.println("Masukkan Data Film Posisi Awal");
        System.out.print("ID Film: "); int id = in.nextInt();
        in.nextLine();
        System.out.print("Judul Film: "); String judul = in.nextLine();
        System.out.print("Rating Film: "); double rating = in.nextDouble();
        addFirst(id, judul, rating);
        System.out.println("Data film berhasil ditambahkan di awal.");
    }

    public void tambahAkhir() {
        System.out.println("Masukkan Data Film Posisi Akhir");
        System.out.print("ID Film: "); int id = in.nextInt();
        in.nextLine();
        System.out.print("Judul Film: "); String judul = in.nextLine();
        System.out.print("Rating Film: "); double rating = in.nextDouble();
        addLast(id, judul, rating);
        System.out.println("Data film berhasil ditambahkan di akhir.");
    }

    public void tambahIndex() throws Exception {
        System.out.println("Masukkan Data Film Posisi Index Tertentu");
        System.out.print("Urutan ke-: "); int index = in.nextInt();
        in.nextLine();
        System.out.print("ID Film: "); int id = in.nextInt();
        in.nextLine();
        System.out.print("Judul Film: "); String judul = in.nextLine();
        System.out.print("Rating Film: "); double rating = in.nextDouble();
        add(id, judul, rating, index - 1);
        System.out.println("Data film berhasil ditambahkan di urutan ke- " + index);
    }

    public void hapusFilmPertama() throws Exception {
        removeFirst();
        System.out.println("Data film pertama berhasil dihapus.");
    }

    public void hapusFilmTerakhir() throws Exception {
        removeLast();
        System.out.println("Data film terakhir berhasil dihapus.");
    }

    public void hapusFilmIndex() throws Exception {
        System.out.print("Masukkan urutan data film yang ingin dihapus: ");
        int index = in.nextInt();
        remove(index - 1);
        System.out.println("Data film pada urutan ke- " + index + " berhasil dihapus.");
    }

    public void cetakDaftarFilm() {
        System.out.println("Cetak Data");
        printList();
    }

    public void cariFilmById() {
        System.out.println("Cari Data");
        System.out.print("Masukkan ID Film yang dicari: "); int idCari = in.nextInt();
        cariFilmById(idCari);
    }

    public void urutkanRatingDSC() {
        System.out.println("Urut Data Rating Film-DESC");
        urutkanByRatingDescending();
        System.out.println("Data film berhasil diurutkan berdasarkan rating (descending).");
    }
}