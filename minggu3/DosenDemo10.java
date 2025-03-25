package minggu3;
import java.util.Scanner;
public class DosenDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine();
        Dosen10[] arrayOfDosen10 = new Dosen10[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode         : ");
            String kode = sc.nextLine();
            System.out.print("Nama         : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            String jk = sc.nextLine();
            boolean jenisKelamin = jk.equalsIgnoreCase("Pria");
            System.out.print("Usia         : ");
            int usia = sc.nextInt();
            sc.nextLine(); 
            System.out.println("---------------------------------");

            arrayOfDosen10[i] = new Dosen10(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\nData Dosen yang telah dimasukkan:");
        int index = 0;
        for (Dosen10 dosen : arrayOfDosen10) {
            dosen.cetakInfo(index);
            index++;
        }

        DataDosen10.dataSemuaDosen(arrayOfDosen10);
        DataDosen10.jumlahDosenPerJenisKelamin(arrayOfDosen10);
        DataDosen10.rerataUsiaDosenPerJenisKelamin(arrayOfDosen10);
        DataDosen10.infoDosenPalingTua(arrayOfDosen10);
        DataDosen10.infoDosenPalingMuda(arrayOfDosen10);

        sc.close();
    }
}

