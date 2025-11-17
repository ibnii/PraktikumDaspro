import java.util.Scanner;

public class BioskopWithScanner13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int menu;

        do {
            System.out.println("===== MENU BIOSKOP =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        String nama = sc.nextLine();

                        int baris, kolom;

                        while (true) {
                            System.out.print("Masukkan baris (1-4): ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom (1-2): ");
                            kolom = sc.nextInt();
                            sc.nextLine();

                            if (baris < 1 || baris > penonton.length ||
                                    kolom < 1 || kolom > penonton[0].length) {
                                System.out.println("Nomor baris/kolom tidak tersedia. Silakan input lagi.");
                                continue;
                            }

                            if (penonton[baris - 1][kolom - 1] != null) {
                                System.out.println("Kursi tersebut sudah terisi oleh: " +
                                        penonton[baris - 1][kolom - 1]);
                                System.out.println("Silakan pilih kursi lain.\n");
                                continue;
                            }

                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Kursi [" + baris + "," + kolom + "] berhasil dipesan untuk " + nama);
                            break;
                        }

                        System.out.print("Input penonton lainnya? (y/n): ");
                        String next = sc.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("===== DAFTAR PENONTON =====");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String isi = penonton[i][j];
                            if (isi == null) {
                                isi = "***";
                            }
                            System.out.print("[" + (i + 1) + "," + (j + 1) + "] " + isi + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid. Silakan pilih 1–3.");
            }

            System.out.println();
        } while (menu != 3);
        System.out.println("Program berhenti");
    }
}
