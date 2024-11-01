import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        Scanner prasojo = new Scanner(System.in);

        System.out.println("============================================================================");
        System.out.println("-                           UTS MATEMATIKA DASAR                           -");
        System.out.println("============================================================================");
        // Input bilangan biner
        System.out.print("Masukkan bilangan biner pertama (8 bit): ");
        String biner1 = prasojo.next();
        System.out.print("Masukkan bilangan biner kedua (8 bit): ");
        String biner2 = prasojo.next();
        System.out.print("Masukkan kunci (8 bit): ");
        String kunci = prasojo.next();
        System.out.println("============================================================================");
        // Pastikan panjang biner dan kunci 8 bit
        if (biner1.length() != 8 || biner2.length() != 8 || kunci.length() != 8) {
            System.out.println("Semua input harus berupa 8 bit!");
            System.out.println("============================================================================");
            return; // Keluar jika input tidak valid
        }

        // Proses enkripsi menggunakan XOR
        String hasilXOR = "";
        for (int i = 0; i < 8; i++) {
            char bit1 = biner1.charAt(i); // Ambil bit dari biner1
            char bit2 = biner2.charAt(i); // Ambil bit dari biner2
            char bitKunci = kunci.charAt(i); // Ambil bit dari kunci

            // Operasi XOR
            char hasilBit = (char) ((bit1 - '0') ^ (bit2 - '0') ^ (bitKunci - '0') + '0');
            hasilXOR += hasilBit; // Tambahkan hasil bit ke hasilXOR
        }

        // Konversi hasilXOR ke desimal
        int decimalHasilXOR = 0;
        for (int i = 0; i < 8; i++) {
            if (hasilXOR.charAt(i) == '1') {
                decimalHasilXOR += (1 << (7 - i)); // Menghitung nilai desimal
            }
        }

        // Konversi desimal ke heksadesimal
        String heksadesimalHasilXOR = "";
        while (decimalHasilXOR > 0) {
            int sisa = decimalHasilXOR % 16; // Ambil sisa bagi 16
            if (sisa < 10) {
                heksadesimalHasilXOR = sisa + heksadesimalHasilXOR; // Tambahkan angka 0-9
            } else {
                heksadesimalHasilXOR = (char) ('A' + (sisa - 10)) + heksadesimalHasilXOR; // Tambahkan huruf A-F
            }
            decimalHasilXOR /= 16; // Mengurangi nilai desimal
        }
        // Tampilkan hasil
        System.out.println();
        System.out.println("Hasil Enkripsi:");
        System.out.println(" - Biner: " + hasilXOR);
        System.out.println(" - Heksadesimal: " + heksadesimalHasilXOR);
        System.out.println("============================================================================");        
        prasojo.close();
    }
}