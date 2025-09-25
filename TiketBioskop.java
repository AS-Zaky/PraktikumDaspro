import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiketDewasa = 50000;
        int hargaTiketAnak = 30000;
        int jumlahBeli, anak, dewasa;
        double diskon;

        System.out.println("Harga Tiket Bioskop\n Anak: 30.000\n Dewasa: 50000");
        System.out.print("Beli berapa tiket anak: ");
        anak = sc.nextInt();
        System.out.println("Beli berapa tiket dewasa: ");
        dewasa = sc.nextInt();
    }
}
