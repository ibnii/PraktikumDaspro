import java.util.Arrays;
import java.util.Scanner;

public class Kafe13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kodeVoucher = "kosong";
        boolean isMember;
        String member[] = {"Budi","Ibennn","Alexa"};

        System.out.print("Masukkan nama : ");
        String nama = sc.nextLine();
        isMember = Arrays.stream(member).anyMatch(nama::equals);

        System.out.println("================================");
        System.out.println("Apakah memiliki kode promo ? (Y/N)");
        System.out.print("=> ");

        String isAnyVoucher = sc.nextLine();
        if (isAnyVoucher.equalsIgnoreCase("Y")) {
            System.out.print("Kode Voucher = ");
            kodeVoucher = sc.nextLine();
        }
        System.out.println("================================");


        Menu(nama, isMember, kodeVoucher);

        System.out.print("=> ");
        int pilihanMenu = sc.nextInt();
        sc.nextLine();
        System.out.print("Jumlah dibeli : ");
        int jumlahDibeli = sc.nextInt();

        System.out.println("Total harga = " + hitungTotalHarga(pilihanMenu, jumlahDibeli));
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("================================");

        if (kodePromo.equals("DISKON50")) {
            System.out.println("berikan diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("berikan diskon 30%");
        } else {
            System.out.println("Kode Invalid");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("================================");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("================================");
        System.out.println("Silakan pilih menu yang Anda inginkan (1-6).");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

}