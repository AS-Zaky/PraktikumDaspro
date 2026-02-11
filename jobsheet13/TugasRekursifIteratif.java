package jobsheet13;
import java.util.Scanner;

public class TugasRekursifIteratif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = sc.nextInt();

        int[] data = new int[N];

        for (int i = N; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            data[i - 1] = sc.nextInt();
        }

        int totalRekursif = sumRekursif(data, N - 1);
        int totalIteratif = sumIteratif(data);

        System.out.println("Total dengan rekursif : " + totalRekursif);
        System.out.println("Total dengan iteratif : " + totalIteratif);

        sc.close();
    }

    static int sumRekursif(int[] arr, int index) {
        if (index < 0) {
            return 0;
        } else {
            return arr[index] + sumRekursif(arr, index - 1);
        }
    }

    static int sumIteratif(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
}
