package jobsheet5;
import java.util.Scanner;

public class ifCetakKRS04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah luna? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        String pesan = (uktLunas) 
            ? "Pembayaran UKT terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA" 
            : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.";

        System.out.println(pesan);

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.");
        }
    }
}
