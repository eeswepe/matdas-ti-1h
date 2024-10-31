import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String keyBiner = "10101010";
        int keyDesimal = 0;

        // Mengonversi kunci dari biner ke desimal
        for(int i = 0; i < keyBiner.length();i++){
            char bit = keyBiner.charAt(keyBiner.length() - 1 -i);
            if (bit == '1') {
                keyDesimal += 1 << i;
            }
        }

        System.out.print("Masukkan bilangan biner untuk dienkripsi : ");
        String biner = sc.nextLine();

        // Konversi input biner ke desimal
        int desimal = 0;
        for (int i = 0; i < biner.length(); i++){
            char bit = biner.charAt(biner.length() - 1 - i );
            if (bit == '1') {
                desimal += 1 << i;
            }
        }
        // Lakukan operasi XOR dengan kunci
        int xor = desimal ^ keyDesimal;

        // Konversi hasil XOR ke biner
        String hasilBiner = "";
        int konvert = xor;
        if (konvert == 0) {
            hasilBiner = "0";
        } else {
            while (konvert > 0) {
                hasilBiner = (konvert % 2) + hasilBiner;
                konvert /= 2;
            }
        }

        // Konvert hasil XOR ke heksa
        String hasilHeks = "";
        konvert = xor;
        if (konvert == 0) {
            hasilHeks = "0";
        } else {
            String simbolHex = "0123456789ABCDEF";
            while (konvert > 0) {
                hasilHeks = simbolHex.charAt(konvert % 16 ) + hasilHeks;
                konvert /= 16;
            }
        }
        System.out.println("Hasil Enkripsi (Biner) = " + hasilBiner);
        System.out.println("Hasil Enkripsi (Heksadesimal) = " + hasilHeks);
    }
}
