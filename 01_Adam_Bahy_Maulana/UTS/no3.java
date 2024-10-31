import java.util.Scanner;

public class no3 {

    // Fungsi pembulatan ke atas (ceiling) manual
    public static int manualCeil(double value) {
        int intValue = (int) value;
        if (value > intValue) {
            return intValue + 1;
        }
        return intValue;
    }

    // Fungsi pembulatan ke bawah (floor) manual
    public static int manualFloor(double value) {
        return (int) value;
    }

    // Fungsi konversi desimal ke biner manual
    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        if (decimal == 0)
            return "0";

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }
        return binary.toString();
    }

    // Fungsi konversi desimal ke heksadesimal manual
    public static String decimalToHexadecimal(int decimal) {
        StringBuilder hexadecimal = new StringBuilder();
        char[] hexSymbols = "0123456789ABCDEF".toCharArray();
        if (decimal == 0)
            return "0";

        while (decimal > 0) {
            int remainder = decimal % 16;
            hexadecimal.insert(0, hexSymbols[remainder]);
            decimal /= 16;
        }
        return hexadecimal.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dan konversi suhu
        System.out.print("Masukkan suhu (dalam celcius): ");
        double temperature = scanner.nextDouble();

        int roundedTemperatureUp = manualCeil(temperature);
        int roundedTemperatureDown = manualFloor(temperature);

        System.out.println("\nSuhu dibulatkan ke atas: " + roundedTemperatureUp);
        System.out.println("Suhu dalam biner (pembulatan ke atas): " + decimalToBinary(roundedTemperatureUp));
        System.out
                .println("Suhu dalam heksadesimal (pembulatan ke atas): " + decimalToHexadecimal(roundedTemperatureUp));

        System.out.println("\nSuhu dibulatkan ke bawah: " + roundedTemperatureDown);
        System.out.println("Suhu dalam biner (pembulatan ke bawah): " + decimalToBinary(roundedTemperatureDown));
        System.out.println(
                "Suhu dalam heksadesimal (pembulatan ke bawah): " + decimalToHexadecimal(roundedTemperatureDown));

        // Input dan konversi kelembapan
        System.out.print("\nMasukkan kelembapan (persentase tanpa desimal): ");
        int humidity = scanner.nextInt();

        System.out.println("\nKelembapan dalam biner: " + decimalToBinary(humidity));
        System.out.println("Kelembapan dalam heksadesimal: " + decimalToHexadecimal(humidity));

        // Input dan konversi CO₂
        System.out.print("\nMasukkan kadar CO2 (ppm tanpa desimal): ");
        int co2 = scanner.nextInt();

        System.out.println("\nCO2 dalam biner: " + decimalToBinary(co2));
        System.out.println("CO2 dalam heksadesimal: " + decimalToHexadecimal(co2));
        System.out.println();
    }
}
