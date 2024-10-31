import java.util.Scanner;
/**
 * Tugas1c_23
 */
public class Tugas1c_23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Konversi Heksadesimal ke Desimal dan Biner
        System.out.print("Masukkan bilangan heksadesimal: ");
        String heksadesimal = sc.nextLine();
        
        // Konversi heksadesimal ke desimal
        int desimal = 0;
        int panjang = heksadesimal.length();

        for (int i = 0; i < panjang; i++) {
            char digit = heksadesimal.charAt(panjang - 1 - i); // Ambil digit dari belakang
            int nilai;

            if (digit >= '0' && digit <= '9') {
                nilai = digit - '0'; // Konversi karakter ke nilai desimal
            } else {
                nilai = digit - 'A' + 10; // Konversi A-F ke nilai desimal
            }
            desimal += nilai * (1 << (i * 4)); // 16^i = 2^(i*4)
        }

        // Konversi desimal ke biner
        char[] biner = new char[32]; // Maksimal 32 bit untuk biner
        int indexBiner = 0;

        if (desimal == 0) {
            biner[indexBiner++] = '0';
        } else {
            while (desimal > 0) {
                biner[indexBiner++] = (char) ('0' + (desimal % 2)); // Simpan biner
                desimal /= 2; // Bagi desimal dengan 2
            }
        }

        // Menampilkan hasil biner dalam urutan yang benar
        System.out.print("Desimal dari heksadesimal: " + (desimal + (1 << (indexBiner * 4))));
        System.out.print("\nBiner dari heksadesimal: ");
        for (int i = indexBiner - 1; i >= 0; i--) {
            System.out.print(biner[i]);
        }
        System.out.println();
    }
}
