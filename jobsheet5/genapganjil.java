package jobsheet5;
import java.util.Scanner;

public class genapganjil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Massukan Angka: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka "+angka+" adalah bilangan genap.");
        } else {
            System.out.println("Angka "+angka+" adalah bilangan ganjil.");
        }

        sc.close();
    }
}
