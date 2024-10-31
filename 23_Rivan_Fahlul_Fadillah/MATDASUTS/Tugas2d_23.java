import java.util.Scanner;
/**
 * Tugas2d_23
 */
public class Tugas2d_23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                System.out.print("Masukkan bilangan biner pertama: ");
                String biner1 = sc.nextLine();
                System.out.print("Masukkan bilangan biner kedua: ");
                String biner2 = sc.nextLine();
        
                // Menentukan panjang maksimum
                int maxLength = Math.max(biner1.length(), biner2.length());
                
                // Menambahkan nol di depan jika panjang biner berbeda
                String hasilAnd = "";
                String hasilOr = "";
                String hasilXor = "";
        
                // Melakukan operasi biner
                for (int i = 0; i < maxLength; i++) {
                    char bit1 = (i < biner1.length()) ? biner1.charAt(biner1.length() - 1 - i) : '0';
                    char bit2 = (i < biner2.length()) ? biner2.charAt(biner2.length() - 1 - i) : '0';
        
                    // Operasi AND
                    hasilAnd = ((bit1 == '1' && bit2 == '1') ? '1' : '0') + hasilAnd;
                    // Operasi OR
                    hasilOr = ((bit1 == '1' || bit2 == '1') ? '1' : '0') + hasilOr;
                    // Operasi XOR
                    hasilXor = ((bit1 != bit2) ? '1' : '0') + hasilXor;
                }
        
                // Menampilkan hasil
                System.out.println("Hasil Operasi Biner:");
                System.out.println("Operasi AND: " + biner1 + " AND " + biner2 + " = " + hasilAnd);
                System.out.println("Operasi OR: " + biner1 + " OR " + biner2 + " = " + hasilOr);
                System.out.println("Operasi XOR: " + biner1 + " XOR " + biner2 + " = " + hasilXor);
    }
}
