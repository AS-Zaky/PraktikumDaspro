import java.util.ArrayList;
import java.util.Scanner;

public class SistemBeasiswa {
    // ArrayList untuk menyimpan data pendaftar (array 2D dinamis)
    private static ArrayList<String[]> dataPendaftar = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // Index kolom untuk memudahkan akses data
    private static final int NAMA = 0;
    private static final int NIM = 1;
    private static final int IPK = 2;
    private static final int JENIS = 3;
    private static final int PENGHASILAN = 4;

    public static void main(String[] args) {
        int pilihan;

        do {
            tampilkanMenu();
            pilihan = inputInteger("Pilih menu: ");
            System.out.println();

            switch (pilihan) {
                case 1:
                    tambahPendaftar();
                    break;
                case 2:
                    tampilkanSemuaData();
                    break;
                case 3:
                    cariByJenisBeasiswa();
                    break;
                case 4:
                    hitungRataRataIPK();
                    break;
                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih 1-5.");
            }

            if (pilihan != 5) {
                System.out.println("\nTekan Enter untuk melanjutkan...");
                scanner.nextLine();
            }

        } while (pilihan != 5);

        scanner.close();
    }

    private static void tampilkanMenu() {
        System.out.println("\n╔════════════════════════════════════════════════╗");
        System.out.println("║   SISTEM PENDAFTARAN BEASISWA MAHASISWA        ║");
        System.out.println("╚════════════════════════════════════════════════╝");
        System.out.println("1. Tambah Data Pendaftar Beasiswa");
        System.out.println("2. Tampilkan Semua Data Pendaftar");
        System.out.println("3. Cari Data Berdasarkan Jenis Beasiswa");
        System.out.println("4. Hitung Rata-rata IPK per Jenis Beasiswa");
        System.out.println("5. Keluar");
        System.out.println("════════════════════════════════════════════════");
    }

    private static void tambahPendaftar() {
        System.out.println("═══ TAMBAH DATA PENDAFTAR BEASISWA ═══\n");

        // Input nama
        System.out.print("Nama Mahasiswa: ");
        String nama = scanner.nextLine().trim();

        // Input NIM
        System.out.print("NIM: ");
        String nim = scanner.nextLine().trim();

        // Input IPK dengan validasi
        double ipk = 0;
        boolean validIPK = false;
        while (!validIPK) {
            ipk = inputDouble("IPK Terakhir (0.00 - 4.00): ");
            if (ipk >= 0 && ipk <= 4.0) {
                validIPK = true;
            } else {
                System.out.println("❌ IPK harus antara 0.00 - 4.00!");
            }
        }

        // Input jenis beasiswa dengan validasi
        String jenisBeasiswa = "";
        boolean validJenis = false;
        while (!validJenis) {
            System.out.print("Jenis Beasiswa (Reguler/Unggulan/Riset): ");
            jenisBeasiswa = scanner.nextLine().trim();

            if (jenisBeasiswa.equalsIgnoreCase("Reguler") ||
                jenisBeasiswa.equalsIgnoreCase("Unggulan") ||
                jenisBeasiswa.equalsIgnoreCase("Riset")) {
                // Kapitalisasi huruf pertama
                jenisBeasiswa = jenisBeasiswa.substring(0, 1).toUpperCase() +
                                jenisBeasiswa.substring(1).toLowerCase();
                validJenis = true;
            } else {
                System.out.println("❌ Jenis beasiswa hanya boleh: Reguler, Unggulan, atau Riset!");
            }
        }

        // Input penghasilan orang tua dengan validasi
        long penghasilan = 0;
        boolean validPenghasilan = false;
        while (!validPenghasilan) {
            penghasilan = inputLong("Penghasilan Orang Tua (Rp): ");
            if (penghasilan >= 0 && penghasilan <= 2000000) {
                validPenghasilan = true;
            } else {
                System.out.println("❌ Penghasilan orang tua maksimal Rp 2.000.000!");
            }
        }

        // Simpan data ke ArrayList
        String[] pendaftar = new String[5];
        pendaftar[NAMA] = nama;
        pendaftar[NIM] = nim;
        pendaftar[IPK] = String.valueOf(ipk);
        pendaftar[JENIS] = jenisBeasiswa;
        pendaftar[PENGHASILAN] = String.valueOf(penghasilan);

        dataPendaftar.add(pendaftar);

        System.out.println("\n✓ Data pendaftar berhasil ditambahkan!");
    }

