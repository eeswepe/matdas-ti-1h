import java.util.Scanner;
public class Soal406 {
    public static void main(String[] args) {
        // Bilangan biner yang akan dienkripsi
        Scanner sc = new Scanner(System.in);
        String binary1 = sc.nextLine(); // Bilangan biner pertama
        String binary2 = sc.nextLine(); // Bilangan biner kedua
        String key = sc.nextLine();      // Kunci untuk enkripsi

        // Melakukan enkripsi dengan XOR
        String encrypted1 = xorBinary(binary1, key);
        String encrypted2 = xorBinary(binary2, key);

        // Menampilkan hasil enkripsi
        System.out.println("Hasil Enkripsi:");
        System.out.println("Binary 1: " + binary1);
        System.out.println("Key: " + key);
        System.out.println("Encrypted Binary 1: " + encrypted1);
        System.out.println("Encrypted Binary 2: " + encrypted2);

        // Konversi hasil enkripsi ke heksadesimal
        String encrypted1Hex = Integer.toHexString(Integer.parseInt(encrypted1, 2)).toUpperCase();
        String encrypted2Hex = Integer.toHexString(Integer.parseInt(encrypted2, 2)).toUpperCase();

        // Menampilkan hasil dalam heksadesimal
        System.out.println("Encrypted Binary 1 (Hex): " + encrypted1Hex);
        System.out.println("Encrypted Binary 2 (Hex): " + encrypted2Hex);
    }

    // Fungsi untuk melakukan operasi XOR pada dua bilangan biner
    public static String xorBinary(String binary, String key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < binary.length(); i++) {
            char bit1 = binary.charAt(i);
            char bit2 = key.charAt(i);
            // XOR operation
            result.append((bit1 == bit2) ? '0' : '1');
        }

        return result.toString();
    }
}