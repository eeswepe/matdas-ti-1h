import java.util.Scanner;

public class pengolahanDataSensor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai suhu (°C): ");
        double suhu = sc.nextDouble();
        System.out.print("Masukkan nilai kelembapan (%): ");
        int kelembapan = sc.nextInt();
        System.out.print("Masukkan nilai CO2 (ppm): ");
        int co2 = sc.nextInt();

        int suhuInteger = (int) Math.round(suhu);
        String suhuBinary = decimalToBinary(suhuInteger);
        String suhuHexadecimal = decimalToHexadecimal(suhuInteger);

        String kelembapanBinary = decimalToBinary(kelembapan);
        String kelembapanHexadecimal = decimalToHexadecimal(kelembapan);

        String co2Binary = decimalToBinary(co2);
        String co2Hexadecimal = decimalToHexadecimal(co2);

        System.out.println("\nHasil Konversi Data Sensor:");
        System.out.println("Suhu: " + suhuInteger + " °C");
        System.out.println("Biner\t\t: " + suhuBinary);
        System.out.println("Heksadesimal\t: " + suhuHexadecimal);
        System.out.println("====================================");
        System.out.println("Kelembapan: " + kelembapan + " %");
        System.out.println("Biner\t\t: " + kelembapanBinary);
        System.out.println("Heksadesimal\t: " + kelembapanHexadecimal);
        System.out.println("====================================");
        System.out.println("CO2: " + co2 + " ppm");
        System.out.println("Biner\t\t: " + co2Binary);
        System.out.println("Heksadesimal\t: " + co2Hexadecimal);
    }

    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static String decimalToHexadecimal(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }
}