    private static void tampilkanSemuaData() {
        System.out.println("═══ DAFTAR PENDAFTAR BEASISWA ═══\n");

        if (dataPendaftar.isEmpty()) {
            System.out.println("Belum ada data pendaftar.");
            return;
        }

        // Header tabel
        System.out.println("╔════╦══════════════════════╦════════════╦══════╦═══════════╦═════════════════╗");
        System.out.println("║ No ║ Nama                 ║ NIM        ║ IPK  ║ Beasiswa  ║ Penghasilan     ║");
        System.out.println("╠════╬══════════════════════╬════════════╬══════╬═══════════╬═════════════════╣");

        // Data
        for (int i = 0; i < dataPendaftar.size(); i++) {
            String[] data = dataPendaftar.get(i);
            System.out.printf("║ %-2d ║ %-20s ║ %-10s ║ %-4s ║ %-9s ║ Rp %-12s ║%n",
                i + 1,
                data[NAMA].length() > 20 ? data[NAMA].substring(0, 20) : data[NAMA],
                data[NIM],
                data[IPK],
                data[JENIS],
                formatRupiah(Long.parseLong(data[PENGHASILAN]))
            );
        }

        System.out.println("╚════╩══════════════════════╩════════════╩══════╩═══════════╩═════════════════╝");
        System.out.println("Total pendaftar: " + dataPendaftar.size());
    }

    private static void cariByJenisBeasiswa() {
        System.out.println("═══ CARI DATA BERDASARKAN JENIS BEASISWA ═══\n");

        if (dataPendaftar.isEmpty()) {
            System.out.println("Belum ada data pendaftar.");
            return;
        }

        System.out.println("Pilih jenis beasiswa:");
        System.out.println("1. Reguler");
        System.out.println("2. Unggulan");
        System.out.println("3. Riset");
        int pilihan = inputInteger("Pilihan: ");

        String jenisBeasiswa = "";
        switch (pilihan) {
            case 1: jenisBeasiswa = "Reguler"; break;
            case 2: jenisBeasiswa = "Unggulan"; break;
            case 3: jenisBeasiswa = "Riset"; break;
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }

        // Cari data dengan jenis beasiswa yang dipilih
        ArrayList<String[]> hasilCari = new ArrayList<>();
        for (String[] data : dataPendaftar) {
            if (data[JENIS].equalsIgnoreCase(jenisBeasiswa)) {
                hasilCari.add(data);
            }
        }

        if (hasilCari.isEmpty()) {
            System.out.println("\nTidak ada pendaftar dengan jenis beasiswa " + jenisBeasiswa);
            return;
        }

        System.out.println("\n═══ HASIL PENCARIAN: Beasiswa " + jenisBeasiswa + " ═══\n");

        // Header tabel
        System.out.println("╔════╦══════════════════════╦════════════╦══════╦═════════════════╗");
        System.out.println("║ No ║ Nama                 ║ NIM        ║ IPK  ║ Penghasilan     ║");
        System.out.println("╠════╬══════════════════════╬════════════╬══════╬═════════════════╣");

        // Data
        for (int i = 0; i < hasilCari.size(); i++) {
            String[] data = hasilCari.get(i);
            System.out.printf("║ %-2d ║ %-20s ║ %-10s ║ %-4s ║ Rp %-12s ║%n",
                i + 1,
                data[NAMA].length() > 20 ? data[NAMA].substring(0, 20) : data[NAMA],
                data[NIM],
                data[IPK],
                formatRupiah(Long.parseLong(data[PENGHASILAN]))
            );
        }

        System.out.println("╚════╩══════════════════════╩════════════╩══════╩═════════════════╝");
        System.out.println("Total pendaftar: " + hasilCari.size());
    }

    private static void hitungRataRataIPK() {
        System.out.println("═══ RATA-RATA IPK PER JENIS BEASISWA ═══\n");

        if (dataPendaftar.isEmpty()) {
            System.out.println("Belum ada data pendaftar.");
            return;
        }

        String[] jenisBeasiswa = {"Reguler", "Unggulan", "Riset"};

        System.out.println("╔═══════════╦═══════╦══════════════╗");
        System.out.println("║ Beasiswa  ║ Jml   ║ Rata-rata    ║");
        System.out.println("╠═══════════╬═══════╬══════════════╣");

        for (String jenis : jenisBeasiswa) {
            double totalIPK = 0;
            int jumlah = 0;

            for (String[] data : dataPendaftar) {
                if (data[JENIS].equalsIgnoreCase(jenis)) {
                    totalIPK += Double.parseDouble(data[IPK]);
                    jumlah++;
                }
            }

            String rataRata = jumlah > 0 ? String.format("%.2f", totalIPK / jumlah) : "N/A";

            System.out.printf("║ %-9s ║ %-5d ║ %-12s ║%n", jenis, jumlah, rataRata);
        }

        System.out.println("╚═══════════╩═══════╩══════════════╝");
    }

    // Helper methods untuk input
    private static int inputInteger(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int value = Integer.parseInt(scanner.nextLine().trim());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("❌ Input harus berupa angka!");
            }
        }
    }

    private static long inputLong(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                long value = Long.parseLong(scanner.nextLine().trim());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("❌ Input harus berupa angka!");
            }
        }
    }

    private static double inputDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double value = Double.parseDouble(scanner.nextLine().trim());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("❌ Input harus berupa angka!");
            }
        }
    }

    private static String formatRupiah(long nilai) {
        return String.format("%,d", nilai).replace(',', '.');
    }
}
