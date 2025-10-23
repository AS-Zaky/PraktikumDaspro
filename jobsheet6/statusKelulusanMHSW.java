package jobsheet6;
import java.util.Scanner;

public class statusKelulusanMHSW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama Mahasiswa\t: ");
        String nama = sc.nextLine();
        System.out.print("NIM\t\t: ");
        long nim = sc.nextLong();

        System.out.println("\nMata Kuliah 1: Algoritma dan Pemrograman");
        System.out.print("Nilai UTS: ");
        double uts1 = sc.nextDouble();
        System.out.print("Nilai UAS: ");
        double uas1 = sc.nextDouble();
        System.out.print("Nilai Tugas: ");
        double tugas1 = sc.nextDouble();
        double nilaiAkhir1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);

        System.out.println("\nMata Kuliah 2: Struktur Data");
        System.out.print("Nilai UTS: ");
        double uts2 = sc.nextDouble();
        System.out.print("Nilai UAS: ");
        double uas2 = sc.nextDouble();
        System.out.print("Nilai Tugas: ");
        double tugas2 = sc.nextDouble();
        double nilaiAkhir2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);

        // Konversi huruf dan setara untuk MK1
        String huruf1;
        double setara1;
        if (nilaiAkhir1 >= 80) { huruf1 = "A"; setara1 = 4.0; }
        else if (nilaiAkhir1 >= 73) { huruf1 = "B+"; setara1 = 3.5; }
        else if (nilaiAkhir1 >= 65) { huruf1 = "B"; setara1 = 3.0; }
        else if (nilaiAkhir1 >= 60) { huruf1 = "C+"; setara1 = 2.5; }
        else if (nilaiAkhir1 >= 50) { huruf1 = "C"; setara1 = 2.0; }
        else if (nilaiAkhir1 >= 39) { huruf1 = "D"; setara1 = 1.0; }
        else { huruf1 = "E"; setara1 = 0.0; }

        // Konversi huruf dan setara untuk MK2
        String huruf2;
        double setara2;
        if (nilaiAkhir2 >= 80) { huruf2 = "A"; setara2 = 4.0; }
        else if (nilaiAkhir2 >= 73) { huruf2 = "B+"; setara2 = 3.5; }
        else if (nilaiAkhir2 >= 65) { huruf2 = "B"; setara2 = 3.0; }
        else if (nilaiAkhir2 >= 60) { huruf2 = "C+"; setara2 = 2.5; }
        else if (nilaiAkhir2 >= 50) { huruf2 = "C"; setara2 = 2.0; }
        else if (nilaiAkhir2 >= 39) { huruf2 = "D"; setara2 = 1.0; }
        else { huruf2 = "E"; setara2 = 0.0; }

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
        System.out.println("Nama\t\t: " + nama);
        System.out.println("NIM\t\t: " + nim);
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
}
