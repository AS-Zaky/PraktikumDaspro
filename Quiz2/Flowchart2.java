package Quiz2;
import java.util.Scanner;

public class Flowchart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int uk;
        System.out.print("Masukkan Panjang & Lebar ordo: ");
        uk = sc.nextInt();

        int[][] A = new int[uk][uk];
        int[][] B = new int[uk][uk];
        int[][] C = new int[uk][uk];

        System.out.println("\nInput elemen matriks A:");
        for (int i = 0; i < uk; i++) {
            for (int j = 0; j < uk; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nInput elemen matriks B:");
        for (int i = 0; i < uk; i++) {
            for (int j = 0; j < uk; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < uk; i++) {
            for (int j = 0; j < uk; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("\nMatriks C (Hasil Penjumlahan):");
        for (int i = 0; i < uk; i++) {
            for (int j = 0; j < uk; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
