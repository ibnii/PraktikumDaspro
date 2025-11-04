import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {
                "Nasi Goreng",
                "Mie Goreng",
                "Roti Bakar",
                "Kentang Goreng",
                "Teh Tarik",
                "Cappucino",
                "Chocolate Ice"
        };
        System.out.println("--- Menu Kafe ---");
        System.out.print("Masukkan nama menu yang ingin Anda cari: ");
        String menuDicari = sc.nextLine();
        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(menuDicari)) {
                ditemukan = true;
                break;
            }
        }
        System.out.println("\n--- Hasil Pencarian ---");
        if (ditemukan) {
            System.out.println("✅ Menu '" + menuDicari + "' TERSEDIA di daftar menu.");
        } else {
            System.out.println("❌ Maaf, menu '" + menuDicari + "' TIDAK ADA di daftar menu.");
        }
    }
}
