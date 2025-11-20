package jobsheet9;
import java.util.Scanner;

public class Tugas02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 0) {
            System.out.println("Jumlah pesanan harus > 0.");
            sc.close();
            return;
        }

        String[] namaPesanan = new String[n];
        double[] hargaPesanan = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Harga pesanan ke-" + (i + 1) + ": ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine();
        }

        double total = 0;
        for (int i = 0; i < n; i++) {
            total += hargaPesanan[i];
        }

        System.out.println("\n=== Daftar Pesanan ===");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d. %-20s : %.2f%n", (i + 1), namaPesanan[i], hargaPesanan[i]);
        }

        System.out.printf("%nTotal biaya: %.2f%n", total);

        sc.close();
    }
}
