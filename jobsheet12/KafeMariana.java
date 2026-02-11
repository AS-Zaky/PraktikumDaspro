package jobsheet12;
import java.util.Scanner;

public class KafeMariana {

    static String[] namaMenu = {
        "Kopi",
        "Teh",
        "Es Kelapa Muda",
        "Roti Bakar",
        "Gorengan"
    };

    static int[][] penjualan = new int[5][7];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input data penjualan
        inputDataPenjualan(sc);

        // 2. Tampilkan seluruh data
        tampilkanSemuaData();

        // 3. Tampilkan penjualan tertinggi
        tampilkanMenuTertinggi();

        // 4. Tampilkan rata-rata per menu
        tampilkanRataRata();

        sc.close();
    }

    // Fungsi input data
    static void inputDataPenjualan(Scanner sc) {
        System.out.println("\n=== INPUT DATA PENJUALAN ===");
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("Menu: " + namaMenu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n✔ Data penjualan berhasil diinput.\n");
    }

    // Fungsi tampilkan data tabel
    static void tampilkanSemuaData() {
        System.out.println("=== DATA PENJUALAN ===");
        System.out.print("Menu/Hari\t");
        for (int h = 1; h <= penjualan[0].length; h++) {
            System.out.print("H" + h + "\t");
        }
        System.out.println();

        for (int i = 0; i < penjualan.length; i++) {
            System.out.print(namaMenu[i] + "\t");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Fungsi cari penjualan tertinggi
    static void tampilkanMenuTertinggi() {
        int indexMax = 0;
        int maxTotal = -1;

        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                indexMax = i;
            }
        }

        System.out.println("=== MENU DENGAN PENJUALAN TERTINGGI ===");
        System.out.println("Menu : " + namaMenu[indexMax]);
        System.out.println("Total : " + maxTotal + "\n");
    }

    // Fungsi rata-rata
    static void tampilkanRataRata() {
        System.out.println("=== RATA-RATA PENJUALAN ===");
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / penjualan[i].length;

            System.out.println(namaMenu[i] + " : " + rata);
        }
        System.out.println();
    }
}
