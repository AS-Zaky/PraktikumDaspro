package jobsheet7;
import java.util.Scanner;

public class nilaiMahasiswa {
    public static void main(String[] args) {
        double nilai;
        double tertinggi = 0;
        double terendah = 100;
        int lulus = 0, tidakLulus = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }

            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        System.out.println("\n=== HASIL AKHIR ===");
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Jumlah mahasiswa lulus     : " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);

        sc.close();
    }
}
