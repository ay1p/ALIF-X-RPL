import java.util.Scanner;

public class tugas13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // menampilkan pertanyaan
        System.out.println("Berikut ini manakah yang termasuk jeniss operator java?");
        System.out.println("1 Operator Indosat");
        System.out.println("2 Operator Aritmatika");
        System.out.println("3 Operator Telkomsel");
        System.out.println("4 Operator Assignment");

        // meminta input pengguna
        System.out.println("Masukkan nomor jawaban (1-4): ");
        int jawaban = scanner.nextInt();

        // mengecek jawaban
        if (jawaban == 2 || jawaban == 4)  {;
            System.out.println("Jawaban anda benar!");
        } else {
            System.out.println("Jawaban anda salah. jawaban yang benar adalah: Operator Aritmatika dan Operator Assignment.");
        }
        // menutup scanner
        scanner.close();

    }
    
}
