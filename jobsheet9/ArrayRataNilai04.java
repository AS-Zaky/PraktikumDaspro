package jobsheet9;
import java.util.Scanner;

public class ArrayRataNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = sc.nextInt();
        int[] nilai = new int[jumlahMahasiswa];

        double jumlahNilaiLulus = 0;
        double jumlahNilaiTidakLulus = 0;

        int jumlahMahasiswaLulus = 0;
        int jumlahMahasiswaTidakLulus = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilai[i] = sc.nextInt();

            if (nilai[i] > 70) {
                jumlahNilaiLulus += nilai[i];
                jumlahMahasiswaLulus++;
            } else {
                jumlahNilaiTidakLulus += nilai[i];
                jumlahMahasiswaTidakLulus++;
            }
        }

        double rataLulus = (jumlahMahasiswaLulus > 0)
                ? jumlahNilaiLulus / jumlahMahasiswaLulus : 0.0;

        double rataTidakLulus = (jumlahMahasiswaTidakLulus > 0)
                ? jumlahNilaiTidakLulus / jumlahMahasiswaTidakLulus : 0.0;

        System.out.println("Rata-rata nilai lulus = "+ rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = "+ rataTidakLulus);

        sc.close();
    }
}
