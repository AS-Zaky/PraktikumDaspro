import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiketDewasa = 50000;
        int hargaTiketAnak = 30000;
        int jumlahBeli, anak, dewasa;
        int diskon;
        int hargaTotal;

        System.out.println("Harga Tiket Bioskop\n Anak: 30.000\n Dewasa: 50000");
        System.out.print("Beli berapa tiket anak: ");
        anak = sc.nextInt();
        System.out.println("Beli berapa tiket dewasa: ");
        dewasa = sc.nextInt();

        jumlahBeli = anak + dewasa;
        
        hargaTotal = (anak * hargaTiketAnak) + (dewasa * hargaTiketDewasa);

        if (jumlahBeli >= 5) {
           diskon = (int) (hargaTotal * 0.15);
           System.out.println("diskon anda "+ diskon);
           hargaTotal = hargaTotal - diskon;
        }
        System.out.println("harga total "+ hargaTotal);
    }
}
