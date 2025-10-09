import java.util.Scanner;

public class cm1_IbniAndarta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Data Mahasiswa
        String nama,NIM;
        //Nilai Algoritma
        int utsAlg,uasAlg,tugasAlg;
        //Nilai Struktur Data
        int utsStruktur,uasStruktur,tugasStruktur;

        System.out.println("==== INPUT DATA MAHASISWA ====");
        System.out.print("Nama\t: ");
        nama = sc.nextLine();
        System.out.print("NIM\t: ");
        NIM = sc.nextLine();

        //Inputan Algoritma dan Pemograman
        System.out.println("\n--- Mata Kuliah 1: Alogritma dan Pemograman ---");
        System.out.print("Nilai UTS\t: ");
        utsAlg = sc.nextInt();
        System.out.print("Nilai UAS\t: ");
        uasAlg = sc.nextInt();
        System.out.print("Nilai Tugas\t: ");
        tugasAlg = sc.nextInt();

        //Inputan Struktur data
        System.out.println("--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS\t: ");
        utsStruktur = sc.nextInt();
        System.out.print("Nilai UAS\t: ");
        uasStruktur = sc.nextInt();
        System.out.print("Nilai Tugas\t: ");
        tugasStruktur = sc.nextInt();

        //Convert to persen
        double persenAlg = (utsAlg*0.3) + (uasAlg*0.4) + (tugasAlg*0.3);
        double persenStruktur = (utsStruktur*0.3) + (uasStruktur*0.4) + (tugasStruktur*0.3);

        //Calculate nilai huruf
        String algoritmaChar = "", StrukturChar = "";
        if (persenAlg<=39) {
            algoritmaChar = "E";
        }else if (persenAlg <= 50) {
            algoritmaChar = "D";
        }else if(persenAlg <= 60){
            algoritmaChar = "C";
        }else if (persenAlg <= 65) {
            algoritmaChar = "C+";
        }else if (persenAlg <= 73){
            algoritmaChar = "B";
        }else if (persenAlg <= 80) {
            algoritmaChar = "B+";
        }else if (persenAlg <= 100) {
            algoritmaChar = "A";
        }
        if (persenStruktur<=39) {
            StrukturChar = "E";
        }else if (persenStruktur <= 50) {
            StrukturChar = "D";
        }else if(persenStruktur <= 60){
            StrukturChar = "C";
        }else if (persenStruktur <= 65) {
            StrukturChar = "C+";
        }else if (persenStruktur <= 73){
            StrukturChar = "B";
        }else if (persenStruktur <= 80) {
            StrukturChar = "B+";
        }else if (persenStruktur <= 100) {
            StrukturChar = "A";
        }

        //Calculate lulus nilai
        String lulusMatkulAlg = "" , lulusMatkulStruktur = "";
        if (persenAlg >= 60) {
            lulusMatkulAlg = "LULUS";
        }else{
            lulusMatkulAlg = "Tidak Lulus";
        }
        if (persenStruktur >= 60) {
            lulusMatkulStruktur = "LULUS";
        }else{
            lulusMatkulStruktur = "Tidak Lulus";
        }

        //Calculate Avg nilai Akhir
        double avgNilaiAkhir = (persenAlg+persenStruktur)/2;

        //Calculate Status semester
        String statusSemester = "";

        if (lulusMatkulAlg.equals("LULUS") && lulusMatkulStruktur.equals("LULUS")) {
            // Nested if: cek rata-rata jika keduanya LULUS
            if (avgNilaiAkhir >= 70) {
                statusSemester = "LULUS";
            } else {
                statusSemester = "TIDAK LULUS";
            }
        } else {
            statusSemester = "TIDAK LULUS";
        }

        //limit 2 digit
        String persenAlglimit = String.format("%.2f", persenAlg);
        String persenStrlimit = String.format("%.2f", persenStruktur);
        String persenNilaiAKhirLimit = String.format("%.2f", avgNilaiAkhir);

        //Output hasil
        System.out.println("\n==================== HASIL PENILAIAN AKADEMIK ====================");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("NIM\t\t: " + NIM);
        System.out.println("Mata Kuliah\t\t\tUTS\tUAS\t\tTugas\tNilai Akhir\t\tNilai Huruf\t\tStatus");
        System.out.println("================================================================");        
        System.out.println("Algoritma pemograman\t\t"+utsAlg+"\t"+uasAlg+"\t\t"+tugasAlg+"\t"+persenAlglimit+"%\t\t\t" + algoritmaChar + "\t\t\t" + lulusMatkulAlg);
        System.out.println("Struktur Data\t\t\t"+utsStruktur+"\t"+uasStruktur+"\t\t"+tugasStruktur+"\t"+persenStrlimit+"%\t\t\t" + StrukturChar + "\t\t\t" + lulusMatkulStruktur);

        System.out.println("Rata rata nilai akhir\t\t: " + persenNilaiAKhirLimit );
        System.out.println("Status Semester\t\t\t: " + statusSemester);



    }
}
