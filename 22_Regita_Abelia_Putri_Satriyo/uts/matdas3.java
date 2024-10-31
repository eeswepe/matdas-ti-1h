public class matdas3 {

    public static void main(String[] args) {
        // Data sensor
        double suhu = 28.6;
        int kelembapan = 65;
        int co2 = 420;

        // Konversi ke biner
        String suhuBiner = decimalToBinary(suhu);
        String kelembapanBiner = decimalToBinary(kelembapan);
        String co2Biner = decimalToBinary(co2);

        // Konversi ke heksadesimal
        String suhuHex = decimalToHex(suhu);
        String kelembapanHex = decimalToHex(kelembapan);
        String co2Hex = decimalToHex(co2);

        // Tampilkan hasil
        System.out.println("Suhu:");
        System.out.println("Desimal: " + suhu);
        System.out.println("Biner: " + suhuBiner);
        System.out.println("Hexadecimal: " + suhuHex);

        System.out.println("\nKelembapan:");
        System.out.println("Desimal: " + kelembapan);
        System.out.println("Biner: " + kelembapanBiner);
        System.out.println("Hexadecimal: " + kelembapanHex);

        System.out.println("\nCO2:");
        System.out.println("Desimal: " + co2);
        System.out.println("Biner: " + co2Biner);
        System.out.println("Hexadecimal: " + co2Hex);
    }

    // Konversi desimal ke biner
    private static String decimalToBinary(double decimal) {
        // Konversi bagian integer
        long integerPart = (long) decimal;
        String integerBinary = "";
        while (integerPart > 0) {
            integerBinary = (integerPart % 2) + integerBinary;
            integerPart /= 2;
        }

        // Konversi bagian fraksional
        double fractionalPart = decimal - (long) decimal;
        String fractionalBinary = ".";
        for (int i = 0; i < 8; i++) {
            fractionalPart *= 2;
            if (fractionalPart >= 1) {
                fractionalBinary += "1";
                fractionalPart -= 1;
            } else {
                fractionalBinary += "0";
            }
        }

        return integerBinary + fractionalBinary;
    }

    // Konversi desimal ke heksadesimal
    private static String decimalToHex(double decimal) {
        // Konversi bagian integer
        long integerPart = (long) decimal;
        String integerHex = "";
        while (integerPart > 0) {
            char hexChar = (char) ((integerPart % 16) + '0');
            if (hexChar > '9') {
                hexChar = (char) (hexChar + 'A' - '9' - 1);
            }
            integerHex = hexChar + integerHex;
            integerPart /= 16;
        }

        // Konversi bagian fraksional
        double fractionalPart = decimal - (long) decimal;
        String fractionalHex = ".";
        for (int i = 0; i < 4; i++) {
            fractionalPart *= 16;
            char hexChar = (char) ((long) fractionalPart + '0');
            if (hexChar > '9') {
                hexChar = (char) (hexChar + 'A' - '9' - 1);
            }
            fractionalHex += hexChar;
            fractionalPart -= (long) fractionalPart;
        }

        return integerHex + fractionalHex;
    }
}