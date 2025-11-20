package jobsheet9;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Jumlah harus > 0.");
            sc.close();
            return;
        }

        int[] nilai = new int[n];
        long total = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();

            total += nilai[i];
            if (nilai[i] < min) min = nilai[i];
            if (nilai[i] > max) max = nilai[i];
        }

        double rata2 = (double) total / n;


        System.out.print("\nSemua nilai: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilai[i] + (i < n - 1 ? " " : ""));
        }

        System.out.println("nRata-rata nilai: " + rata2);
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah : " + min);

        sc.close();
    }
}

