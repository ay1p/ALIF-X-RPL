import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //menerima inputan
        System.out.print("Nama Lengkap");
        String namaLengkap = input.nextLine();

        System.out.print("NIS");
        int nis = input.nextInt();

        System.out.print("umur");
        int umur = input.nextInt();

        //menampilkan output
        System.out.println("Nama Lengkap: " + namaLengkap);
        System.out.println("NIS: " + nis);
        System.out.println("umur: " + umur);
    }
    
}
