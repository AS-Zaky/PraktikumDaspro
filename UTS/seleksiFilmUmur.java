package UTS;
import java.util.Scanner;

public class seleksiFilmUmur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Program Pemilihan Film ===");
        System.out.print("Masukkan Usia Anda: ");
        int usia = sc.nextInt();

        if (usia < 12) {
            System.out.println("=== Seleksi Film Anak-Anak ===");
            System.out.println("1. Doraemon");
            System.out.println("2. Ninja hatori");
            System.out.println("3. Naruto");
        }else if (usia < 17) {
            System.out.println("=== Seleksi Film Remaja ===");
            System.out.println("1. Conjuring");
            System.out.println("2. Horror Apaja");
            System.out.println("3. Film Romatins");
        } else {
            System.out.println("=== Seleksi Film Dewasa ===");
            System.out.println("1. Film Dewasa 1");
            System.out.println("2. Film Dewasa 2");
            System.out.println("3. Film Dewasa 3");
        }
        sc.close();
    }
}
