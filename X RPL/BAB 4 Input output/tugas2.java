import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input
        System.out.print("Nama Sekolah: ");
        String namaSekolah = input.nextLine();

        System.out.print("Jarak Rumah Ke sekolah");
        double jarak = input.nextDouble();

        System.out.print("Plat Nomor");
        int platNomor = input.nextInt();

        System.out.println("Anak ke");
        int anakKE = input.nextInt();

        // output
        System.out.println("Nama Sekolah: " + namaSekolah);

    }
}
