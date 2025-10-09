package jobsheet6;
import java.util.Scanner;

public class statusKelulusanNestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine();

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

        System.out.println("\n===== HASIL KELULUSAN =====");
        System.out.printf("Nama: %s%n", nama);
        System.out.printf("Nilai Akhir Algoritma dan Pemrograman: %.2f%n", nilaiAkhir1);
        System.out.printf("Nilai Akhir Struktur Data: %.2f%n", nilaiAkhir2);
        System.out.printf("Rata-rata Nilai Akhir: %.2f%n", rataRata);
        System.out.println("Status Semester: " + statusSemester);

        sc.close();
    }
}
