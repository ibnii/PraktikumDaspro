import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CM2_IbniAndarta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihMenu;
        boolean running = true;
        List<List<String>> dataPrestasi = new ArrayList<>();
        while (running) {
            System.out.println("=====================================");
            System.out.println("=== PENCATATAN PRESTASI MAHASISWA ===");
            System.out.println("=====================================");
            System.out.println("1. Tambah Data Prestasi");
            System.out.println("2. Tampilkan Semua Prestasi");
            System.out.println("3. Cari Prestasi Berdasarkan Tahun");
            System.out.println("4. Hitung Jumlah Prestasi per Tingkat");
            System.out.println("5. Keluar");
            System.out.println("=====================================");
            System.out.print("=> ");
            pilihMenu = sc.nextInt();
            sc.nextLine();
            System.out.println("=====================================");
            switch (pilihMenu) {
                case 1:
                    tambahData(dataPrestasi);
                    break;
                case 2:
                    tampilkanData(dataPrestasi);
                    break;
                case 3:
                    System.out.println("Masukkan tahun prestasi yang ingin dicari");
                    System.out.print("=> ");
                    int tahun = sc.nextInt();
                    sc.nextLine();
                    tampilkanTahun(dataPrestasi, getIndexTahun(dataPrestasi, tahun), tahun);
                    System.out.println("=====================================");
                    break;
                case 4:
                    tampilkanPrestasiTingkat(getByTingkat(dataPrestasi));
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Masukkan angka yang valid");
                    break;
            }
        }
        System.out.println("======Program Dihentikan======");
    }

    static void tambahData(List<List<String>> dataPrestasi) {
        Scanner sc = new Scanner(System.in);
        int pilihTingkatPrestasi, tahunPrestasi;
        System.out.println("Data Mahasiswa");
        System.out.println("=====================================");
        System.out.print("Nama\t\t: ");
        String nama = sc.nextLine();
        System.out.print("NIM\t\t: ");
        String NIM = sc.nextLine();
        System.out.print("Jenis Prestasi\t: ");
        String jenisPrestasi = sc.nextLine();
        while (true) {
            System.out.println("=====================================");
            System.out.println("==========Tingkat Prestasi===========");
            System.out.println("1. Lokal");
            System.out.println("2. Nasional");
            System.out.println("3. Internasional");
            System.out.print("=> ");

            if (sc.hasNextInt()) {
                pilihTingkatPrestasi = sc.nextInt();
                sc.nextLine();
                System.out.println("=====================================");
                if (pilihTingkatPrestasi > 0 && pilihTingkatPrestasi < 4) {
                    break;
                } else {
                    System.out.println("Pilihan anda tidak valid");
                }
            } else {
                System.out.println("=====================================");
                System.out.println("Input harus berupa angka");
                sc.nextLine();
            }
        }
        while (true) {
            System.out.print("Tahun Prestasi\t: ");
            tahunPrestasi = sc.nextInt();
            if (tahunPrestasi >= 2015 && tahunPrestasi <= 2025) {
                break;
            } else {
                System.out.println("Masukkan tahun antara 2015-2025");
            }
        }
        List<String> tempData = new ArrayList<>();
        tempData.add(nama);
        tempData.add(NIM);
        tempData.add(jenisPrestasi);
        String tingkatPrestasi = "";
        switch (pilihTingkatPrestasi) {
            case 1:
                tingkatPrestasi = "Lokal";
                break;
            case 2:
                tingkatPrestasi = "Nasional";
                break;
            case 3:
                tingkatPrestasi = "Internasional";
                break;
        }
        tempData.add(tingkatPrestasi);
        tempData.add(String.valueOf(tahunPrestasi));
        dataPrestasi.add(tempData);
        System.out.println("Penambahan Data Prestasi Berhasil");
    }

    static void tampilkanData(List<List<String>> dataPrestasi) {
        if (dataPrestasi.isEmpty()) {
            System.out.println("Tidak ada data Mahasiswa berprestasi");
        } else {
            System.out.println("Data Mahasiswa");
            String[] labels = {
                    "Nama\t\t\t: ",
                    "NIM\t\t\t: ",
                    "Jenis Prestasi\t\t: ",
                    "Tingkat Prestasi\t: ",
                    "Tahun Prestasi\t\t: "
            };

            for (int i = 0; i < dataPrestasi.size(); i++) {
                System.out.println("Mahasiswa " + (i + 1));
                System.out.println("=====================================");

                for (int j = 0; j < dataPrestasi.get(i).size(); j++) {
                    System.out.println(labels[j] + dataPrestasi.get(i).get(j));
                }

                System.out.println("=====================================");
            }
        }
    }

    static void tampilkanTahun(List<List<String>> dataPrestasi, List<Integer> indexTahun, int tahun) {

        if (indexTahun.isEmpty()) {
            System.out.println("=====================================");
            System.out.println("Tidak ada Prestasi pada tahun " + tahun);
        } else {
            System.out.println("Data Mahasiswa tahun " + tahun);
            for (int i = 0; i < indexTahun.size(); i++) {
                System.out.println("Mahasiswa " + (i + 1));
                System.out.println("=====================================");
                System.out.println("Nama\t\t\t: " + dataPrestasi.get(indexTahun.get(i)).get(0));
                System.out.println("NIM\t\t\t: " + dataPrestasi.get(indexTahun.get(i)).get(1));
                System.out.println("Jenis Prestasi\t\t: " + dataPrestasi.get(indexTahun.get(i)).get(2));
                System.out.println("Tingkat Prestasi\t: " + dataPrestasi.get(indexTahun.get(i)).get(3));
                System.out.println("Tahun Prestasi\t\t: " + dataPrestasi.get(indexTahun.get(i)).get(4));
                System.out.println("=====================================");
            }
        }
    }

    static void tampilkanPrestasiTingkat(int[] dataTingkat) {
        System.out.println("======Data Prestasi Per Tingkat======");
        System.out.println("Lokal\t\t: " + dataTingkat[0]);
        System.out.println("Nasional\t: " + dataTingkat[1]);
        System.out.println("Internasional\t: " + dataTingkat[2]);
    }

    static List<Integer> getIndexTahun(List<List<String>> dataPrestasi, int tahun) {
        List<Integer> indexByTahun = new ArrayList<>();

        for (int i = 0; i < dataPrestasi.size(); i++) {
            int tahunInt = Integer.parseInt(dataPrestasi.get(i).get(4));
            if (tahun == tahunInt) {
                indexByTahun.add(i);
            }
        }
        return indexByTahun;
    }

    static int[] getByTingkat(List<List<String>> dataPrestasi) {
        int[] getByTingkat = { 0, 0, 0 };
        for (int i = 0; i < dataPrestasi.size(); i++) {
            if (dataPrestasi.get(i).get(3).equals("Lokal")) {
                ++getByTingkat[0];
            } else if (dataPrestasi.get(i).get(3).equals("Nasional")) {
                ++getByTingkat[1];
            } else if (dataPrestasi.get(i).get(3).equals("Internasional")) {
                ++getByTingkat[2];
            }
        }
        return getByTingkat;
    }

}
