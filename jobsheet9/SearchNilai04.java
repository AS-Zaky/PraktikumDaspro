package jobsheet9;
import java.util.Scanner;

public class SearchNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int n = sc.nextInt();

        int[] nilai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        int pos = -1;                       // -1 = tidak ketemu
        for (int i = 0; i < n; i++) {
            if (nilai[i] == key) { pos = i; break; }
        }

        System.out.println();
        if (pos != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (pos + 1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        sc.close();
    }
}

