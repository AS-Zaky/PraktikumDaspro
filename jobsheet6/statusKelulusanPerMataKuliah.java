package jobsheet6;
import java.util.Scanner;

public class statusKelulusanPerMataKuliah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====== INPUT DATA MAHASISWA ======");
        System.out.print("Nama\t: ");
        String nama = sc.nextLine();
        System.out.print("NIM\t: ");
        int nim = sc.nextInt();

        System.out.println("--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS\t: ");
        int nilaiUTS = sc.nextInt();
        System.out.print("Nilai UAS\t: ");
        int nilaiUAS = sc.nextInt();
        System.out.print("Nilai Tugas\t: ");
        int nilaiTugas = sc.nextInt();
    }
}
