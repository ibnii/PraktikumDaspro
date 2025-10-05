import java.util.Scanner;

public class ifElseCetakKRS13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" --- Cetak KRS SIAKAD");
        System.out.print("Masukkan semester Anda: ");
        int semester = sc.nextInt();

        if (semester == 1) {
            System.out.println("Anda adalah mahasiswa semester 1.");
        } else if (semester == 2) {
            System.out.println("Anda adalah mahasiswa semester 2.");
        } else if (semester == 3) {
            System.out.println("Anda adalah mahasiswa semester 3.");
        } else if (semester == 4) {
            System.out.println("Anda adalah mahasiswa semester 4.");
        } else if (semester == 5) {
            System.out.println("Anda adalah mahasiswa semester 5.");
        } else if (semester == 6) {
            System.out.println("Anda adalah mahasiswa semester 6.");
        } else if (semester == 7) {
            System.out.println("Anda adalah mahasiswa semester 7.");
        } else if (semester == 8) {
            System.out.println("Anda adalah mahasiswa semester 8.");
        } else {
            System.out.println("Semester tidak valid.");
        }

        sc.close();
    }
}
