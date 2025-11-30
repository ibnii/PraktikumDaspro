import java.util.Scanner;

public class RekapPenjualanKafe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jmlMenu = sc.nextInt();
        sc.nextLine();

        String[] namaMenu = new String[jmlMenu];
        for (int i = 0; i < jmlMenu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            namaMenu[i] = sc.nextLine();
        }
        System.out.print("Masukkan jumlah hari penjualan: ");
        int jmlHari = sc.nextInt();

        int[][] penjualan = new int[jmlMenu][jmlHari];

        inputPenjualan(penjualan, namaMenu, sc);
        tampilTabel(penjualan, namaMenu);
        tampilMenuTerlaris(penjualan, namaMenu);
        tampilRataRataPerMenu(penjualan, namaMenu);

        sc.close();
    }

    static void inputPenjualan(int[][] penjualan, String[] namaMenu, Scanner in) {
        int jmlMenu = penjualan.length;
        int jmlHari = penjualan[0].length;

        for (int i = 0; i < jmlMenu; i++) {
            System.out.println("Input penjualan untuk menu: " + namaMenu[i]);
            for (int j = 0; j < jmlHari; j++) {
                System.out.print("  Hari ke-" + (j + 1) + " : ");
                penjualan[i][j] = in.nextInt();
            }
            System.out.println();
        }
    }

    static void tampilTabel(int[][] penjualan, String[] namaMenu) {
        int jmlMenu = penjualan.length;
        int jmlHari = penjualan[0].length;

        System.out.println("\nTABEL PENJUALAN");
        System.out.print("Menu\t\t");
        for (int j = 0; j < jmlHari; j++) {
            System.out.print("H" + (j + 1) + "\t");
        }
        System.out.println();

        for (int i = 0; i < jmlMenu; i++) {
            if (namaMenu[i].length() < 7) {
                System.out.print(namaMenu[i] + "\t\t");
            } else {
                System.out.print(namaMenu[i] + "\t");
            }
            for (int j = 0; j < jmlHari; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void tampilMenuTerlaris(int[][] penjualan, String[] namaMenu) {
        int jmlMenu = penjualan.length;
        int jmlHari = penjualan[0].length;

        int idxMax = 0;
        int totalMax = 0;

        for (int i = 0; i < jmlMenu; i++) {
            int total = 0;
            for (int j = 0; j < jmlHari; j++) {
                total += penjualan[i][j];
            }

            if (i == 0 || total > totalMax) {
                totalMax = total;
                idxMax = i;
            }
        }

        System.out.println("\nMenu dengan total penjualan tertinggi:");
        System.out.println("Nama menu  : " + namaMenu[idxMax]);
        System.out.println("Total jual : " + totalMax);
    }

    static void tampilRataRataPerMenu(int[][] penjualan, String[] namaMenu) {
        int jmlMenu = penjualan.length;
        int jmlHari = penjualan[0].length;

        System.out.println("\nRata-rata penjualan per menu:");
        for (int i = 0; i < jmlMenu; i++) {
            int total = 0;
            for (int j = 0; j < jmlHari; j++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / jmlHari;
            System.out.println(namaMenu[i] + " : " + rata);
        }
    }
}
