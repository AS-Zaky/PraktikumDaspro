package jobsheet7;
import java.util.Scanner;

public class PembayaranParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.println("\n=== PROGRAM PARKIR ===");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Keluar");
            System.out.print("Masukkan jenis kendaraan: ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) { 
                    total += durasi * 3000; // Mobil
                } else if (jenis == 2) {
                    total += durasi * 2000; // Motor
                }
            } else if (jenis != 0) {
                System.out.println("Jenis kendaraan tidak valid!");
            }

        } while (jenis != 0);

        System.out.println("\nTotal pembayaran parkir hari ini: Rp " + total);
        System.out.println("Program selesai.");
        sc.close();
    }
}
