import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); 
        String[] namaPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];
        int totalBiaya = 0;
        System.out.println("\n--- Masukkan Detail Pesanan ---");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("Pesanan ke-" + (i + 1));
            System.out.print("  Nama Makanan/Minuman: ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("  Harga: ");
            hargaPesanan[i] = sc.nextInt();
            sc.nextLine();
            totalBiaya += hargaPesanan[i];
        }

        System.out.println("\n--- Daftar Pesanan Anda ---");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        System.out.println("-----------------------------");
        System.out.println("Total Biaya: Rp " + totalBiaya);
    }
}
