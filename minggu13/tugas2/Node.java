package minggu13.tugas2;

public class Node {
    int idFilm;
    String judulFilm;
    double rating;
    Node prev;
    Node next;

    public Node(int idFilm, String judulFilm, double rating) {
        this.idFilm = idFilm;
        this.judulFilm = judulFilm;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}