package jobsheet11;
import java.util.Scanner;

public class Tugas04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] hasil = new int[10][6];
        int total;
        int totalKeseluruhan = 0;
        double rata, rataKeseluruhan;

        // input nilai survey
        for (int i = 0; i < hasil.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < hasil[0].length; j++) {
                System.out.print("  Nilai pertanyaan ke-" + (j + 1) + " (1-5): ");
                hasil[i][j] = sc.nextInt();
            }
        }

        // rata-rata setiap responden
        System.out.println("\nRata-rata per responden:");
        for (int i = 0; i < hasil.length; i++) {
            total = 0;
            for (int j = 0; j < hasil[0].length; j++) {
                total += hasil[i][j];
            }
            rata = (double) total / hasil[0].length;
            System.out.println("Responden ke-" + (i + 1) + " : " + rata);
        }

        // rata-rata setiap pertanyaan
        System.out.println("\nRata-rata per pertanyaan:");
        for (int j = 0; j < hasil[0].length; j++) {
            total = 0;
            for (int i = 0; i < hasil.length; i++) {
                total += hasil[i][j];
            }
            rata = (double) total / hasil.length;
            System.out.println("Pertanyaan ke-" + (j + 1) + " : " + rata);
        }

        // rata-rata keseluruhan
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil[0].length; j++) {
                totalKeseluruhan += hasil[i][j];
            }
        }
        rataKeseluruhan = (double) totalKeseluruhan / (hasil.length * hasil[0].length);

        System.out.println("\nRata-rata keseluruhan: " + rataKeseluruhan);

        sc.close();
    }
}
