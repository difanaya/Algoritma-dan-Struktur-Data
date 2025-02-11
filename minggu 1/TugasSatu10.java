import java.util.Scanner;

public class TugasSatu10 {
    public static void main(String[] args) {
        Scanner Difa = new Scanner(System.in);

        char Kode10[] = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char Kota10[][] = {
                { 'B', 'A', 'N', 'T', 'E', 'N' }, { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' }, { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'B', 'O', 'G', 'O', 'R' }, { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' }, { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' }, { 'T', 'E', 'G', 'A', 'L' }
        };

        System.out.print("Masukkan kode plat nomor : ");
        char kode10 = Difa.next().toUpperCase().charAt(0);
        boolean kodeDitemukan10 = false;
        int index10 = 0;
        for (int i = 0; i < Kode10.length; i++) {
            if (Kode10[i] == kode10) {
                kodeDitemukan10 = true;
                index10 = i;
                break;
            }
        }

        if (kodeDitemukan10) {
            System.out.print("Kota pencarian kode plat " + kode10 + " adalah : ");
            for (int i = 0; i < Kota10[index10].length; i++) {
                System.out.print(Kota10[index10][i] + "");
            }
        } else {
            System.out.println("Kode plat tidak ditemukan!");
        }
    }
}