import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlTiket, hargaTiket = 50_000, totalHarga = 0;
        do{
            System.out.print("Masukkan jumlah tiket\t: ");
            jmlTiket = sc.nextInt();
            if (jmlTiket > 10) {
                totalHarga = (jmlTiket*hargaTiket)-((jmlTiket*hargaTiket)*15/100);
                break;
            }else if(jmlTiket > 4){
                totalHarga = (jmlTiket*hargaTiket)-((jmlTiket*hargaTiket)*10/100);
                break;
            }else if(jmlTiket < 0){
                System.out.println("Masukkan angka valid!!");
            }else{
                totalHarga = jmlTiket*hargaTiket;
                break;
            }
        }while (true);
        System.out.println("Total Harga\t\t: " + totalHarga);
    }
}
