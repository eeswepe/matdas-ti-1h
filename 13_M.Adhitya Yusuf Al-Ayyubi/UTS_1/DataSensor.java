import java.util.Scanner;
public class DataSensor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan suhu (°C): ");
        int suhu = (int) scanner.nextDouble();
        System.out.print("Masukkan kelembapan (%): ");
        int kelembapan = scanner.nextInt();
        System.out.print("Masukkan CO2 (ppm): ");
        int co2 = scanner.nextInt();

        System.out.println("\nKonversi Suhu (°C): " + suhu);
        System.out.print("Biner: ");
        cetakBinar(suhu);
        System.out.print("\nHeksadesimal: ");
        cetakHexadesimal(suhu);

        System.out.println("\n\nKonversi Kelembapan (%): " + kelembapan);
        System.out.print("Biner: ");
        cetakBinar(kelembapan);
        System.out.print("\nHeksadesimal: ");
        cetakHexadesimal(kelembapan);

        System.out.println("\n\nKonversi CO2 (ppm): " + co2);
        System.out.print("Biner: ");
        cetakBinar(co2);
        System.out.print("\nHeksadesimal: ");
        cetakHexadesimal(co2);

        scanner.close();
    }

    public static void cetakBinar(int number) {
        int[] binar = new int[32];
        int index = 0;

        if (number == 0) {
            System.out.print("0");
            return;
        }

        while (number > 0) {
            binar[index++] = number % 2;
            number /= 2;
        }

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binar[i]);
        }
    }

    public static void cetakHexadesimal(int number) {
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] hexArray = new char[8];
        int index = 0;

        if (number == 0) {
            System.out.print("0");
            return;
        }

        while (number > 0) {
            hexArray[index++] = hexChars[number % 16];
            number /= 16;
        }

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(hexArray[i]);
        }
    }
}
