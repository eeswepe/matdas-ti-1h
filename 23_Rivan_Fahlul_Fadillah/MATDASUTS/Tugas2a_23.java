import java.util.Scanner;
/**
 * Tugas2a_23
 */
public class Tugas2a_23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
                System.out.print("Masukkan bilangan biner pertama: ");
                String biner1 = sc.nextLine();
                System.out.print("Masukkan bilangan biner kedua: ");
                String biner2 = sc.nextLine();
        
                // Penjumlahan biner
                String hasilPenjumlahan = penjumlahanBiner(biner1, biner2);
        
                System.out.println("Hasil Penjumlahan Biner:");
                System.out.println(biner1 + " + " + biner2 + " = " + hasilPenjumlahan);
            }
        
            // Metode untuk menjumlahkan dua bilangan biner
            private static String penjumlahanBiner(String biner1, String biner2) {
                int maxLength = Math.max(biner1.length(), biner2.length());
                StringBuilder hasil = new StringBuilder();
                int carry = 0;
        
                for (int i = 0; i < maxLength; i++) {
                    int bit1 = (i < biner1.length()) ? biner1.charAt(biner1.length() - 1 - i) - '0' : 0;
                    int bit2 = (i < biner2.length()) ? biner2.charAt(biner2.length() - 1 - i) - '0' : 0;
        
                    int sum = bit1 + bit2 + carry;
                    hasil.append(sum % 2);
                    carry = sum / 2;
                }
        
                if (carry != 0) {
                    hasil.append(carry);
                }
        
                return hasil.reverse().toString();
    }
}
