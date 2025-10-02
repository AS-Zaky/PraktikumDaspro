package jobsheet5;
import java.util.Scanner;

public class PerpustakaanAccess04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.println("--- Sistem Perpustakaan Kampus ---");
        System.out.print("Apakah anda anggota perpustakaan? (Ya/Tidak): ");
        String anggota = sc.nextLine().trim();

        if (anggota.equalsIgnoreCase("Ya")) {
            System.out.println("Apakah anda memiliki tanggungan denda? (Ya/Tidak: )");
            String adaDenda = sc.nextLine().trim();

            if (adaDenda.equalsIgnoreCase("Tidak")) {
                System.out.print("Berapa jumlah buku yang sedang anda pinjam saat ini?: ");
                int jumlahDipinjam = sc.nextInt();

                if (jumlahDipinjam < 3) {
                    pesan = "Disetujui: Anda boleh meminjam buku.";
                } else {
                    pesan = "Ditolak: Jumlah buku yang sedang dipinjam suda mencapai batas (>=3).";
                }
            } else {
                pesan = "Ditolak: Harap selesaikan denda terlebih dahulu.";
            }
        } else {
            pesan = "Ditolakk: Hanya anggota yang boleh meminjam buku.";
        }

        System.out.println(pesan);
    }
}
