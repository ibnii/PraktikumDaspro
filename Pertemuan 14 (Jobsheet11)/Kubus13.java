import java.util.Scanner;

public class Kubus13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===Masukkan sisi kubus===");
        System.out.print("=> ");
        double sisi = sc.nextDouble();
        sc.nextLine();
        System.out.println("Volume Kubus\t\t: " + volumeKubus(sisi));
        System.out.println("Permukaan Kubus\t\t: " + permukaanKubus(sisi));

    }

    static double volumeKubus(double sisi){
        return Math.pow(sisi, 3);
    }

    static double permukaanKubus(double sisi){
        return 6*(sisi * sisi);
    }
}
