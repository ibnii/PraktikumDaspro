import java.util.Arrays;
import java.util.Scanner;

public class Kafe13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kodeVoucher = "kosong";
        boolean isMember;
        String member[] = { "Budi", "Ibennn", "Alexa" };
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

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

        Menu(nama, isMember, kodeVoucher, hargaItems);

    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo, int[] hargaItems) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("================================");

        if (kodePromo.equals("DISKON50")) {
            System.out.println("berikan diskon 50%");
            hitungPromo(hargaItems, 50);
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("berikan diskon 30%");
            hitungPromo(hargaItems, 30);
        } else {
            System.out.println("Kode Invalid");
        }
        int tempHargaTotal = 0;
        while (true) {
            System.out.println("===== MENU RESTO KAFE =====");
            System.out.println("================================");
            System.out.println("1. Kopi Hitam - Rp " + hargaItems[0]);
            System.out.println("2. Cappuccino - Rp " + hargaItems[1]);
            System.out.println("3. Latte - Rp " + hargaItems[2]);
            System.out.println("4. Teh Tarik - Rp " + hargaItems[3]);
            System.out.println("5. Roti Bakar - Rp " + hargaItems[4]);
            System.out.println("6. Mie Goreng - Rp " + hargaItems[5]);
            System.out.println("================================");
            System.out.println("Silakan pilih menu yang Anda inginkan (1-6).");
            System.out.print("=> ");
            int pilihanMenu = sc.nextInt();
            sc.nextLine();
            System.out.print("Jumlah dibeli : ");
            int jumlahDibeli = sc.nextInt();
            sc.nextLine();
            tempHargaTotal += hitungTotalHarga(pilihanMenu, jumlahDibeli, hargaItems);
            System.out.println("Apakah ingin memesan kembali? (Y/N)");
            System.out.print("=> ");
            String isRepeat = sc.nextLine();
            System.out.println("================================");
            if (isRepeat.equalsIgnoreCase("N")) {
                break;
            }
        }
        System.out.println("Total Harga = " + tempHargaTotal);

    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, int[] hargaItems) {
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    static void hitungPromo(int[] hargaItems, int promo) {
        for (int i = 0; i < hargaItems.length; i++) {
            hargaItems[i] = hargaItems[i] - (hargaItems[i] / 100 * promo);
        }
    }

}