package jobsheet6;
import java.util.Scanner;

public class statusKelulusanMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama Mahasiswa\t: ");
        String nama = sc.nextLine();
        System.out.print("NIM\t\t: ");
        int nim = sc.nextInt();

        // --- Mata Kuliah 1 ---
        System.out.println("\nMata Kuliah 1: Algoritma dan Pemrograman");
        System.out.print("Nilai UTS: "); 
        double uts1 = sc.nextDouble();
        System.out.print("Nilai UAS: "); 
        double uas1 = sc.nextDouble();
        System.out.print("Nilai Tugas: "); 
        double tugas1 = sc.nextDouble();
        double nilaiAkhir1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);

        // --- Mata Kuliah 2 ---
        System.out.println("\nMata Kuliah 2: Struktur Data");
        System.out.print("Nilai UTS: "); 
        double uts2 = sc.nextDouble();
        System.out.print("Nilai UAS: "); 
        double uas2 = sc.nextDouble();
        System.out.print("Nilai Tugas: "); 
        double tugas2 = sc.nextDouble();
        double nilaiAkhir2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);

        // Konversi nilai ke huruf dan nilai setara
        String huruf1 = konversiHuruf(nilaiAkhir1);
        String huruf2 = konversiHuruf(nilaiAkhir2);
        double setara1 = konversiSetara(nilaiAkhir1);
        double setara2 = konversiSetara(nilaiAkhir2);

        boolean lulus1 = nilaiAkhir1 >= 60;
        boolean lulus2 = nilaiAkhir2 >= 60;
        double rataRata = (nilaiAkhir1 + nilaiAkhir2) / 2;

        String statusSemester;
        if (lulus1 && lulus2) {
            if (rataRata >= 70)
                statusSemester = "LULUS SEMESTER";
            else
                statusSemester = "TIDAK LULUS SEMESTER (Rata-rata < 70)";
        } else {
            statusSemester = "TIDAK LULUS SEMESTER (Salah satu MK tidak lulus)";
        }

        // Output hasil akhir
        System.out.println("\n===== HASIL KELULUSAN =====");
        System.out.println("Nama\t\t\t\t: " + nama);
        System.out.println("NIM\t\t\t\t: " + nim);
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-25s %-12s %-10s %-10s%n", 
                "Mata Kuliah", "Nilai Akhir", "Huruf", "Setara");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-25s %-12.2f %-10s %-10.1f%n", 
                "Algoritma & Pemrograman", nilaiAkhir1, huruf1, setara1);
        System.out.printf("%-25s %-12.2f %-10s %-10.1f%n", 
                "Struktur Data", nilaiAkhir2, huruf2, setara2);
        System.out.println("-----------------------------------------------------------");
        System.out.printf("Rata-rata Nilai Akhir\t: %.2f%n", rataRata);
        System.out.println("Status Semester\t\t: " + statusSemester);

        sc.close();
    }

    // Fungsi konversi huruf berdasarkan nilai
    public static String konversiHuruf(double nilai) {
        if (nilai >= 80) return "A";
        else if (nilai >= 73) return "B+";
        else if (nilai >= 65) return "B";
        else if (nilai >= 60) return "C+";
        else if (nilai >= 50) return "C";
        else if (nilai >= 39) return "D";
        else return "E";
    }

    // Fungsi konversi nilai huruf ke angka setara (mutu)
    public static double konversiSetara(double nilai) {
        if (nilai >= 80) return 4.0;
        else if (nilai >= 73) return 3.5;
        else if (nilai >= 65) return 3.0;
        else if (nilai >= 60) return 2.5;
        else if (nilai >= 50) return 2.0;
        else if (nilai >= 39) return 1.0;
        else return 0.0;
    }
}
