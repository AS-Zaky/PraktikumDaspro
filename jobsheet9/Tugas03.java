package jobsheet9;
import java.util.Scanner;

public class Tugas03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        System.out.println("=== MENU KAFE ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        System.out.print("\nMasukkan nama makanan yang ingin dicari: ");
        String dicari = sc.nextLine();

        int posisi = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(dicari)) {
                posisi = i;
                break;
            }
        }

        if (posisi != -1) {
            System.out.println("Tersedia: \"" + menu[posisi] + "\" (posisi menu ke-" + (posisi + 1) + ")");
        } else {
            System.out.println("Maaf, \"" + dicari + "\" tidak ada di menu.");
        }

        sc.close();
    }
}

