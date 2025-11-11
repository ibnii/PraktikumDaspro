public class Bioskop13 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];

        penonton[0][0] = "Amin";
        penonton[0][1] = "Budi";
        penonton[1][0] = "Cici";
        penonton[1][1] = "Dedi";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Fani";
        penonton[3][0] = "Gina";

        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);

    }
}
