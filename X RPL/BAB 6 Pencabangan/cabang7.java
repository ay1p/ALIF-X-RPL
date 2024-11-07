import java.util.InputMismatchException;
import java.util.Scanner;

public class cabang7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka kedua: ");
            double inputAngka1 = scanner.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double inputAngka2 = scanner.nextDouble();

            // menggunakan percabangan untuk menentukan angka terbesar
            if (inputAngka1 > inputAngka2 ) {
                System.out.println("Angka terbesar adalah: " + inputAngka1);
            } else if (inputAngka2 > inputAngka1) {
                System.out.println("Angka terbesar adalah: " + inputAngka2);
            } else {
                System.out.println("kedua angka sama.");
            }
        
        } catch (InputMismatchException e) {
            System.out.println("silakan masukkan angka yang valid.");
        }finally {
            scanner.close(); // menutup scanner


        }
    }
}