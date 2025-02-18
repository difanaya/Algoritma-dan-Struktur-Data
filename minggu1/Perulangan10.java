import java.util.Scanner;

public class Perulangan10 {
    public static void main(String[] args) {
        Scanner Difa = new Scanner(System.in);
        String nim10;
        int n10;

        System.out.print("Masukkan NIM: ");
        nim10 = Difa.nextLine();

        n10= Integer.parseInt(nim10.substring(nim10.length()-2));

        if (n10 < 10) {
            n10 += 10;
        }

        System.out.println("========================");
        System.out.println("N : " + n10);
        System.out.print("");

        for (int i = 1; i <= n10; i++) {
            if (i % 2 != 0) {
                System.out.print("* ");
            } else if (i == 6 || i == 10) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
        Difa.close();
    }
}