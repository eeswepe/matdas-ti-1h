import java.util.Scanner;
/**
 *     Tugas1a_23
 */
public class Tugas1a_23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
                System.out.print("Masukkan angka dalam desimal: ");
                int desimal = sc.nextInt();
        
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
        
                // Cetak hasil biner dalam urutan yang benar
                System.out.print("Biner: ");
                for (int i = indexBiner - 1; i >= 0; i--) {
                    System.out.print(biner[i]);
                }
                System.out.println();
        
                // Reset desimal untuk konversi ke heksadesimal
                System.out.print("Masukkan angka dalam desimal untuk heksadesimal: ");
                desimal = sc.nextInt();
                
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
        
                // Cetak hasil heksadesimal dalam urutan yang benar
                System.out.print("Heksadesimal: ");
                for (int i = indexHeksadesimal - 1; i >= 0; i--) {
                    System.out.print(heksadesimal[i]);
                }
                System.out.println();
            }
        }
        