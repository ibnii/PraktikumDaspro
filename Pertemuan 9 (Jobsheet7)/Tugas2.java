import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total=0;
        do{
            System.out.println("Jenis Kendaraan\n=========================");
            System.out.print("1.Mobil\n2.Motor\n0.Keluar\nMasukkan jenis kendaraan\t: ");
            jenis = sc.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000; // Mobil
                } else if (jenis == 2) {
                    total += durasi * 2000; // Motor
                }
            } else if (jenis != 0) {
                System.out.println("Jenis kendaraan tidak valid. Masukkan 1, 2, atau 0 untuk keluar.");
            }
        }while(jenis != 0);
        System.out.println("Total\t\t: " + total);
    }
}
