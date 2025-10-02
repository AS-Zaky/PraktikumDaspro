package jobsheet5;
import java.util.Scanner;

public class WifiAksesKampus04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.println("--- Sistem Akses WIFI Kampus ---");
        System.out.print("Apakah Anda mahasiswa aktif? (Ya/Tidak): ");
        String mhsAktif = sc.nextLine().trim();

        if (mhsAktif.equalsIgnoreCase("Ya")) {
            System.out.print("Anda Mahasiswa aktif. Silakan massukan password WiFi JTI-Polinema: ");
            String pwwifi = sc.nextLine().trim();
            if (pwwifi.equals("jtifast!")) {
                pesan = "Selamat anda terhubung ke WiFi JTI-Polinema";
            } else {
                pesan = "Password anda salah!";
            }
        } else {
            pesan = "Hanya Mahasiswa aktif yang boleh menggunakan WiFi!";
        }

        System.out.println(pesan);
    }
}
