import java.util.Scanner;

public class ifCetakKRS13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT telah diverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan ke DPA");
        }


        sc.close();


    }
}