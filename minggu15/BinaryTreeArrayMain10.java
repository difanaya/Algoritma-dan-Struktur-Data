package minggu15;

public class BinaryTreeArrayMain10 {
    public static void main(String[] args) {
        BinaryTreeArray10 bta = new BinaryTreeArray10();

        Mahasiswa10 mh1 = new Mahasiswa10("244160121", "Ali", "A", 3.57);
        Mahasiswa10 mh2 = new Mahasiswa10("244160185", "Candra", "C", 3.41);
        Mahasiswa10 mh3 = new Mahasiswa10("244160221", "Badar", "B", 3.75);
        Mahasiswa10 mh4 = new Mahasiswa10("244160220", "Dewi", "B", 3.35);
        Mahasiswa10 mh5 = new Mahasiswa10("244160131", "Devi", "A", 3.48);
        Mahasiswa10 mh6 = new Mahasiswa10("244160205", "Ehsan", "D", 3.61);
        Mahasiswa10 mh7 = new Mahasiswa10("244160170", "FIzi", "B", 3.86);

        Mahasiswa10[] dataMahasiswa = {mh1, mh2, mh3, mh4, mh5, mh6, mh7, null, null, null};
        int idxLast = 6;

        bta.populateData(dataMahasiswa, idxLast);
        System.out.println("\nInOrder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);
    }
}
