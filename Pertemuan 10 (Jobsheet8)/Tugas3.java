import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grandTotalPelanggan = 0;
        int grandTotalItem = 0;

        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();
        
        System.out.println("\n=== Input Penjualan Per Cabang ===");
        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();
            int totalItemPerCabang = 0;
            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int jumlahItem = sc.nextInt();
                totalItemPerCabang += jumlahItem;
            }
            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemPerCabang);
            grandTotalPelanggan += jumlahPelanggan;
            grandTotalItem += totalItemPerCabang;
        }
        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("Pelanggan: " + grandTotalPelanggan + " orang");
        System.out.println("Item terjual: " + grandTotalItem + " item");
    }
}
