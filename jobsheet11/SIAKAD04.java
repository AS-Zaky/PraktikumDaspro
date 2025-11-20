    package jobsheet11;
    import java.util.Scanner;

    public class SIAKAD04 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Masukkan jumlah mahasiswa : ");
            int jmlMhs = sc.nextInt();

            System.out.print("Masukkan jumlah mata kuliah : ");
            int jmlMk = sc.nextInt();

            int[][] nilai = new int[jmlMhs][jmlMk];

            for (int i = 0; i < jmlMhs; i++) {
                System.out.println("\nInput nilai Mahasiswa ke-" + (i + 1));
                double totalPerSiswa = 0;

                for (int j = 0; j < jmlMk; j++) {
                    System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                    nilai[i][j] = sc.nextInt();
                    totalPerSiswa += nilai[i][j];
                }
                System.out.println("Nilai rata-rata: " + (totalPerSiswa / jmlMk));
            }

            System.out.println("\n=====================================");
            System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

            for (int j = 0; j < jmlMk; j++) {
                double totalPerMatkul = 0;

                for (int k = 0; k < jmlMhs; k++) {
                    totalPerMatkul += nilai[k][j];
                }

                System.out.println("Mata kuliah " + (j + 1) + ": " + (totalPerMatkul / jmlMhs));
            }

            sc.close();
        }
    }
