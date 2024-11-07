import java.util.Scanner;

public class java16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.println("Masukkan nilai siswa: ");
        int nilai = scanner.nextInt();

        // Menggunakan operator ternary untuk menentukan kenaikan kelas 
        String hasil = (nilai >= 75) ? "Naik kelas" : "Tidak Naik Kelas";

        // Menampilkan hasil 
        System.out.println("Hasil: " + hasil);

        // Menutup scanner
        scanner.close();
    }
    
}
