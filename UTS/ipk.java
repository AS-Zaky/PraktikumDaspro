package UTS;
import java.util.Scanner;

public class ipk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String predikat = "";

        System.out.print("Masukkan jumlah prestasi anda: ");
        int jml_prestasi = sc.nextInt();
        System.out.print("Masukkan IPK cumlaude: ");
        double ipk_cml = sc.nextDouble();

        if (ipk_cml > 3.5 && jml_prestasi > 5) {
            predikat = "Sangat Baik";
        } else if (ipk_cml > 3.5 && jml_prestasi <= 5 && jml_prestasi != 0) {
            predikat = "Baik";
        } else {
            predikat = "BURUK!";
        }
        System.out.println("Predikat anda adalah: " + predikat);
        sc.close();
    }
}
