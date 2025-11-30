import java.util.Scanner;

public class NilaiMahasiswa13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = input.nextInt();
        double[] nilaiMahasiswa = new double[N];

        isianArray(nilaiMahasiswa, input);
        tampilArray(nilaiMahasiswa);

        double totalNilai = hitTot(nilaiMahasiswa);
        System.out.println("\nTotal nilai seluruh mahasiswa: " + totalNilai);

    }

    static void isianArray(double[] nilai, Scanner input) {
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextDouble();
        }
    }

    static void tampilArray(double[] nilai) {
        System.out.println("\nDaftar nilai mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
    }

    static double hitTot(double[] nilai) {
        double total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total;
    }

}
