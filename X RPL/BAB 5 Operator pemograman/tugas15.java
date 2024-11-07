import java.util.Scanner;

public class tugas15 {
    public static void main(String[] args) {

        // membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai a
        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();

        // meminta pengguna untuk memasukkan nilai b
        System.out.println("Masukkan nilai b: ");
        int b = scanner.nextInt();

        // Melakukan operasi left shift pada a
        int leftShiftResult = a << 2;

        // melakukan operasi right shift pada b
        int rightShiftResult = b >> 2;

        // menampilkan hasil
        System.out.println("Hasil left shift (a << 2): ");
        System.out.println("Hasil right shift (b >> 2): " + rightShiftResult);

        // Menutup scanner
        scanner.close();
    }
}
