import java.util.Scanner;
public class Tugas3_09 {
    public static void main(String[] args) {
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama makanan yang ingin Anda cari: ");
        String makananDicari = scanner.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(makananDicari)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Makanan " + makananDicari + " tersedia di menu.");
        } else {
            System.out.println("Maaf, makanan " + makananDicari + " tidak tersedia di menu.");
        }

    }
}
