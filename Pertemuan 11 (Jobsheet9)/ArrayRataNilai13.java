import java.util.Scanner;

public class ArrayRataNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0, rata2;
        int siswaLulus = 0;
        System.out.print("Masukkan jumlah siswa : ");
        int jmlSiswa = sc.nextInt();
        int nilaiMhs[] = new int[jmlSiswa];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            siswaLulus = (nilaiMhs[i] > 70) ? ++siswaLulus : siswaLulus;
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        rata2 = total / nilaiMhs.length;
        System.out.println("Rata rata nilai = " + rata2);
        System.out.println("Jumlah Mahasiswa lulus = " + siswaLulus);
    }
}
