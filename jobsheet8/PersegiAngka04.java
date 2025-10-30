package jobsheet8;
import java.util.Scanner;

public class PersegiAngka04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n (minimal 3): ");
        int n = sc.nextInt();
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print(n + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
