import java.util.Scanner;
/**
 * Bagian3
 */
public class Bagian3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan binnary 1: ");
        String binary1 = sc.nextLine();
        System.out.print("Masukkan binnary 2: ");
        String binary2 = sc.nextLine() ;
        System.out.print("Masukkan key: ");
        String key = sc.nextLine(); 

        
        String encrypted1 = xorBinary(binary1, key);
        String encrypted2 = xorBinary(binary2, key);

        
        String encrypted1Hex = Integer.toHexString(Integer.parseInt(encrypted1, 2));
        String encrypted2Hex = Integer.toHexString(Integer.parseInt(encrypted2, 2));

        
        System.out.println("Hasil Enkripsi:");
        System.out.println("Bilangan Biner 1: " + binary1);
        System.out.println("Kunci: " + key);
        System.out.println("Hasil Enkripsi (Biner): " + encrypted1);
        System.out.println("Hasil Enkripsi (Heksadesimal): " + encrypted1Hex.toUpperCase());

        System.out.println("Bilangan Biner 2: " + binary2);
        System.out.println("Kunci: " + key);
        System.out.println("Hasil Enkripsi (Biner): " + encrypted2);
        System.out.println("Hasil Enkripsi (Heksadesimal): " + encrypted2Hex.toUpperCase());
    }

    
    public static String xorBinary(String binary, String key) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < binary.length(); i++) {
            
            char bit = (binary.charAt(i) == key.charAt(i)) ? '0' : '1';
            result.append(bit);
        }
        return result.toString();
    }
}