import java.util.Scanner;

public class TugasDua10 {
    public static void Menu() {
        System.out.println("===================================");
        System.out.println("Program untuk Menghitung Kubus");
        System.out.println("===================================");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
    }
    public static double VolumeKubus(double sisi10) {
        return Math.pow(sisi10, 3);
    }
    public static double LuasPermukaanKubus(double sisi10) {
        return 6 * Math.pow(sisi10, 2);
    }
    public static double KelilingKubus(double sisi10) {
        return 12 * sisi10;
    }

    public static void main(String[] args) {
        Scanner Difa = new Scanner(System.in);
        int pilihan10;
        double sisi10;

        do {
            Menu();
            pilihan10 = Difa.nextInt();

            if (pilihan10 >= 1 && pilihan10 <= 3) {
                System.out.print("Masukkan panjang sisi kubus: ");
                sisi10 = Difa.nextDouble();
            } else if (pilihan10 == 4) {
                System.out.println("Terima kasih! Program selesai.");
                break;
            } else {
                System.out.println("Pilihan angka tidak valid. Silakan coba lagi.");
                continue;
            }

            switch (pilihan10) {
                case 1:
                    double volume = VolumeKubus(sisi10);
                    System.out.printf("Volume kubus: %.2f\n", volume);
                    break;
                case 2:
                    double luasPermukaan = LuasPermukaanKubus(sisi10);
                    System.out.printf("Luas permukaan kubus: %.2f\n", luasPermukaan);
                    break;
                case 3:
                    double keliling = KelilingKubus(sisi10);
                    System.out.printf("Keliling kubus: %.2f\n", keliling);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.println(); 
        } while (true);

        Difa.close();
    }
}