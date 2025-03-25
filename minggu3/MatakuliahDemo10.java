package minggu3;
import java.util.Scanner;
public class MatakuliahDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatakuliah = Integer.parseInt(sc.nextLine());
        Matakuliah10[] arrayOfMatakuliah = new Matakuliah10[jumlahMatakuliah];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1) + ": ");
            arrayOfMatakuliah[i] = new Matakuliah10(); 
            arrayOfMatakuliah[i].tambahData(); 
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1) + ": ");
            arrayOfMatakuliah[i].cetakInfo(); 
        }
    }
}
