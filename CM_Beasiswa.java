import java.util.Scanner;

public class CM_Beasiswa {
    static Scanner sc = new Scanner(System.in);

    static String[][] data = new String[0][5];
    static int pilihan;

    static void menu() {
        System.out.println("=== Sistem Pendaftaran Beasiswa ===");
        System.out.println("1. Tambah Data Pendaftar Beasiswa");
        System.out.println("2. Tampilkan Semua Pendaftar Beasiswa");
        System.out.println("4. Cari Pendaftar Beasiswa berdasarkan Jenis Beasiswa");
        System.out.println("3. Hitung Rata-rata IPK per Jenis Beasiswa");
        System.out.println("5. Exit");
        System.out.println("=====================================================");
        System.out.print("Masukkan pilihan Anda (1-5): ");
        pilihan = sc.nextInt();
        sc.nextLine(); // Clear newline
    }

    static void tambahDataPendaftar() {
        System.out.println("═══ TAMBAH DATA PENDAFTAR BEASISWA ═══\n");

        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine();

        System.out.print("NIM: ");
        long nim = sc.nextLong();
        sc.nextLine(); // Clear newline

        System.out.print("Masukkan IPK: ");
        double ipk = sc.nextDouble();
        sc.nextLine(); // Clear newline

        System.out.print("Masukkan Jenis Beasiswa: ");
        String jenisBeasiswa = sc.nextLine();

        System.out.print("Masukkan Penghasilan Orang Tua: ");
        String penghasilan = sc.nextLine();

        String[][] newData = new String[data.length + 1][5];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < 5; j++) {
                newData[i][j] = data[i][j];
            }
        }

        newData[data.length][0] = nama;
        newData[data.length][1] = String.valueOf(nim);
        newData[data.length][2] = String.valueOf(ipk);
        newData[data.length][3] = jenisBeasiswa;
        newData[data.length][4] = penghasilan;

        data = newData;

        System.out.println("Data berhasil ditambahkan!\n");
    }

    private static void tampilkanSemua() {
        System.out.println("\n=== Daftar Seluruh Pendaftar Beasiswa ===");
        if (data.length == 0) {
            System.out.println("Belum ada data pendaftar.");
            return;
        }

        System.out.printf("%-3s %-25s %-15s %-8s %-10s %-15s%n",
                "No", "Nama", "NIM", "IPK", "Jenis", "Penghasilan");

        System.out.println("-------------------------------------------------------------------------");

        for (int i = 0; i < data.length; i++) {
            String nama = (String) data[i][0];
            long nim = Long.parseLong(data[i][1]);
            double ipk = Double.parseDouble(data[i][2]);
            String jenis = (String) data[i][3];
            String penghasilan = (String) data[i][4];
            System.out.printf("%-3d %-25s %-15d %-8.2f %-10s Rp %-12s%n",
                    (i + 1), nama, nim, ipk, jenis, penghasilan);
        }
    }

    public static void main(String[] args) {
        do {
            menu();
            switch (pilihan) {
                case 1:
                    tambahDataPendaftar();
                    break;
                case 2:
                    tampilkanSemua();
                    break;
                case 3:
                    System.out.println("Menghitung Rata-rata IPK per Jenis Beasiswa");
                    break;
                case 4:
                    System.out.println("Mencari Pendaftar Beasiswa berdasarkan Jenis Beasiswa");
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
    }
}
