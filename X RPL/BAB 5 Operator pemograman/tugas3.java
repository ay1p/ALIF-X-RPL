import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //menerima inputan
        System.out.print("Masukkan Jenis Kelamin (L/P): ");
        char jenisKelamin = input.nextLine().toUpperCase().charAt(0);

        System.out.print("Masukkan Nomor Sepatu: ");
        int nomorSepatu = input.nextInt();
        
        input.nextLine(); // Membersihkan buffer

        System.out.print("Sudah Menikah? (true/false): ");
        boolean sudahMenikah = input.nextBoolean();

        //menerima inputan
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Nomor Sepatu: " + nomorSepatu);
        System.out.println("Sudah Menikah: " + sudahMenikah);
        input.close();       
    }   
}
