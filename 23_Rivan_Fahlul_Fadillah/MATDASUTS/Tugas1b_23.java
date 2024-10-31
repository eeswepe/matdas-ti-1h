import java.util.Scanner;
/**
 * Tugas1b_23
 */
public class Tugas1b_23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                System.out.print("Masukkan bilangan biner: ");
                String biner = sc.nextLine();
        
                // Konversi biner ke desimal
                int desimal = 0;
                int panjang = biner.length();
        
                for (int i = 0; i < panjang; i++) {
                    char bit = biner.charAt(panjang - 1 - i); // Ambil bit dari belakang
                    if (bit == '1') {
                        desimal += 1 << i; // 2^i
                    }
                }
                // Menampilkan hasil desimal
                System.out.println("Desimal: " + desimal);
        
                // Konversi desimal ke heksadesimal
                char[] heksadesimal = new char[8]; // Maksimal 8 karakter untuk heksadesimal
                int indexHeksadesimal = 0;
        
                if (desimal == 0) {
                    heksadesimal[indexHeksadesimal++] = '0';
                } else {
                    while (desimal > 0) {
                        int sisa = desimal % 16; // Sisa bagi
                        if (sisa < 10) {
                            heksadesimal[indexHeksadesimal++] = (char) ('0' + sisa);
                        } else {
                            heksadesimal[indexHeksadesimal++] = (char) ('A' + (sisa - 10)); // Untuk A-F
                        }
                        desimal /= 16; // Bagi desimal dengan 16
                    }
                }
        
                // Menampilkan hasil heksadesimal dalam urutan yang benar
                System.out.print("Heksadesimal: ");
                for (int i = indexHeksadesimal - 1; i >= 0; i--) {
                    System.out.print(heksadesimal[i]);
                }
                System.out.println();
    }
}
