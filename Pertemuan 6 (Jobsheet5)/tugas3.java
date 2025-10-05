import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
                // Deklarasi variabel
        String jenisPengguna;
        int jumlahSKS = 0;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cek Akses WiFi ---");
        System.out.print("Masukkan Jenis Pengguna (Dosen/Mahasiswa/Lainnya): ");
        jenisPengguna = scanner.nextLine();
        
        if (jenisPengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("\nAkses Wifi diberikan (Dosen)");
        } 
        else {
            if (jenisPengguna.equalsIgnoreCase("Mahasiswa")) {
                System.out.print("Masukkan Jumlah SKS yang diambil: ");
                jumlahSKS = scanner.nextInt();
                if (jumlahSKS >= 12) {
                    System.out.println("\nAkses diberikan (Mahasiswa aktif)");
                } else {
                    System.out.println("\nAkses ditolak karena nilai SKS kurang");
                }
            } 
            else {
                System.out.println("\nAkses ditolak");
            }
        }
        
        scanner.close();
    }
    
}
