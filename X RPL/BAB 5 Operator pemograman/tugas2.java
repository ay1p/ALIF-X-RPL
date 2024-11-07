import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tugas2 {
    public static void main(String[] args) {
        BufferedReader reader = new
        BufferedReader(new InputStreamReader(System.in));

        try {
            // mengambil input untuk a 
            System.out.println("Masukkan nilai a: ");
            String inputA = reader.readLine();
            double a = Double.parseDouble(inputA);

            // mengambil input untuk b
            System.out.println("Masukkan nilai b: ");
            String inputB = reader.readLine();
            double b = Double.parseDouble(inputB);

            // mengambil input untuk c
            System.out.println("Masukkan nilai c: ");
            String inputC = reader.readLine();
            double c = Double.parseDouble(inputC);

            // menghitung nilai abc
            double hasil = a * b * c;

            // menampilkan hasil
            System.out.println("Hasil dari " + a + " * " + b + " * " + c + " = " + hasil);
        }   catch (IOException e) {
            System.out.println("input tidak valid. Pastikan Anda memasukkan angka.");
            

        }    
    }
}