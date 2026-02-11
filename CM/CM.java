package CM;
import java.util.Scanner;

public class CM {
    static boolean adalahPrima(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // Buat fungsi untuk menentukan sebuah bilangan prima atau bukan
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int angka = sc.nextInt();

        if (adalahPrima(angka)) {
            System.out.println("Angka " + angka + " adalah bilangan prima.");
        } else {
            System.out.println("Angka " + angka + " BUKAN bilangan prima.");
        }

        sc.close();
    }
}
