import java.util.Scanner;

public class ifCetakKRS13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        System.out.println(uktLunas ? "Pembayaran UKT telah diverifikasi\nSilahkan cetak KRS dan minta tanda tangan ke DPA"
        : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");

        sc.close();


    }
}