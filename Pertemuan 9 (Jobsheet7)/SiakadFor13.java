import java.util.Scanner;

public class SiakadFor13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah =100;
        int lulus = 0, tidaklulus = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            nilai = sc.nextDouble();
            if(nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            //perhitungan lulus dan tidak
            if(nilai>=60) ++lulus; else ++tidaklulus;
        }
        System.out.println("Nilai tertinggi\t: "+tertinggi);
        System.out.println("Nilai terendah\t: "+terendah);
        System.out.println("Jumlah mahasiswa lulus\t\t: " + lulus );
        System.out.println("Jumlah mahasiswa tidak lulus\t: "+tidaklulus);
    }
    
}
