import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs = sc.nextInt();
        int nilaiMhs[] = new int[jmlMhs];
        int total = 0, terbesar = 0,terkecil = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
            terbesar = (i == 0)? nilaiMhs[i] : ((nilaiMhs[i] > terbesar)? nilaiMhs[i] : terbesar );
            terkecil = (i == 0)? nilaiMhs[i] : ((nilaiMhs[i] < terkecil)? nilaiMhs[i] : terkecil );
        }
        int rata2 = total / nilaiMhs.length;
        System.out.println("=========================================");
        System.out.println("Rata rata nilai : " + rata2);
        System.out.println("=========================================");
        System.out.println("Nilai Mahasiswa");
        System.out.println("=========================================");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai Mahasiswa ke-"+(i+1)+" : " + nilaiMhs[i]);
        }
        System.out.println("=========================================");
        System.out.println("Nilai Mahasiswa terbesar & terkecil");
        System.out.println("=========================================");
        System.out.println("Terbesar\t: " + terbesar);
        System.out.println("Terkecil\t: "+ terkecil);
        
    }
}