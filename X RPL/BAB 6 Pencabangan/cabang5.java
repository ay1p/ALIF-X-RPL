import java.util.Scanner;

public class cabang5 {
    public static void main(String[] args ) {

        // membuat scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan angka (1-7): ");
        int angka = scanner.nextInt();

        // menentukan hari berdasarkan angka menggunakan percabangan if-else
        String namaHari;

        if (angka == 1) {
            namaHari = "Minggu";
        } else if (angka == 2) {
            namaHari = "senin";
        } else if (angka == 3) {
            namaHari = "selasa";
        } else if (angka == 4) {
            namaHari = "rabu";
        } else if (angka == 5) {
            namaHari = "kamis";
        } else if (angka == 6) {
            namaHari = "jumat";
        } else if (angka == 7) {
            namaHari = "sabtu";
        } else {
            namaHari = "input tidak valid harap masukkan angka antara 1 hingga 7:";

        }
        // menampilkan hasil
        System.out.println("Hari: " + namaHari);

        // menutup scanner
        scanner.close();
    }
}