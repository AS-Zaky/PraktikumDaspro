package jobsheet8;
import java.util.Scanner;

public class NilaiKelompok04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai;
        float totalNilai, rataNilai;
        float tertinggi = 0;
        int kelompokTertinggi = 0;

        int i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.print(" Nilai dari kelompok Penilai" + j + " : ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;

            if (rataNilai > tertinggi) {
                tertinggi = rataNilai;
                kelompokTertinggi = i;
            }
            i++;
        }

        System.out.println("\nKelompok dengan rata-rata tertinggi adalah Kelompok " + kelompokTertinggi + " dengan nilai rata-rata " + tertinggi);
        sc.close();
    }
}
