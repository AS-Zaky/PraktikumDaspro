package jobsheet12;
import java.util.Scanner;

public class RekapPenjualanCafe04 {

    static Scanner input = new Scanner(System.in);
    static String[] namaMenu;
    static int[][] penjualan;
    static int jmlMenu, jmlHari;

    // 1. Input data penjualan
    static void inputData() {
        System.out.println("\n--- Input Data Penjualan ---");
        for (int i = 0; i < jmlMenu; i++) {
            System.out.println("\nInput penjualan untuk menu: " + namaMenu[i]);
            for (int j = 0; j < jmlHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = input.nextInt();
            }
        }
    }

    // 2. Tampilkan seluruh data penjualan dalam bentuk tabel
    static void tampilTabel() {
        System.out.println("\n===== TABEL PENJUALAN CAFE =====");
        System.out.printf("%-15s", "Menu");

        for (int h = 1; h <= jmlHari; h++) {
            System.out.printf("Hari %d\t", h);
        }
        System.out.println();

        for (int i = 0; i < jmlMenu; i++) {
            System.out.printf("%-15s", namaMenu[i]);
            for (int j = 0; j < jmlHari; j++) {
                System.out.printf("%d\t", penjualan[i][j]);
            }
            System.out.println();
        }
    }

    // 3. Menu dengan total penjualan tertinggi
    static void menuTertinggi() {
        int maxTotal = -1;
        String menuMax = "";

        for (int i = 0; i < jmlMenu; i++) {
            int total = 0;
            for (int j = 0; j < jmlHari; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                menuMax = namaMenu[i];
            }
        }

        System.out.println("\nMenu dengan total penjualan tertinggi:");
        System.out.println(menuMax + " = " + maxTotal + " porsi");
    }

    // 4. Rata-rata penjualan tiap menu
    static void rataRataMenu() {
        System.out.println("\n--- RATA-RATA PENJUALAN SETIAP MENU ---");
        for (int i = 0; i < jmlMenu; i++) {
            int total = 0;
            for (int j = 0; j < jmlHari; j++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / jmlHari;
            System.out.println(namaMenu[i] + ": " + rata);
        }
    }

    // MAIN
    public static void main(String[] args) {

        System.out.print("Masukkan jumlah menu: ");
        jmlMenu = input.nextInt();
        input.nextLine(); // buang newline

        namaMenu = new String[jmlMenu];
        for (int i = 0; i < jmlMenu; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            namaMenu[i] = input.nextLine();
        }

        System.out.print("Masukkan jumlah hari penjualan: ");
        jmlHari = input.nextInt();

        penjualan = new int[jmlMenu][jmlHari];

        inputData();
        tampilTabel();
        menuTertinggi();
        rataRataMenu();
    }
}
