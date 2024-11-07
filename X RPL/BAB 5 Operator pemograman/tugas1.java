import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan nama lengkap");
        String namaLengkap = input.nextLine();

        System.out.print("Inputkan usia");
        int usia = input.nextInt();

        System.out.print("Inputkan kota asal");
        String kotaAsal = input.nextLine();

        System.out.print("Inputkan tinggi badan");
        double tinggiBadan = input.nextDouble();

        // menampilkan output
        System.out.println("\n===== Output =====");
        System.out.println("Nama: " + namaLengkap);
        System.out.println("Angka: " + usia);
        System.out.println("kota asal: " + kotaAsal);
        System.out.println("tinggi badan: " + tinggiBadan);

    }
}