package jobsheet5;
import java.util.Scanner;

public class PerpustakaanAccess04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Sistem Perpustakaan Kampus ---");
        System.out.print("Apakah membawa kartu mahasiswa? (Ya/Tidak): ");
        String bawaKartu = sc.nextLine().trim();

        System.out.print("Apakah sudah registrasi online? (Ya/Tidak): ");
        String registrasiOnline = sc.nextLine().trim();

        if (bawaKartu.equalsIgnoreCase("Ya") || registrasiOnline.equalsIgnoreCase("Ya")) {
            System.out.println("Izin masuk diberikan.");
        } else {
            System.out.println("Ditolak masuk, tidak memenuhi syarat.");
        }
    }
}
