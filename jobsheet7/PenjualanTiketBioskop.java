package jobsheet7;
import java.util.Scanner;

public class PenjualanTiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int hargaTiket = 50000;
        int jumlahPelanggan, tiket, totalTiket = 0;
        double totalPenjualan = 0, totalHarga;

        System.out.print("Masukkan jumlah pelanggan hari ini: ");
        jumlahPelanggan = sc.nextInt();

        for (int i = 1; i <= jumlahPelanggan; i++) {
            System.out.println("\nPelanggan ke-" + i);
            while (true) {
                System.out.print("Masukkan jumlah tiket yang dibeli: ");
                tiket = sc.nextInt();

                if (tiket < 0) {
                    System.out.println("Input tidak valid! Jumlah tiket tidak boleh negatif. Silakan masukkan lagi.");
                    continue;
                }

                // Hitung harga dengan diskon sesuai ketentuan
                if (tiket > 10) {
                    totalHarga = tiket * hargaTiket * 0.85; // diskon 15%
                } else if (tiket > 4) {
                    totalHarga = tiket * hargaTiket * 0.90; // diskon 10%
                } else {
                    totalHarga = tiket * hargaTiket; // tanpa diskon
                }

                System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);

                totalTiket += tiket;
                totalPenjualan += totalHarga;
                break; // keluar dari while ke pelanggan berikutnya
            }
        }

        System.out.println("\n=== LAPORAN PENJUALAN HARI INI ===");
        System.out.println("Total tiket terjual: " + totalTiket + " lembar");
        System.out.println("Total pendapatan: Rp " + totalPenjualan);

        sc.close();
    }
}
