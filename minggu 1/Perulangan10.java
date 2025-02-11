import java.util.Scanner;

public class Perulangan10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nim;
        int n;

        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();

        n = Integer.parseInt(nim.substring(nim.length() - 2));

        if (n < 10) {
            n += 10;
        }

        System.out.println("========================");
        System.out.println("N : " + n);
        System.out.print("");

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print("* ");
            } else if (i == 6 || i == 10) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}