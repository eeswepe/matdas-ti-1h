import java.util.Scanner;

public class no4 {

    // Fungsi XOR manual antara dua bit (char)
    public static char xorBit(char bit1, char bit2) {
        return (bit1 == bit2) ? '0' : '1';
    }

    // Fungsi XOR manual untuk string biner dengan kunci
    public static String binaryXor(String bin, String key) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < bin.length(); i++) {
            char bit1 = bin.charAt(i);
            char bit2 = key.charAt(i % key.length()); // Jika kunci lebih pendek, ulangi dari awal
            result.append(xorBit(bit1, bit2));
        }
        return result.toString();
    }

    // Fungsi konversi biner ke heksadesimal manual
    public static String binaryToHexadecimal(String binary) {
        StringBuilder hex = new StringBuilder();
        int length = binary.length();
        
        // Menambahkan nol di depan agar panjangnya kelipatan 4
        while (length % 4 != 0) {
            binary = "0" + binary;
            length++;
        }

        // Mengonversi setiap 4 bit biner menjadi 1 digit heksadesimal
        for (int i = 0; i < binary.length(); i += 4) {
            String nibble = binary.substring(i, i + 4);
            hex.append(binaryNibbleToHex(nibble));
        }
        return hex.toString();
    }

    // Fungsi konversi 4 bit biner (nibble) ke 1 digit heksadesimal
    public static char binaryNibbleToHex(String nibble) {
        int decimalValue = 0;
        int power = 0;

        // Menghitung nilai desimal dari nibble biner
        for (int i = nibble.length() - 1; i >= 0; i--) {
            int bit = nibble.charAt(i) - '0';
            decimalValue += bit * Math.pow(2, power);
            power++;
        }

        // Mengonversi nilai desimal ke karakter heksadesimal
        if (decimalValue < 10) {
            return (char) (decimalValue + '0');
        } else {
            return (char) (decimalValue - 10 + 'A');
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan data biner untuk dienkripsi: ");
        String data = scanner.next();

        System.out.print("Masukkan kunci biner untuk enkripsi (harus memiliki panjang yang sama atau lebih pendek dari data): ");
        String key = scanner.next();

        // Memastikan panjang kunci tidak lebih panjang dari data
        if (key.length() > data.length()) {
            System.out.println("Kunci lebih panjang dari data. Silakan masukkan kunci yang panjangnya sama atau lebih pendek.");
            return;
        }

        // Melakukan operasi XOR manual
        String encryptedBinary = binaryXor(data, key);
        String encryptedHexadecimal = binaryToHexadecimal(encryptedBinary);

        System.out.println("Data terenkripsi dalam biner: " + encryptedBinary);
        System.out.println("Data terenkripsi dalam heksadesimal: " + encryptedHexadecimal);

        scanner.close();
    }
}
