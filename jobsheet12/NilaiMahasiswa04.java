package jobsheet12;
import java.util.Scanner;

public class NilaiMahasiswa04 {

    // a. Mengisi elemen-elemen array
    static void isianArray(int[] nilai, Scanner input) {
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
    }

    // b. Menampilkan seluruh nilai
    static void tampilArray(int[] nilai) {
        System.out.println("Daftar nilai mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
    }

    // c. Menghitung total nilai seluruh mahasiswa
    static int hitTot(int[] nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return total;
    }

    // d. main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = input.nextInt();

        int[] nilaiMhs = new int[N];

        isianArray(nilaiMhs, input);
        System.out.println();
        tampilArray(nilaiMhs);

        int totalNilai = hitTot(nilaiMhs);
        System.out.println("\nTotal nilai seluruh mahasiswa = " + totalNilai);

        input.close();
    }
}
