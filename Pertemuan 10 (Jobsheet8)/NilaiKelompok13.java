import java.util.Scanner;

public class NilaiKelompok13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai;
        float totalNilai,rataNilai;

        float maxNilai = 0;
        int maxKelompok = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Kelompok "+(i+1));
            totalNilai = 0;
            for (int j = 0; j < 5; j++) {
                System.out.print("Nilai dari kelompok penilai "+(j+1)+" : ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai/5;
            if (rataNilai > maxNilai){
                maxNilai = rataNilai;
                maxKelompok = (i+1);
            }
            System.out.println("Kelompok " + (i+1) + ": nilai rata rata\t= " + rataNilai);
        }

        System.out.println("\n\nKelompok "+maxKelompok+" adalah nilai tertinggi\t: " +maxNilai);

    }
}
