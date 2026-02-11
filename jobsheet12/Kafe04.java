package jobsheet12;
import java.util.Scanner;

public class Kafe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Menu("Budi", true, "DISKON30");
        daftarPengunjung("Andi");
        daftarPengunjung("Ali", "Budi", "Citra");

        int totalKeseluruhan = 0;
        String lanjut;

        do {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = scanner.nextInt();

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = scanner.nextInt();

            int totalHarga = hitungTotalHarga04(pilihanMenu, banyakItem, "DISKON30");
            totalKeseluruhan += totalHarga;

            System.out.print("Apakah ingin memesan menu lain? (y/n): ");
            lanjut = scanner.next();

        } while (lanjut.equalsIgnoreCase("y"));

        System.out.println("===============================");
        System.out.println("Total keseluruhan pesanan: Rp " + totalKeseluruhan);

        scanner.close();
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid: berikan diskon 50%.");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid: berikan diskon 30%.");
        } else {
            System.out.println("Kode promo tidak valid.");
        }

        System.out.println("==== Menu Resto Kafe04 ====");
        System.out.println("1. Kopi Hitam   - Rp 15.000");
        System.out.println("2. Capuccino    - Rp 22.000");
        System.out.println("3. Latte        - Rp 15.000");
        System.out.println("4. Teh Tarik    - Rp 12.000");
        System.out.println("5. Roti Bakar   - Rp 10.000");
        System.out.println("6. Mie Goreng   - Rp 18.000");
        System.out.println("============================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga04(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaMenu = {15000, 22000, 15000, 12000, 10000, 18000};

        int totalHarga = hargaMenu[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Diskon 50% diterapkan.");
            totalHarga = totalHarga / 2;
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Diskon 30% diterapkan.");
            totalHarga = (int)(totalHarga * 0.7);
        } else {
            System.out.println("Kode promo tidak valid.");
        }

        return totalHarga;
    }

    static void daftarPengunjung(String... namaPengunjung) {
    System.out.println("Daftar nama pengunjung: ");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }
}
