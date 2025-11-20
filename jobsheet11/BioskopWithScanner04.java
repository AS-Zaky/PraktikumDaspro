package jobsheet11;
import java.util.Scanner;

public class BioskopWithScanner04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int pilihan;

        do {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    // INPUT DATA PENONTON
                    while (true) {
                        System.out.print("Masukkan nama : ");
                        String nama = sc.nextLine();

                        int baris, kolom;

                        while (true) {
                            System.out.print("Masukkan baris (1-4): ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom (1-2): ");
                            kolom = sc.nextInt();
                            sc.nextLine(); // buang newline

                            // 3) handle nomor baris/kolom yang tidak tersedia
                            if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                                System.out.println("Nomor kursi tidak tersedia. Silakan input lagi.");
                                continue;
                            }

                            // 4) warning jika kursi sudah terisi
                            if (penonton[baris - 1][kolom - 1] != null) {
                                System.out.println("Kursi sudah terisi oleh: " + penonton[baris - 1][kolom - 1]);
                                System.out.println("Silakan pilih baris dan kolom lain.");
                                continue;
                            }

                            // kalau valid dan kosong, break dari while(true) kursi
                            break;
                        }

                        penonton[baris - 1][kolom - 1] = nama;

                        System.out.print("Input penonton lainnya? (y/n): ");
                        String next = sc.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                    // 5) TAMPILKAN DAFTAR PENONTON (null diganti "***")
                    System.out.println("\nDaftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                            System.out.print(isi + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih. Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }

        } while (pilihan != 3);

        sc.close();
    }
}
