import java.util.Scanner;

public class KafeDoWhile13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi,hargaKopi = 12_000, teh,hargaTeh = 7_000, roti,hargaRoti = 20_000;
        int totalHarga;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);

            sc.nextLine();
        } while (true);

    }
    
}
