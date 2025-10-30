package jobsheet8;

public class JumlahKuadrat04 {
    public static void main(String[] args) {
        for (int n = 1; n <= 5; n++) {
            int jumlah = 0;
            System.out.print("n = " + n + " → jumlah kuadrat = ");

            for (int i = 1; i <= n; i++) {
                System.out.print(i * i);
                jumlah += i * i;
                if (i < n) System.out.print(" + ");
            }

            System.out.println(" = " + jumlah);
        }
    }
}
